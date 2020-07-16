let cars = ["ss", "kkp"];
console.log(cars instanceof Array); // true
console.log(cars instanceof Object);//true
console.log(cars instanceof String);// false
console.log(cars instanceof Number);// false

let a  = "p";
console.log(a instanceof String); // false
console.log(a instanceof Object); // false

let a1 = new String('ty');
console.log(a1 instanceof String); //true

let t = 5;
console.log(t instanceof Number);// false