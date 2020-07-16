console.log({}); // {}

console.log({name: "Pesho1", age: 251}); //{ name: 'Pesho1', age: 251 }

// add property to an object
let a = {name: "Pesho", age: 25};
a.numberOfLegs = 15;
console.log(a); // { name: 'Pesho', age: 25, numberOfLegs: 15 }

let b = {name: "Pesho", age: 25};
console.log(b.numberOf); // undefined

let a1 = {name: "Pesho", age:26};
a1["numberOfLegs"] = 14; // add property numberOfLegs
console.log(a1); //{ name: 'Pesho', age: 26, numberOfLegs: 14 }

let a2 = {name: "Pesho2", age: 2};
let numberOfLegs2 = "asd";
a2[numberOfLegs2] = 12; // attaches the variable as a string, makes it a property name
// and sets the value on the left
console.log(a2["asd"]); // 12


let a3 = {name: "Pesho3", age:3};
let numberOfLegs3 = "asd";
a3[numberOfLegs3] =null;
console.log(a3); //{ name: 'Pesho3', age: 3, asd: null }


let car = {type: "Infinity", model: "QX80", color: "blue"};
let carType = car.type;
console.log(carType); //Infinity

let carType1 = car["type"];// access the property type
console.log(carType1);//Infinity

let carType2 = car["Infinity"];
console.log(carType2); //undefined

car.year = 2010; // add new property
console.log(car.year); //2010
console.log(car); //{ type: 'Infinity', model: 'QX80', color: 'blue', year: 2010 }
car["year"] = 2020; // override the value of the property
console.log(car.year); //2020

car.color = "black";
console.log(car.color); //black

car["color"] = "orange";
console.log(car.color);//orange
console.log(car);//{ type: 'Infinity', model: 'QX80', color: 'orange', year: 2020 }













