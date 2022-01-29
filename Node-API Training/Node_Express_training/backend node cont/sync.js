const fs = require("fs")
const path = require("path")
    // console.log(filepath)
    // const data = fs.readFileSync(filepath, "utf-8")
    // console.log(data)
const os = require("os")
const os_data1 = { type: ["desc", os.type()] }
const os_data = { type: ["desc", os.type()], uptime: ["desc", os.uptime()], release: ["desc", os.release()], totalmem: ["desc", os.totalmem()], freemem: ["desc", os.freemem()], endianness: ["desc", os.endianness()], platform: ["desc", os.platform()] }
fs.writeFileSync('./sample2.txt', JSON.stringify(os_data))
const filepath = path.join('./sample2.txt')
const filePath = path.join(__dirname, './sample2.txt')

let arr = [1, 2, 3, 4, 5]

let a = 10
let b = 2.5
fs.appendFileSync(filePath, "\n" + String(arr))
fs.appendFileSync(filePath, "\n" + String(a))
fs.appendFileSync(filePath, "\n" + String(b))
console.log(fs.readFileSync(filepath, "utf-8"))