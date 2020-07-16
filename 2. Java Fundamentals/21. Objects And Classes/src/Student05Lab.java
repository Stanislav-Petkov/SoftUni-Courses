public class Student05Lab {
    static class Student {
        private String firstName;
        private String lastName;
        private String age;
        private String town;

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public String getAge() {
            return this.age;
        }

        public String getTown() {
            return this.town;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public void setTown(String town) {
            this.town = town;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> studentList = new ArrayList<>();
        String[] arr = scanner.nextLine().split("\\s+");
        while (!arr[0].equals("end")) {
            String firstName = arr[0];
            String lastName = arr[1];
            String age = arr[2];
            String town = arr[3];
            Student student = new Student();
            student.setFirstName(firstName);
            student.setLastName(lastName);
            student.setAge(age);
            student.setTown(town);
            studentList.add(student);
            arr = scanner.nextLine().split("\\s+");
        }
        String town = scanner.nextLine();
        for (int i = 0; i < studentList.size(); i++) {
            Student student = studentList.get(i);
            if (town.equals(student.getTown())) {
                System.out.printf("%s %s is %s years old%n", student.getFirstName(), student.getLastName(),
                        student.getAge());
            }
        }
    }
}
