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