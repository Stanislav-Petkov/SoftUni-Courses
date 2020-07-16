function solve(firstString, secondString, thirdString){
    let firstStringLength = firstString.length;
    let secondStringLength = secondString.length;
    let thirdStringLength = thirdString.length;

    console.log(firstStringLength + secondStringLength + thirdStringLength);
    console.log(Math.floor((firstStringLength + secondStringLength + thirdStringLength) / 3));
}

//solve("asd","asd","asd");