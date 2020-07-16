function solve() {
    // 0 is mine, 1 is pesho
    let buttons = Array.from(document.getElementsByTagName('button'));
    let inputFields = Array.from(document.getElementsByTagName('input'));

    buttons.forEach((btn) => {
        btn.addEventListener('click', function(event){
            let divElement = document.createElement('div');
            let spanElement = document.createElement('span');
            let pElement = document.createElement('p');

            let senderBtn = event.target; //.name

            debugger;

            if(senderBtn === 'myBtn'){
                spanElement.textContent = 'Me';
                pElement.textContent = document.getElementById('myChatBox').value;
                divElement.style.textAlign = 'left';
            }else if(senderBtn === 'peshoBtn'){
                spanElement.textContent = 'Pesho';
                pElement.textContent = document.getElementById('peshoChatBox').value;
                divElement.style.textAlign = 'right';
            }

            divElement.appendChild(spanElement);
            divElement.appendChild(pElement);

            document.getElementById('chatChronology').appendChild(divElement);

            inputFields[0].value = "";
            inputFields[1].value = "";
        })
    })
}

// Another solution
function solve2() {

    let mainChat = document.getElementById("chatChronology");

    Array.from(document.getElementsByTagName("button")).forEach((button) => {
       button.addEventListener('click',clickEvent);
    });

    function clickEvent(e) {

        let button = e.target; // get currently clicked button

        let chatChronologyDiv = document.getElementById('chatChronology');
        let newDiv = document.createElement('div');
        let spanNew = document.createElement('span');
        let paragraphNew = document.createElement('paragraph');
        newDiv.appendChild(spanNew);
        newDiv.insertAdjacentHTML('beforeend','<br>');
        newDiv.appendChild(paragraphNew);

        if(button.name === 'myBtn'){
            spanNew.textContent = 'Me';
            paragraphNew.textContent = document.getElementById('myChatBox').value;
            newDiv.style.textAlign = "left";
        }else if(button.name === 'peshoBtn'){
            spanNew.textContent = 'Pesho';
            paragraphNew.textContent = document.getElementById('peshoChatBox').value;
            newDiv.style.textAlign = "right";
        }

        chatChronologyDiv.appendChild(newDiv);

        // clear the message TODO
        document.getElementById('myChatBox').value = "";
        document.getElementById('peshoChatBox').value = "";
    }
}