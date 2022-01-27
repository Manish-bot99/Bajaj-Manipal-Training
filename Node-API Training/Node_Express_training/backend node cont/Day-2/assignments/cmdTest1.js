const { addData, findData, listData, removeData } = require("./loadingJson")

const yargs = require("yargs")
const argv = yargs.argv
const command = argv._[0]
const title = argv._[1]
const deadline = argv._[2]
if (command == "add") {
    if (title && deadline) {
        newNote = { title: title, deadline: deadline }
        console.log("Adding the Data Details")
        addData(newNote)
    } else {
        console.log("Please provide a title and a deadline")
    }
}

if (command == 'find') {
    const title = argv._[1]
    if (title) {
        findData(title)
    } else {
        console.log("Please provide a Data title")
    }
}

if (command == 'list') {
    listData()
}

if (command == 'remove') {
    const title = argv._[1]
    if (title) {
        removeData(title)
    } else {
        console.log("Please provide a Data title")
    }
}