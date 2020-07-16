function calorieObject(arr) {
    let obj = {};
    for (let i = 0; i < arr.length; i += 2) {
        let value = arr[i + 1];
        obj[arr[i]] = +value;
    }
    console.log(obj);
}

arr = ['Yoghurt', 48, 'Rise', 138, 'Apple', 52];

//calorieObject(arr);

function calorieObject(arr) {
    let obj = {};
    for (let i = 0; i < arr.length; i += 2) {
        let objKey = arr[i];
        let objVal = Number(arr[i + 1]);
        obj[objKey] = objVal;
    }
    console.log(obj);
}
calorieObject(arr);