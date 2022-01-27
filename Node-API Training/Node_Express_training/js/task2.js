// const unique_elements = (arr) => {
//     let sorted_arr = arr.slice().sort(); // You can define the comparing function here. 
//     // JS by default uses a crappy string compare.
//     // (we use slice to clone the array so the
//     // original array won't be modified)
//     let results = [];
//     for (let i = 0; i < sorted_arr.length - 1; i++) {
//         if (sorted_arr[i + 1] == sorted_arr[i]) {
//             results.push(sorted_arr[i]);
//         }
//     }
//     return results;
// }

const unique_elements = (arr) => {
    var i,
        len = arr.length,
        out = [],
        obj = {};

    for (i = 0; i < len; i++) {
        obj[arr[i]] = 0;
    }
    for (i in obj) {
        out.push(i);
    }
    return out;
}

// function unique_elements(arr) {
//         return 
//     }
let strings = ["React Js", "JavaScript", "React Js", "JavaScript",
    "JavaScript", "JavaScript", "React Js", "React Js"
];
console.log(unique_elements(strings)); // React Js, JavaScript