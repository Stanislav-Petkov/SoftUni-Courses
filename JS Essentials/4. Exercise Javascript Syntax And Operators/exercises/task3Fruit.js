function solve(fruit,grams,pricePerKG){

    let money = pricePerKG * ( grams / 1000);
    let weight = grams / 1000;
    console.log(`I need $${money.toFixed(2)} to buy ${weight.toFixed(2)} kilograms ${fruit}.`)
}

solve('orange',2500, 1.80);