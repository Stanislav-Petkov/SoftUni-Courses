package articles_second;

import java.util.Scanner;

public class Main {
    public static class Article {
        private String title;
        private String content;
        private String author;

        Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public String getAuthor() {
            return author;
        }

        public String getContent() {
            return content;
        }

        public String getTitle() {
            return title;
        }

        @Override
        public String toString() {
            return String.format("%s - %s: %s", this.title, this.content, this.author);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Article> articles = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] arr = scanner.nextLine().split(", ");
            String title = arr[0];
            String content = arr[1];
            String author = arr[2];
            Article article = new Article(title, content, author);
            articles.add(article);
        }
        String type = scanner.nextLine();
        if (type.equals("title")) {
            articles.stream().sorted((p1, p2) -> p1.getTitle().compareTo(p2.getTitle())).forEach(e -> System.out.println(e));
        } else if (type.equals("content")) {
            articles.stream().sorted((p1, p2) -> p1.getContent().compareTo(p2.getContent())).forEach(e -> System.out.println(e));
        } else if (type.equals("author")) {
            articles.stream().sorted((p1, p2) -> p1.getAuthor().compareTo(p2.getAuthor())).forEach(e -> System.out.println(e));
        }
    }
}
