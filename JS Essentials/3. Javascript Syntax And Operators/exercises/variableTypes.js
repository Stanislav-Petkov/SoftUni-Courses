const obj = {
    name: 'Pesho'
};

obj.name = 'Gosho';
console.log(obj); // { name: 'Gosho' }  changes the value

const obj1 = {
    name: 'Pesho1'
};
obj1.age =  5;
console.log(obj1); //{ name: 'Pesho1', age: 5 }

// const object can be manipulated, changed, added
// const for an object means that the object cannot be reassigned
// obj1 = {}; does not work

const a = "aa";
//a = 'pp'; // error

console.log("---------");
let array = [1,2];
let obj3 = {name: 'Pesho'};
let num = 5;
let string = 'ASd';

array['asd'] = 25;  //value is attached
obj3['asd'] = 25;   //value is attached
num['asd'] = 25;    // nothing happens
string['asd'] = 25; // nothing happens

// array and object are not primitive and a value can be attached
console.log(array['asd']);      // 25
console.log(array);             //[ 1, 2, asd: 25 ]
console.log(obj3['asd']);       // 25
console.log(obj3);              //{ name: 'Pesho', asd: 25 }

// number and string are primitive types and a new value cannot be attached
console.log(num['asd']);        //undefined
console.log(num);                //5
console.log(string['asd']);     //undefined
console.log(string);            //ASd


let q = 2;
let t = 3;
console.log( q ** t); // 8 = 2^3
console.log(t ** q);  //9 = 3 ^ 2
console.log(Math.pow(q,t));// 8 = 2^3

let x = 5;
// int the + context the left x is 5  then it is
// postincremented  and x is 6 then preincremented and x is 7 =>( 5 + 7 )== 12
console.log(x++ + ++x); // 12

let y = 5;
let z = y;
console.log(y++);  // 5
console.log(z);    // 5
console.log(++y);  // 7
console.log(z + y);// 12

let s = 5;
let v = 2;
s **= v;
console.log(s); // 25





