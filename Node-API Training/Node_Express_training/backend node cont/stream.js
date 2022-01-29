const fs = require("fs")
const readPointer = fs.createReadStream('./sample2.txt')
    //data, end, err
let data = ""
readPointer.on("data", (chunk) => {
    // console.log("chunk", chunk.toString())
    data += chunk
})
readPointer.on("end", () => {
    console.log(data)
})
readPointer.on("err", () => {
    console.log(err)
})

const writePointer = fs.createWriteStream("./dat/writefile.txt")
writePointer.write("create data", 'utf-8')
writePointer.end()
writePointer.on("finish", () => {
    console.log("finish")
})
writePointer.on("error", (err) => {
    console.log(err)
})