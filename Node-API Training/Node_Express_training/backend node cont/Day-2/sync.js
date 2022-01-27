const fs = require("fs")
const path = require("path")
const filepath = path.join("index.js")
    // console.log(filepath)
const data = fs.readFileSync(filepath, "utf-8")
    // console.log(data)
const os = require("os")
const os_data1 = { type: ["desc", os.type()] }
const os_data = { type: ["desc", os.type()], uptime: ["desc", os.uptime()], release: ["desc", os.release()], totalmem: ["desc", os.totalmem()], freemem: ["desc", os.freemem()], endianness: ["desc", os.endianness()], platform: ["desc", os.platform()] }
fs.writeFileSync('./sample2.txt', JSON.stringify(os_data))
    // fs.writeFileSync('./sample2.txt', " Supp biatchhh")
    // console.log(fs.readFileSync('./sample.txt', "utf-8"))
    // fs.open()