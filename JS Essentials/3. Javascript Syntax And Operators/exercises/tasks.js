function knockKnock() {
    console.log("Who's there?");
    return function(){
        console.log("Ivo!");
        console.log("Ivo who?");
        return function(){
            console.log("Ivo stop with this!");
        }
    }
}

knockKnock()();











