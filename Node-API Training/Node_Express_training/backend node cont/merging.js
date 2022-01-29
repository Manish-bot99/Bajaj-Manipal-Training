//3. merge two files with sync write

const os = require("os")
const path = require("path")
const fs = require("fs")

const filePath1 = path.join(__dirname, './sample2.txt')
const filePath2 = path.join(__dirname, './writeasync.txt')

const data1 = fs.readFileSync(filePath1)
const data2 = fs.readFileSync(filePath2)

fs.writeFileSync(filePath2, data1)