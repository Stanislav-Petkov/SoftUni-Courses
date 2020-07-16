package calculator5_old;

import java.util.Scanner;

public class Main_old {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculationEngine_old engine = new CalculationEngine_old();
        InputInterpreter_old interpreter = Extensions_old.buildInterpreter(engine);
        String[] tokens = scanner.nextLine().split("\\s+");
        for (String token : tokens) {
            if (token.equals("end")) {
                break;
            }
            interpreter.interpret(token);
        }
        System.out.println(engine.getCurrentResult());
    }
}
