const app = require('express')()
const bodyparser = require('body-parser')
const Logger = require('nodemon/lib/utils/log')
app.use(bodyparser.json())
    // app.get('/home', (req, res) => {
    //         res.send('Hello')
    //     })
    // app.get('/price', (req, res) => {
    //     res.send({ prname: "abcd", price: "2000" })
    // })
    //query data , params
app.get('/house', (req, res, next) => {
        console.log(req.method)
        console.log(req.url)
        console.log(new Date().toDateString())
        next()
    }, (req, res) => {
        res.send("home")
    })
    // app.get("/products/productsearch", (req, res) => {
    //     console.log(req.query)
    //     res.send("level 2")
    // })

app.post('/productSales', (req, res) => {
    console.log(req.body)
    res.send("succesfull")
})
app.post("/updatepassword", (req, res) => {
    console(req.body)
    res.send('got it macha!')
})

//params
app.get("/products/:prname/:price", (req, res) => {
    console.log(req.params)
    res.send("success")
})

app.all("*", (req, res) => {
    res.status(404).send("file unavailable")
})



app.listen(3001, () => {
    console.log("server started")
})