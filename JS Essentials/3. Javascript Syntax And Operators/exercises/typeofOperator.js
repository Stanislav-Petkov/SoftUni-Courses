let val = 5;
console.log(typeof(val));//number

let str = 'jj';
console.log(typeof(str));//string

let obj = {name: 'Maria', age:18};
console.log(typeof(obj));//object

let arr = [1,2,3];
console.log(typeof(arr));//object

let bool = true;
console.log(typeof(bool)); // boolean

let func = function(){};
console.log(typeof(func)); // function

let date = new Date();
console.log(typeof(date)); // object

console.log(typeof(notDeclared)); // undefined

console.log(({}).toString()); //[object Object]
console.log(([]).toString()); // ""

console.log({} + []); //[object Object]
console.log([] + {}); //[object Object]
console.log(false + false);//0

















