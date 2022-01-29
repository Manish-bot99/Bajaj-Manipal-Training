// let a = 20
// let b = 60
const filterRange = (x, a, b) => {
    return arr.filter(i => (a <= i && i <= b));
}


let arr = [4, 5, 65, 7, 32, 5, 32, 54, 23, 56, 76]
let filtered = filterRange(arr, 20, 60)
console.log(filtered)
    // console.log(arr)