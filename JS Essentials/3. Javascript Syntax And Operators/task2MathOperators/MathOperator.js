function solve(num1, num2, operator){
    let result;
    switch (operator) {
        case "+": result = num1 + num2; break;
        case "-": result = num1 - num2; break;
        case "*": result = num1 * num2; break;
        case "/": result = num1 / num2; break;
        case "%": result = num1 % num2; break;
        case "**": result = num1 ** num2; break;
    }
    console.log(result);
}
// solve(5,6,"-"); // -1
// solve(5,6,"+"); // 11


function solveWithEval(num1, num2, operator) {
    return eval(`${num1} ${operator} ${num2}`);
}

//console.log(solveWithEval(4,6,"*"));

function solveWitInnerFunction(num1,num2,operator) {
        let result = 0;
        switch(operator){
            case "+": result = num1 + num2; break;
            case "-": result = num1 - num2; break;
            case "*": result = num1 * num2; break;
            case "/": result = num1 / num2; break;
            case "%": result = num1 % num2; break;
            case "**": result = num1 ** num2; break;
        }

        return function (num3, operator) {
            switch(operator){
                case "+": return result + num3;
                case "-": return result - num3;
                case "*": return result * num3;
                case "/": return result / num3;
                case "%": return result % num3;
                case "**": return result ** num3;
            }
        }
}
// 5 * 6 = 30 , 30 * 5 = 150
console.log(solveWitInnerFunction(5,6,"*")(5,"*"));











