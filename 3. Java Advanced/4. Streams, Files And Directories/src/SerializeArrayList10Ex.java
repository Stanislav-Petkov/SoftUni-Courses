import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

@SuppressWarnings("unchecked")
public class SerializeArrayList10Ex {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int n = 100;
        for (int i = 0; i < n; i++) {
            numbers.add(i);
        }
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("output.ser"));
        objectOutputStream.writeObject(numbers);
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("output.ser"));
        ArrayList<Integer> numberstwo = (ArrayList<Integer>) objectInputStream.readObject();
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numberstwo.get(i));
        }
    }
}
