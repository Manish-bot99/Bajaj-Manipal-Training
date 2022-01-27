//const buff = new Buffer("data")
const buff = new Buffer.alloc(20)
    //const buff = new Buffer(10)
buff.write("buffer data") //write
console.log(buff.toString()) //read
const buff2 = Buffer.from("new data", 'utf-8')
console.log(buff2.toString())