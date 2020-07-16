console.log("0" == true); // false
console.log("1" == true); // true
console.log("0" == false);// true

// check if the object "0" exists, it exists so the evaluation is true,
//"0" is different from undefined
if("O"){
    console.log("get in")
}

if("O" == true){ // false
    console.log("get in")
}

console.log("" == false); // true

// empty array is == empty string "" , which is == false
console.log([] == false); // true

console.log([1,2,3].toString()); // 1,2,3
console.log([1,2,3] == true); // false

if([]){ // the object empty array is different from undefined which is why it gets in
    console.log(true); // true
}

console.log(["1"] == true); // calls to toString() and "1" == true
console.log("1" == true); // true
console.log("0" == false); // true
console.log("----------");

console.log(null == undefined); // true

let a;
console.log(a == undefined); // true

if(!a){
    console.log("asd"); // asd
}

if(!undefined){
    console.log("qwe"); //qwe
}

console.log(!null);// true  operator ! makes null to become a boolean which is false

console.log("NUMBERS -----");
console.log(0b111); // 7
console.log(-11);
console.log(-"213" + 13); // 200  -"213" becomes a number
console.log(+"213" + 13); // 226  +"213" becomes a number
console.log("213" + 13); // 21313
console.log(2 + "5"); // 25 concatenation
console.log(2 - "5"); // -3 division
console.log(+"5" + 5); // 10
console.log(5 - "5"); //0
console.log("5" - 5); //0