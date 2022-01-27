const fs = require("fs")
const addData = (newNote) => {
    notes = loadData()
        //console.log(notes)
    const duplicateNote = notes.find((note) => {
        return note.title === newNote.title
    })
    if (!duplicateNote) {
        notes.push(newNote)
        saveData(notes)
        console.log("Data added successfully")
    } else {
        console.log("Cannot save!!! \nDuplicate Data title find")
            //saveData(notes)
    }
}

const findData = (title) => {
    notes = loadData()
    const res = notes.find((note) => {
        if (title === note.title) {
            return note
        }
    })
    if (res)
        console.log(res)
    else
        console.log("The Data does not exists")
}

const listData = () => {
    notes = loadData()
    if (notes != []) {
        console.log("The Datas are:")
        notes.forEach((note) => {
            console.log("Title: " + note.title + ", ", "Deadline: " + note.deadline)
        })
    } else {
        console.log("You have no Datas present")
    }
}

const removeData = (title) => {
    notes = loadData()
    const newNotes = notes.filter((note) => {
        if (note.title !== title)
            return note
    })
    if (newNotes.length === notes.length)
        console.log("No Data data deleted")
    else {
        console.log("Data Data removed")
        saveData(newNotes)
    }
}

const saveData = (notes) => {
    fs.writeFileSync("Data.json", JSON.stringify(notes))
}

const loadData = () => {
    try {
        const dataBuffer = fs.readFileSync('Data.json')
        const dataJson = dataBuffer.toString()
        return JSON.parse(dataJson)
    } catch (e) {
        return []
    }
}

module.exports = { addData, findData, listData, removeData }