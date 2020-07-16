package GenericBoxInteger;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<GenericBox<Integer>> boxes = new ArrayList<>();
        while (n-- > 0) {
            Integer num = scanner.nextInt();
            GenericBox<Integer> box = new GenericBox<>(num);
            boxes.add(box);
        }
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        swap(boxes, first, second);
        for (GenericBox box : boxes) {
            System.out.println(box);
        }
    }

    public static <T> void swap(List<T> boxes, int first, int second) {
        T element = boxes.get(first);
        boxes.set(first, boxes.get(second));
        boxes.set(second, element);
    }
}














/*

package GenericBoxInteger;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<GenericBox<Integer>> boxes = new ArrayList<>();
        while (n-- > 0){
           Integer num = scanner.nextInt();
           GenericBox<Integer> box = new GenericBox<>(num);
           boxes.add(box);
        }
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        swap(boxes,first,second);
        for(GenericBox<Integer> box : boxes){
            System.out.println(box);
        }
    }
    public static <T> void swap(List<T> boxes, int first,int second){
        T firstNum = boxes.get(first);
        boxes.set(first,boxes.get(second));
        boxes.set(second,firstNum);
    }
}

package SwapMethodStrings3;

public class Box<T> {
    T element;

    public Box(T element) {
        this.element = element;
    }

    @Override
    public String toString() {
        return element.getClass().getName() + ": " + element;
    }
}

 */