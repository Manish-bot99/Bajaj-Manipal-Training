const fs = require("fs")
    // fs.readFile('./sample2.txt', 'utf-8', (err, data) => {
    //     if (err) { console.log(err) }
    //     console.log(data)
    // })
    // setTimeout(() => console.log('hello'), 2000)
const tes = "Read and write using async"
fs.writeFile("./writeasync.txt", tes, (err, result) => {
    if (err) {
        console.log(err.code)
        if (err.code) {
            console.log("no such dir found")
        }
    }
})