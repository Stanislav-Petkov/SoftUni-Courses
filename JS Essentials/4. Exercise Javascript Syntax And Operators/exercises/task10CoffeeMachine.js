function printOrder(arr) {

    let product = 0;
    let insertedPrice = 0;
    let tempPrice =0 ;
    for (let i = 0; i < arr.length; i++) {
        let currLine = arr[i];

        let array = currLine.split(', ');
        for (let j = 0; j < array.length; j++) {
            let cur = array[j];
            if(j === 0){
                insertedPrice = +array[j];
            }
            if(array[j] === "coffee"){
                product = array[j];
            }
            if(array[j] === "tea"){
                product = array[j];
                tempPrice += 0.8;
            }
            if(array[j] === "caffeine"){
                tempPrice += 0.8;
            }
            if(array[j] === "decaf"){
                tempPrice += 0.9;
            }

            if(array[j] === "milk"){
                let increase = 0.1 * tempPrice;
                tempPrice += Math.round(increase * 10) / 10;
            }

            //sugar
            if(array[array.length - 1] > 0 && array[array.length - 1] <= 5 && j === array.length - 1 ){

                tempPrice += 0.1;
            }
            let b = 0;
        }
        let change = insertedPrice - tempPrice;
        if (change >=  0){
            change = Math.abs(change);
            console.log(`You ordered ${product}. Price: ${tempPrice.toFixed(2)}$ Change: ${change.toFixed(2)}$`)
            tempPrice = 0;
        }else {
            change = Math.abs(change);
            console.log(`Not enough money for ${product}. Need ${change.toFixed(2)}$ more.`)
            tempPrice = 0;
        }
    }
}

arr = ['1.00, coffee, caffeine, milk, 4', '0.40, tea, milk, 2',
    '1.00, coffee, decaf, 0']

//printOrder(arr);














