// && returns the leftmost false value
let val = true && 'yes' && 5 && null && false;
console.log(val); // null
// the first false value is null
// true , 'yes', 5 are true because they are different
//from undefined

// && searches until it finds false and at the end prints the false
// && otherwise searches until it finds true and prints the last value
// if all other were true
// ALU gets either the leftmost cancelling value
// or the rightmost successful value


// in JS the single values are compared to undefined and casted to
// their values

// || searched until it finds true and the first true is printed
// if there is no true it prints the last false;

console.log(true && undefined); // undefined
console.log('yes' && undefined); // undefined

let val1 = true && false;
console.log(val1);// false
let val2 = true && 'yes' && 5;
console.log(val2); // 5
// if all are true, returns the last one

// || returns the leftmost true value
let val3 = false || 0 || '' || 5 || 'hi' ||true;
console.log(val3);// 5

let val4 = false || '' || null || NaN || undefined;
console.log(val4); // undefined
// if all are false, return the last value


function print() {
    console.log('Good');
}

let a = true && print(); // Good

let b = true && false && print(); // no output, returns false

let c = false || print();// Good
console.log(c); // undefined

let d = false || print() || true; // Good
console.log(d); // true

let e = false && print() || true; // nothing it printed
console.log(e);//true