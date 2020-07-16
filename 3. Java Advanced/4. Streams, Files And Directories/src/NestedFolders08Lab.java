import java.io.File;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class NestedFolders08Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "files-resources/Files-and-Streams - Copy/";
        File root = new File(input);
        Deque<File> files = new ArrayDeque<>();
        files.offer(root);
        int count = 0;

        while (!files.isEmpty()){
            File current = files.poll();
            File[] arr = current.listFiles();
            for (File f : arr){
                if(f.isDirectory()) {
                    files.offer(f);
                }
            }
            count++;
            System.out.println(current.getName() );
        }
        System.out.println(count);
    }
}

/*
//100
import java.io.File;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class NestedFolders08Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "files-resources/Files-and-Streams/";
        File root = new File(input);

        Deque<File> dirs = new ArrayDeque<>();
        dirs.offer(root);
        int count = 0;
        while (!dirs.isEmpty()){
            File current = dirs.poll();
            File[] nestedFiles = current.listFiles();
            for(File nestedFile : nestedFiles){
                if(nestedFile.isDirectory()){
                    dirs.offer(nestedFile);
                }
            }
            count++;
            System.out.println(current.getName());
        }
        System.out.println(count + " " + "folders");

    }
}


 */

/*
import java.io.File;
import java.util.Scanner;

public class NestedFolders08Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "files-resources/Files-and-Streams/";
        File file = new File(input);
        if (file.exists()) {
            if (file.isDirectory()) {
                File[] files = file.listFiles();
                int couter = 0;
                for (File f : files) {
                    if (f.isDirectory()) {
                        System.out.println(f.getName());
                    }
                    File[] files1 = f.listFiles();
                    for(File f1 : files1){
                        System.out.println(f1.getName());
                    }
                    couter++;
                }

                System.out.println(couter + 1 + " folders");
            }
        }

    }
}


 */