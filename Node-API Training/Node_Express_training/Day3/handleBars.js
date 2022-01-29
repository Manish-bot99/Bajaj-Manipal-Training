const app = require('express')()
app.set('view engine', 'hbs')
app.get('/home', (req, res) => {
    res.render("home", { username: "PeterParker" })
})
app.listen(3001, () => {
    console.log("server started")
})