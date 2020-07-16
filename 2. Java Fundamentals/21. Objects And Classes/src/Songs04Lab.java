import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Songs04Lab {
    static class Song {
        private String typeList;
        private String name;
        private String time;

        public String getTypeList() {
            return this.typeList;
        }

        public String getName() {
            return this.name;
        }

        public String getTime() {
            return this.time;
        }

        public void setTypeList(String typeList) {
            this.typeList = typeList;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfSongs = Integer.parseInt(scanner.nextLine());
        List<Song> songsList = new ArrayList<>();
        for (int i = 0; i < numOfSongs; i++) {
            String[] data = scanner.nextLine().split("_");
            String typeList = data[0];
            String name = data[1];
            String time = data[2];
            Song song = new Song();
            song.setTypeList(typeList);
            song.setName(name);
            song.setTime(time);
            songsList.add(song);
        }
        String typeForCheck = scanner.nextLine();
        if (typeForCheck.equals("all")) {
            for (Song song : songsList) {
                System.out.println(song.getName());
            }
        } else {
            for (Song song : songsList) {
                if (song.getTypeList().equals(typeForCheck)) {
                    System.out.println(song.getName());
                }
            }
        }
    }
}
