import java.util.Scanner;

public class test {
    static class Lecture {
        private String name;
        private int day;

        Lecture(String name, int day) {
            this.name = name;
            this.day = day;
        }

        Lecture() {
            this.name = "[unknown]";
            this.day = -1;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public int getDay() {
            return day;
        }

        @Override
        public String toString() {
            return this.getName() + " " + this.getDay();
        }

        public String getInfo() {
            return this.getName() + " " + this.getDay();
        }

        void setDay(int day) {
            this.day = day;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lecture todaysLecture = new Lecture("Objects_and_classe", 100);
        Lecture otherLecture = new Lecture();
        System.out.println(otherLecture.getName() + " " + otherLecture.getDay());
        System.out.println(todaysLecture.getName() + " " + todaysLecture.getDay());
        System.out.println(todaysLecture.getInfo());
        System.out.println(todaysLecture);
    }
}
