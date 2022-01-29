//body parser is a middle-ware

const fs = require("fs")
const express = require("express")
const bodyparser = require("body-parser")
const app = express()
app.use(bodyparser.json())
const loggerMw = (req, res, next) => {
    console.log(req.method)
    console.log(req.url)
    console.log(new Date().toDateString())
    next()
};

app.get("/home", loggerMw, (req, res) => {
    const filepath = req.method + "\n" + req.url + "\n" + new Date().toDateString() + "\n" + req.xhr + "\n\n" + req.wrap
    fs.writeFileSync("sample.txt", filepath, "utf-8")
    res.status(200).send("home")
})
app.listen(3001, () => {
    console.log("Server started on Port 3001")
})