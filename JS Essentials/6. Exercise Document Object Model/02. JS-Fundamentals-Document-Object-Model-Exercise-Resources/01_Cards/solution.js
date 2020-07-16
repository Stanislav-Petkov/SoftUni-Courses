function solve() {
    Array.from(document.getElementsByTagName('img')).forEach((img) => {
        img.addEventListener('click', clickEvent);
    });

    // e is the event object coming from the event listener
    function clickEvent(e) {
        let card = e.target; // target returns the element on which was clicked
        card.src = './images/whiteCard.jpg';
        card.removeEventListener('click', clickEvent);//once a card is clicked the event listener for it is removed

        let parent = card.parentNode;// returns the element containing the card

        let spans = document.getElementById('result').children;

        let leftSpan = spans[0];
        let rightSpan = spans[2];
        if (parent.id === 'player1Div') {
            leftSpan.textContent = card.name;
        } else if (parent.id === 'player2Div') {
            rightSpan.textContent = card.name;
        }

        if (leftSpan.textContent && rightSpan.textContent) {
            //when both spans contain something

            let winner;
            let looser;

            if (+leftSpan.textContent > +rightSpan.textContent) {
                winner = document.querySelector(`#player1Div img[name="${leftSpan.textContent}"]`);
                looser = document.querySelector(`#player2Div img[name="${rightSpan.textContent}"`);
            } else {
                winner = document.querySelector(`#player2Div img[name="${rightSpan.textContent}"]`);
                looser = document.querySelector(`#player1Div img[name="${leftSpan.textContent}"]`);
            }
            winner.style.border = '2px solid green';
            looser.style.border = '2px solid darkred';

            document.getElementById('history').textContent
                += `[${leftSpan.textContent} vs ${rightSpan.textContent}] `;

            setTimeout(function () {
                leftSpan.textContent = "";
                rightSpan.textContent = "";
            }, 2000);
        }
    }
}
