function solve(n, m) {
    n = Number(n);
    m = Number(m);
    let sum = 0;
    while (n <= m) {
        sum += Number(n);
        n++;
    }
    return Number(sum);
}

//1 + 2 + 3 + 4 = 10
//console.log(solve("1","4"));
console.log(solve("1", "5"));

function so(n, m) {
    let sum = 0;
    while (+n <= +m) { // make the strings numbers
        sum += +n;
        n++;
    }
    return sum;
}

//console.log(so("1", "5"))

function sum(n, m) {
    let result = 0;
    let num1 = Number(n);
    let num2 = Number(m);
    for (let i = num1; i <= num2; i++) {
        result += i;
    }
    return result;
}

console.log(sum("1", "5"));




