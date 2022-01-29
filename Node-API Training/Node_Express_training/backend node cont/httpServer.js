const http = require("http")
const url = require("url")
const members = require("./data")
const app = http.createServer((req, res) => {
    console.log(req)
        // res.write("request recieved")
    const querydata = url.parse(req.url, true)
    console.log(querydata.query)
    res.writeHead(200, { "Content-Type": "text/html" })
    if (querydata.query.search === "redmi" && Number(querydata.query.price) === 12000) {
        res.write("<h2> Redmi not pro </h2>")
        res.end()
    }
    //     if (querydata.pathname === "/products") {
    //         res.writeHead(200, { "Content-Type": "text/html" })
    //         res.write("<h1>Products</h1>")
    //         res.end()
    //     } else if (querydata.pathname === "/checkout") {
    //         res.write("<h1>Checkout</h1>")
    //         res.end()
    //     }
})
app.listen(3000, () => console.log("Server started in port : 3000"))