import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class SerializeCustomObject09Lab {
    static class Cube implements Serializable {
        String color;
        double width;
        double height;
        double depth;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cube cube = new Cube();
        cube.color = "green";
        cube.width = 15.3d;
        cube.height = 12.4d;
        cube.depth = 3d;

        String output = "output.txt";
        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(output))) {
            oos.writeObject(cube);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
