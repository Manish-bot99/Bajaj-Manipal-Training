// const loadash = require("lodash")
const yargs = require("yargs")
const argv = yargs.argv
const command = argv._[0]
const title = argv._[1]
const date = argv._[2]
console.log(command, title, date)
if (command === "add") {

    add(title, data)

}

//addNote()
// title: complete training deadline: 23 / 01 / 2022
//viewNote
// view