//render html pages from express, dynamic rendering
const express = require('express');
const app = express();
const path = require('path');

//using jade
app.get('/Jade', (req, res) => {
    app.set("view engine", "jade")
    res.status(200).render("Jade", { name: "Manish Panda" })
});

//using HandleBars
app.get('/Hbs', (req, res) => {
    app.set("view engine", "hbs")
    res.status(200).render("HBS", { name: "Manish Panda" })
});
app.listen(3002, () => {
    console.log("Server started on Port 3002")
})