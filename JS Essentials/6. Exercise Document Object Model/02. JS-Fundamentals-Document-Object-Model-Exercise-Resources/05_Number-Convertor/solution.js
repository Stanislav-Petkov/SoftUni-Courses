function solve() {

    // Generate
    //<option selected="" value="Binary">Binary</option>
    //<option selected="" value="Hexadecimal">Hexadecimal</option>
    let selectMenu = document.getElementById("selectMenuTo");
    let firstOption = document.querySelector("#selectMenuTo option");
    firstOption.value = "Binary";
    firstOption.textContent = "Binary";
    let secOption = document.createElement('option');
    secOption.value = "Hexadecimal";
    secOption.textContent = "Hexadecimal";
    selectMenu.appendChild(secOption);

    let button = document.getElementsByTagName('button')[0];
    button.addEventListener('click', printResult);

    function printResult() {
        let currentOptions = document.getElementById("selectMenuTo");
        let selectedElement = getSelectedOption(currentOptions);

        let resultValue = document.getElementById('result');
        let num = document.getElementById('input').value;
        if (selectedElement.value === "Binary") {
            resultValue.value = decimalToBinary(num);

            function decimalToBinary(num) {
                return (num >>> 0).toString(2);
            }
        } else if (selectedElement.value === "Hexadecimal") {
            resultValue.value = decimalToHexadecimal(num);

            function decimalToHexadecimal(d) {
                return ("0" + (Number(d).toString(16))).slice(-2).toUpperCase()
            }
        }

        function getSelectedOption(currentOptions) {
            let opt;
            for (let i = 0, len = currentOptions.options.length; i < len; i++) {
                opt = currentOptions.options[i];
                if (opt.selected === true) {
                    break;
                }
            }
            return opt;
        }
    }

}
