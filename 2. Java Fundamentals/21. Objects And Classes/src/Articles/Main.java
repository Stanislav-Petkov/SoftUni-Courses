package Articles;

import java.util.Scanner;

public class Main {
    //package Articles;

    public static class Article {
        private String title;
        private String content;
        private String author;

        Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        void edit(String newContent) {
            this.content = newContent;
        }

        void changeAuthor(String newAuthor) {
            this.author = newAuthor;
        }

        void rename(String newTitle) {
            this.title = newTitle;
        }

        @Override
        public String toString() {
            return String.format("%s - %s: %s", this.title, this.content, this.author);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split(", ");
        String title = arr[0];
        String content = arr[1];
        String author = arr[2];
        Article article = new Article(title, content, author);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(": ");
            if (input[0].equals("Edit")) {
                article.edit(input[1]);
            } else if (input[0].equals("ChangeAuthor")) {
                article.changeAuthor(input[1]);
            } else if (input[0].equals("Rename")) {
                article.rename(input[1]);
            }
        }
        System.out.println(article);
    }
}
