package trafficlights;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        TraficLight[] inputTrafficLights = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(TraficLight::valueOf)
                .toArray(TraficLight[]::new);

        int n = Integer.parseInt(scanner.nextLine());

        TraficLight[] lights = TraficLight.values();
        while (n-- > 0) {
            for (int i = 0; i < inputTrafficLights.length; i++) {
                TraficLight traficLight = inputTrafficLights[i];
                int next = traficLight.ordinal() + 1;
                if (next >= lights.length) {
                    next = 0;
                }
                inputTrafficLights[i] = lights[next];
                System.out.print(inputTrafficLights[i] + " ");
            }
            System.out.println();
        }
    }
}
