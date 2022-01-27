//common js
const { members } = require("./data.js")
const { test1 } = require("./index.js")


//es6 method
// import { test, test3 } from "./index"
// test3()

members.map((item) => test1(item.memberName, item.memberID))