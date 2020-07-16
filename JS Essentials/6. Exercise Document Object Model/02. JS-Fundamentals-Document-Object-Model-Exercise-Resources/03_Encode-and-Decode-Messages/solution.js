function solve() {
    let buttons = document.getElementsByTagName('button');
    let textAreas = document.getElementsByTagName('textarea');

    buttons[0].addEventListener('click',encode);
    buttons[1].addEventListener('click',decode);

    function encode(){
        let encodeMessage = textAreas[0].value;
        let newMessage = '';
        encodeMessage.split('').forEach((char) =>{
            let asciiValue = char.charCodeAt(0) + 1;
            newMessage += String.fromCharCode(asciiValue);
        });

        textAreas[0].value = "";
        textAreas[1].value = newMessage;
    }

    function decode(){
        let decodeMessage = textAreas[1].value;
        let original = '';
        decodeMessage.split('').forEach((char) => {
            let ascii = char.charCodeAt(0) - 1;
            original += String.fromCharCode(ascii);
        })
        textAreas[1].value = original;

    }
}


//Another solution
function solve1() {
	Array.from(document.getElementsByTagName('button')).forEach((btn) =>{
	    btn.addEventListener('click',convertText);
    })

    function convertText(event) {
        let button = event.target; // currently clicked button

        let buttons = document.getElementsByTagName('button');


        let inputTextAreas = document.querySelectorAll("#exercise textarea");
        let inputTextArea = inputTextAreas[0];
        let outputTextArea = inputTextAreas[1];
        let inputTextContent = inputTextArea.value;

        if(button === buttons[0]) {
            let resultString = "";
            for (let i = 0; i < inputTextContent.length; i++) {
                let currChar = inputTextContent[i];
                let currCharCharCode = currChar.charCodeAt(0);
                let newChar = String.fromCharCode(currCharCharCode + 1);
                resultString += newChar;
            }
            outputTextArea.textContent = resultString;
            inputTextArea.value = "";
        }else if(button === buttons[1]){
            let text = outputTextArea.textContent;
            let resultString = "";
            for (let i = 0; i < text.length; i++) {
                let currChar = text[i];
                let currCharCharCode = currChar.charCodeAt(0);
                let newChar = String.fromCharCode(currCharCharCode - 1);
                resultString += newChar;
            }
            outputTextArea.textContent = resultString;
        }
    }
}












