var mongoose = require('mongoose');
var schema = mongoose.schema;

var blogschema = new schema({
    title: String,
    author: String,
    body: String,

})

module.exports = blogSchema;