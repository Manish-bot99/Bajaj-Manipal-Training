//os module, path module, fs module
// const os = require("os")
// console.log(os.uptime())
// console.log(os.type())
// console.log(os.release())
// console.log(os.freemem())
// console.log(os.totalmem())

// console.log(__dirname)
// console.log(__filename)
const path = require("path")
    // console.log(path)
const filepath = path.join("/index.js")
console.log(filepath)
const abspath = path.resolve(__dirname, "index.js")
console.log(abspath)