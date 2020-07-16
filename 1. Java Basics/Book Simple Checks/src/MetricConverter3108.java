import java.util.Scanner;

public class MetricConverter3108 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double inputNum = Double.parseDouble(scanner.nextLine());
        String metric1 = scanner.next().toLowerCase();
        String metric2 = scanner.next().toLowerCase();
        double mm = 1000;
        double cm = 100;
        double mi = 0.000621371192;
        double in = 39.3700787;
        double km = 0.001;
        double ft = 3.2808399;
        double yd = 1.0936133;
        double result = 0;
        if (metric1.equals("mm")) {
            result = inputNum / mm;
        } else if (metric1.equals("cm")) {
            result = inputNum / cm;
        } else if (metric1.equals("mi")) {
            result = inputNum / mi;
        } else if (metric1.equals("in")) {
            result = inputNum / in;
        } else if (metric1.equals("km")) {
            result = inputNum / km;
        } else if (metric1.equals("ft")) {
            result = inputNum / ft;
        } else if (metric1.equals("yd")) {
            result = inputNum / yd;
        } else if (metric1.equals("m")) {
            result = inputNum;
        }
        if (metric2.equals("cm")) {
            result = result * cm;
        } else if (metric2.equals("mm")) {
            result = result * mm;
        } else if (metric2.equals("km")) {
            result = result * km;
        } else if (metric2.equals("mi")) {
            result = result * mi;
        } else if (metric2.equals("ft")) {
            result = result * ft;
        } else if (metric2.equals("yd")) {
            result = result * yd;
        } else if (metric2.equals("in")) {
            result = result * in;
        } else if (metric2.equals("m")) {
            result = result;
        }
        System.out.print(result);
    }
}
