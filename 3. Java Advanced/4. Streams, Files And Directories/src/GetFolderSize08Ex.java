import java.io.File;
import java.util.Scanner;

public class GetFolderSize08Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String path = "C:\\Users\\admin-pc\\Desktop\\advResources\\Exercises Resources";
        File file = new File(path);
        int sum = 0;
        for (File f : file.listFiles()) {
            sum += f.length();
        }
        System.out.println("Folder size: " + sum);
    }
}

/*
public class GetFolderSize08Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String path = "C:\\Users\\admin-pc\\Desktop\\advResources\\Exercises Resources";

        File file = new File(path);
        int sum = 0;
        for(File f : file.listFiles()){
            if(!f.isDirectory()){
                sum += f.length();
            }
        }

        System.out.println("Folder size: " + sum);

    }
}

 */