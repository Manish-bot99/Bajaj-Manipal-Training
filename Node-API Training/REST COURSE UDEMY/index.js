var express = require('express');
const res = require('express/lib/response');
const app = express();
const PORT = process.env.PORT || 3000;
// const routes = require('./src/routes/crmRoutes')
const mongoose = require('mongoose')

mongoose.connect('mongodb://localhost/test', {
    useNewUrlParser: true
});

const BlogSchema = require('./src/models/crmModel')
const blogModel = mongoose.model('blog', BlogSchema);

// const Cat = mongoose.model('Cat', { name: String });

// const edd = new Cat({ name: 'mimi' });

// edd.save().then((res) => {
//         console.log(res);
//         console.log('Meow');
//     })
// routes(app);

// app.use(function(req, res, next) {
//     console.log('Time', Date.now());
// })

// app.get('/', function(req, res, next) {
//     console.log('Req Method:', req.method)
//     next();
// }, function(req, res, next) {
//     console.log('Request Original Url', req.originalUrl);
//     next()
// }, function(req, res, next) {
//     res.send('Request successful');
// })

app.post('newBlog', (req, res) => {

})

app.listen(PORT, () => {
    console.log(`Server is running on PORT: ${PORT}`)
})