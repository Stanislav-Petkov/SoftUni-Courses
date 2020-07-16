import java.io.File;
import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Objects;

public class ListFiles07Lab {
    public static void main(String[] args) {
        String input = "files-resources/Files-and-Streams/";
        Path inputPath = Paths.get(input);
        String output = "output.txt";
        File file = new File(input);
        for(File f : Objects.requireNonNull(file.listFiles())){
            if(!f.isDirectory()) {
                System.out.println(f.getName() + " " + f.length());
            }
        }
    }
}

/*
public class ListFiles07Lab {
    public static void main(String[] args) {
       String input = "files-resources/Files-and-Streams/";
       Path inputPath = Paths.get(input);
       String output = "output.txt";
       File dir = new File(input);
       traverseDirs(dir, 1);

    }

    private static void traverseDirs(File dir, int level) {
        String format = "";
        for (int j = 0; j < level; j++) {
            format += "=";
        }
        System.out.println(format + ">" + dir.getName());

        for(File file : dir.listFiles()){
            if(file.isDirectory()){
                traverseDirs(file, level + 1);
            }else{
                System.out.println(format + ">" + file.getName());
            }
        }
    }
}
 */
