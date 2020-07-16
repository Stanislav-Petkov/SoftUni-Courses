package implementations;

import interfaces.Solvable;

public class BalancedParentheses implements Solvable {
    private String parentheses;
    private String[] arr;

    public BalancedParentheses(String parentheses) {
        this.parentheses = parentheses;
        this.arr = new String[parentheses.length()];
    }

    @Override
    public Boolean solve() {
        if (parentheses.length() == 0) {
            return false;
        }
        for (int i = 0; i < parentheses.length(); i++) {
            arr[i] = String.valueOf(parentheses.charAt(i));
        }

        boolean isCorrect = true;
        for (int i = 0, j = arr.length - 1; i < arr.length / 2; i++, j--) {
            if (!((arr[i].equals("{") && arr[j].equals("}")) ||
                    (arr[i].equals("[") && arr[j].equals("]")) ||
                    (arr[i].equals("(") && arr[j].equals(")")) ||
                    (arr[i].equals(" ") && arr[j].equals(" ")))) {
                isCorrect = false;
            }

        }
        return isCorrect;
    }
}
