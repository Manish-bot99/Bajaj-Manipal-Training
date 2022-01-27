const express = require('express');
const router = express.Router();
const Post = require('../models/Post');

//ROUTES

router.get('/', (req, res) => {
    res.send("We are on posts");
});
// router.get('/specific', (req, res) => {
//     res.send("Specific post")
// })

router.post('/', async(req, res) => {
    const post = new Post({
        title: req.body.title,
        description: req.body.description
    });
    // res.send(post);
    try {
        const savedPost = await post.save();
        res.json(savedPost);
    } catch (err) {
        res.json({ message: err.message });
    }

    // post.save()
    //     .then(data => {
    //         res.json(data);
    //     })
    //     .catch(err => {
    //         res.json({ message: err.message });
    //     });
});

module.exports = router;