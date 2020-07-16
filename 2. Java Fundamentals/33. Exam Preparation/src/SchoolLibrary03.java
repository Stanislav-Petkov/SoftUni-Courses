public class SchoolLibrary03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] bookNames = scanner.nextLine().split("&");
        String[] command = scanner.nextLine().split(" \\| ");
        List<String> booksList = new ArrayList<>(Arrays.asList(bookNames));
        String book = "";
        while (!command[0].equals("Done")) {
            switch (command[0]) {
                case "Add Book":
                    book = command[1];
                    if (!booksList.contains(book)) {
                        booksList.add(0, book);
                    }
                    break;
                case "Take Book":
                    book = command[1];
                    if (booksList.contains(book)) {
                        booksList.remove(book);
                    }
                    break;
                case "Swap Books":
                    book = command[1];
                    String book2 = command[2];
                    if (booksList.contains(book) && booksList.contains(book2)) {
                        int index1 = booksList.indexOf(book);
                        int index2 = booksList.indexOf(book2);
                        Collections.swap(booksList, index1, index2);
                    }
                    break;
                case "Insert Book":
                    book = command[1];
                    booksList.add(booksList.size(), book);
                    break;
                case "Check Book":
                    int index = Integer.parseInt(command[1]);
                    if (index >= 0 && index < booksList.size()) {
                        System.out.println(booksList.get(index));
                    }
                    break;
            }
            command = scanner.nextLine().split(" \\| ");
        }
        System.out.println(String.join(", ", booksList));
    }
}
