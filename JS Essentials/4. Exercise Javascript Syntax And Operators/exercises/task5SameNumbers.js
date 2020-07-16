function checkForSameNumbers(n) {
    let counter = 0;
    let left = 0;
    let oldLastNum = n % 10;
    let isChanged = true;
    let sum = 0;
    while (n > 0){
        left = n % 10;
        if(oldLastNum != left){
            isChanged = false;
        }
        oldLastNum = left;
        sum += left;
        n /= 10;
        n = Math.floor(n);
        counter++;
    }

    if(isChanged){
        console.log("true")
    }else {
        console.log("false");
    }

    console.log(sum);
}
//checkForSameNumbers(232222);

function solve(num){
    num = num.toString();

    let firstElement = num[0];
    let sum = +firstElement;
    let isDifferent = true;
    for(let i = 1; i < num.length; i++){
        let currNum = num[i];
        if(num[i] !== firstElement){
            isDifferent = false;
        }
        sum += +currNum;
    }
    console.log(isDifferent);
    console.log(sum);

}

//solve(2222222);

function checkForTheSameNumbers(num) {
    num = num.toString();
    let result = true;

    let firstElement = num[0];
    let sum = +firstElement;

    for(let i = 1; i < num.length; i++){
        if(num[i] !== firstElement){
            result = false;
        }
        sum += +num[i];
    }
    console.log(result);
    console.log(sum);
}

//checkForTheSameNumbers(222);