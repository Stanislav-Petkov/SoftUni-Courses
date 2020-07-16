function solve(steps, footprintLength, speedInKmForHour) {
    //TODO: Calculate the distance in meters ( from kilometers, the is is km / h)
    let distanceInMeters = steps * footprintLength;

    // TODO: Convert the speed from hours to seconds and convert it into meters (1000)
    let speedForMeterInSeconds = speedInKmForHour / 60 / 60 * 1000;

    // TODO: Calculate the rests count
    let rests = Math.floor(distanceInMeters / 500);

    // TODO: One rest is 60 seconds
    let sumOfRestsInSeconds = rests * 60;

    let totalSecondsTraveling = distanceInMeters / speedForMeterInSeconds;
    totalSecondsTraveling = totalSecondsTraveling + sumOfRestsInSeconds;

    let hours = Math.floor(totalSecondsTraveling / 3600) > 9 ?
        Math.floor(totalSecondsTraveling / 3600) :
        (Math.floor(totalSecondsTraveling / 3600) < 1 ? "00" :
            "0" + Math.floor(totalSecondsTraveling / 3600));
    let minutes = Math.floor(totalSecondsTraveling / 60) > 9 ?
        Math.floor(totalSecondsTraveling / 60) :
        (Math.floor(totalSecondsTraveling / 60) < 1 ? "00" :
        "0" + Math.floor(totalSecondsTraveling / 60));
    let seconds = Math.round(totalSecondsTraveling % 60) > 9 ?
        Math.round(totalSecondsTraveling % 60):
        (Math.round(totalSecondsTraveling % 60) < 1 ? "00" :
        "0" + Math.round(totalSecondsTraveling % 60));
    console.log(hours + ":" + minutes + ":" + seconds);
}
//
// solve(4000, 0.60, 5);
// solve(2564, 0.70, 5.5);

function timeToWalk(steps, footprintLength, speedInKmForHour) {
    //TODO: Calculate the distance in meters ( from kilometers, the is is km / h)
    let distanceInMeters = steps * footprintLength;

    // TODO: Convert the speed from hours to seconds and convert it into meters (1000)
    let speedForMeterInSecond = speedInKmForHour / 60 / 60 * 1000;

    let timeSecond = Math.round(distanceInMeters / speedForMeterInSecond);
    // TODO: Calculate the rests count
    // TODO: One rest is 60 seconds
    let rest = Math.floor(distanceInMeters / 500);
    timeSecond += rest * 60;

    let seconds = timeSecond % 60;
    let minutes = ((timeSecond - seconds) / 60) % 60;
    let hour = Math.floor((timeSecond - seconds) / 3600);


    function formatTheOutput(hour, minutes, seconds) {
        if(hour < 10){
            hour = '0' + hour;
        }
        if(minutes < 10){
            minutes = '0'+ minutes;
        }
        if(seconds < 10){
            seconds = '0'+ seconds;
        }
        console.log(`${hour}:${minutes}:${seconds}`);
    }

    formatTheOutput(hour,minutes, seconds);
    
   // console.log(seconds);
    //console.log(minutes);


}
timeToWalk(4000, 0.60, 5);
