let name = "Pesho";
name[2] = 5; // no error
console.log(name[2]); //s

let str = "Infinity QX80";
console.log(str.length); // 13

console.log(str[0]);//I
str[0] = "s"; // no error and no change
str[0] = 's'; // no error and no change
console.log(str);
console.log(str[20]); // undefined

console.log('asd'); // it is astring
console.log("asd1");//  it is a  string
console.log('"ttt"');//  "ttt"  escapes the inner ""
console.log("'ttt'");//  'ttt'  escapes the inner ''
console.log('\'aaa\''); // 'aaa'

let a = 5;
let b = 6;
console.log(`${a} + ${b} = ${a + b}`); //5 + 6 = 11

function solve(a, b){
    console.log(a);
    console.log(b);
}
solve(); //undefined
        //undefined

solve(5);//5
            //undefined

solve(null,6);//null
                    //6

console.log(solve(5,6));
//5
// 6
// undefined  there is no return in the function and does not return value

console.log("asd" + 1); // asd1
console.log([] + {});  //[object Object]
console.log({} + []);

console.log(10 + -5); // 5
console.log(10 + - + 5); // 5
console.log(10 - + - 5); // 15
console.log(10 - + 5); //5
console.log(10 + - 5); //5

// the two are the same the pluses are removed and - - = +
console.log(10 + - + + + + + - 5); // 15
console.log(10 - - 5);//15