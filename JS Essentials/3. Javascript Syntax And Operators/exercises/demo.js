// console.log([] == true);
//
// console.log([1,2,3] == true);
// console.log([] == true);
// console.log("" == false);
//
// // checks whether the object in the() is different from undefined
// if([]){
//     console.log(true)
// }
//
// // calls the toString method and 1 == true
// console.log("1" == true);
// console.log(1 == true); // true
// console.log(null == undefined); // true
// console.log(null == false); // false
// console.log("----");
//
//
// if(!undefined){
//     console.log("inside")
// }
//
// let a; // a is undefined
// if(!a){
//     console.log('inside');
// }
// console.log(a); // undefined
//
// console.log(!null); // logical not makes null as a false boolean value
//
// console.log("Integers");
// console.log(-"21"); // when we write - , it is treated as int
// console.log(-"110" + 10); // -100
// console.log(-"110" - 10); // -120
// console.log(2 + "5"); // 25 concatenates
// console.log(2 - "5"); // -3 subtraction
// console.log(3.15 - "0.03"); // 3.12
// console.log("3.15" - 0.03); // 3.12

console.log("Objects");
console.log({}); // empty object
console.log({name: "pesho", age: 13}); // define property name
let a = {name: "pesho", age: 13};
console.log(a);
a.numberOfLegs = 12; // attach a property numberOfLegs to the object a
console.log(a);
console.log(a.test); // undefined
a["number"] = 25;
console.log(a.number); // add a property to the object as an associative array
console.log(a); // { name: 'pesho', age: 13, numberOfLegs: 12, number: 25 }

let legs = "asd";
a[legs] = 15; // add the the value of legs which is the string asd to the object a
console.log(a["asd"]); // 15  the value of the property asd is 15

let kids = "kid1";
a[kids] = undefined;// the key is kid1 the value is undefined
console.log(a);