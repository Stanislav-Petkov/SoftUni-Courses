let a = 5;
let b = "5";
console.log(a == b); // true  checks by value
console.log(a === b);//false checks by type

if(6 % 2 === 0){
    console.log("Even");
}else {
    console.log("Odd");
}

for (let i = 0; i < 5; i++) {
    console.log(i);
}

let day = 5;

switch (day) {
    case 1: console.log("Monday"); break;
    case 2: console.log("Tuesday"); break;
    case 3: console.log("Wednesday"); break;
    case 4: console.log("Thursday"); break;
    case 5: console.log("Friday"); break;
    case 6: console.log("Saturday"); break;
    case 7: console.log("Sunday"); break;
    default: console.log("Error!"); break;
}
//Friday

let day1 = 43;

switch (day1) {
    case 1: console.log("Monday"); break;
    case 2: console.log("Tuesday"); break;
    case 3: console.log("Wednesday"); break;
    default: console.log("Error!");
    case 4: console.log("Thursday"); break;
    case 5: console.log("Friday"); break;
    case 6: console.log("Saturday"); break;
    case 7: console.log("Sunday"); break;
}
//Error!
// Thursday


let day2 = 3;

switch (day2) {
    case 1: console.log("Monday"); break;
    case 2: console.log("Tuesday"); break;
    case 3:
    case 4: console.log("Thursday"); break;
    case 5: console.log("Friday"); break;
    case 6: console.log("Saturday"); break;
    case 7: console.log("Sunday"); break;
}
//Thursday

console.log("------------");
let array = [1,2,3];
for(let value of array){
    console.log(value);
}// prints the values of the array 1,2,3

for(let value in array){
    console.log(value);
}// prints the indexes 0 1 2

for(let val in array){
    console.log(array[val]);
}// prints the values of the indexes 1 2 3

console.log("---------");

let arr = {name: "pesho", age:2, numOfLegs:3};
for(let val in arr){
    console.log(val);
}
//Iterates the properties
// name
// age
// numOfLegs

// for(let v of arr){
//     console.log(v);
// }// Error TypeError: arr is not iterable

for (let val in arr) {
    console.log(arr[val]);
}
//Iterates through the values of the properties
//pesho
// 2
// 3


console.log(5);
debugger;
console.log(6);

if(7 === "7"){
    console.log(" === 7");
}
if(7 !== "7"){
    console.log(" !== 7");
}

console.log("" == 0); // true
console.log([] == 0); // true

let t = 5, y = 4;
console.log(t ? y : 10);

let q = 5;
let w = a > 3 ? 4 : (a >= 5 ? 10 : 5);
console.log(w); // 4  because a > 3

let w1 = a > 7 ? 4 : (a >= 5 ? 10 : 5);
console.log(w1); // 10 because a >= 5 