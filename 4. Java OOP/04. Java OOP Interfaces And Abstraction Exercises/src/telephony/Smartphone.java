package telephony;

import java.util.List;

public class Smartphone implements Callable, Browsable {
    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    @Override
    public String call() {
        StringBuilder sb = new StringBuilder();
        boolean isInvalid = false;
        for (int i = 0; i < numbers.size(); i++) {
            String currentString = numbers.get(i);
            for (int letter = 0; letter < currentString.length(); letter++) {
                if (currentString.charAt(letter) != '0' && currentString.charAt(letter) != '1'
                        && currentString.charAt(letter) != '2' && currentString.charAt(letter) != '3'
                        && currentString.charAt(letter) != '4' && currentString.charAt(letter) != '5'
                        && currentString.charAt(letter) != '6' && currentString.charAt(letter) != '7'
                        && currentString.charAt(letter) != '8' && currentString.charAt(letter) != '9') {
                    isInvalid = true;
                    break;
                }
            }
            if (isInvalid) {
                sb.append("Invalid number!").append(System.lineSeparator());
                isInvalid = false;
            } else {
                sb.append("Calling... ").append(currentString).append(System.lineSeparator());
            }
        }
        return sb.toString();
    }

    @Override
    public String browse() {
        StringBuilder sb = new StringBuilder();
        boolean isInvalid = false;
        for (int i = 0; i < urls.size(); i++) {
            String currentString = urls.get(i);
            for (int letter = 0; letter < currentString.length(); letter++) {
                if (currentString.charAt(letter) == '0' || currentString.charAt(letter) == '1'
                        || currentString.charAt(letter) == '2' || currentString.charAt(letter) == '3'
                        || currentString.charAt(letter) == '4' || currentString.charAt(letter) == '5'
                        || currentString.charAt(letter) == '6' || currentString.charAt(letter) == '7'
                        || currentString.charAt(letter) == '8' || currentString.charAt(letter) == '9') {
                    isInvalid = true;
                    break;
                }
            }
            if (isInvalid) {
                sb.append("Invalid URL!").append(System.lineSeparator());
                isInvalid = false;
            } else {
                sb.append(currentString).append("!").append(System.lineSeparator());
            }
        }
        return sb.toString();
    }
}
