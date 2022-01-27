const test = () => {
    const age = 23

    // const healthcondition = true
    // if (age >= 18 && )

    if (age !== "13") {
        console.log("executed")
    } else {
        console.log("not executed")
    }
}
const test2 = () => {
    console.log("secrets")
}

const test1 = (fname, memID) => {
    console.log(`Username: ${fname}, memberID : ${memID}`)
}

//common js
const test3 = () => {
    console.log("hello")
}

module.exports = { test1 }
    // console.log(module.exports)


// es6 format
// export default { test, test3 }