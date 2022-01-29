const app = require('express')()
app.set('view engine', 'jade')
app.get('/template', (req, res) => {
    res.render("template", { heading: "Index Page" })
})
app.listen(3001, () => {
    console.log("server started")
})