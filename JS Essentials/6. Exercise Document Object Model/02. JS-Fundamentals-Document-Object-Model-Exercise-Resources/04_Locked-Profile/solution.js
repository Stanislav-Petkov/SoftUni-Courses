function solve() {

    Array.from(document.getElementsByTagName('button')).forEach((btn) => {
        btn.addEventListener('click',addAction);
    })


    function addAction(e){
        let button = e.target; // get the current button
        let buttons = document.getElementsByTagName('button');
        let radios = document.querySelectorAll('input[type="radio"]');
        if(button === buttons[0]) {
            let unlockRadioButton = radios[1];
            let userHiddenFields = document.getElementById('user1HiddenFields');
           change(unlockRadioButton,userHiddenFields);
        }else if(button === buttons[1]) {
            let unlockRadioButton = radios[3];
            let userHiddenFields = document.getElementById('user2HiddenFields');
            change(unlockRadioButton,userHiddenFields);
        }else if(button === buttons[2]) {
            let unlockRadioButton = radios[5];
            let userHiddenFields = document.getElementById('user3HiddenFields');
            change(unlockRadioButton,userHiddenFields);
        }


        function change(unlockRadioButton,userHiddenFields) {
            console.log(button.textContent);
            if (button.textContent === "Show more" && unlockRadioButton.checked === true) {
                userHiddenFields.style.display = 'block';
                button.textContent = 'Hide it';
            } else if (button.textContent === 'Hide it' && unlockRadioButton.checked === true) {
                userHiddenFields.style.display = 'none';
                button.textContent = 'Show more';
            }
        }
    }
} 