import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Followers9aug19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, User> userNames = new HashMap<>();
        String input = scanner.nextLine();
        while (!"Log out".equals(input)) {
            String[] tokens = input.split(": ");
            String commandType = tokens[0];
            String username = tokens[1];
            switch (commandType) {
                case "New follower": {
                    User user = new User(0, 0);
                    userNames.putIfAbsent(username, user);
                }
                break;
                case "Like": {
                    int newLikes = Integer.parseInt(tokens[2]);
                    if (userNames.containsKey(username)) {
                        User user = userNames.get(username);
                        user.addLikes(newLikes);
                    } else {
                        User user = new User(newLikes, 0);
                        userNames.put(username, user);
                    }
                }
                break;
                case "Comment": {
                    if (userNames.containsKey(username)) {
                        User user = userNames.get(username);
                        user.increaseComments();
                    } else {
                        User user = new User(0, 1);
                        userNames.put(username, user);
                    }
                }
                break;
                case "Blocked": {
                    if (userNames.containsKey(username)) {
                        userNames.remove(username);
                    } else {
                        System.out.println(String.format("%s doesn't exist.", username));
                    }
                }
                break;
                default:
                    throw new IllegalStateException("Wrong commandType " + commandType);
            }
            input = scanner.nextLine();
        }
        System.out.println(String.format("%d followers", userNames.size()));
        userNames.entrySet().stream()
                .sorted((a, b) -> {
                    int result = b.getValue().getLikes() - a.getValue().getLikes();
                    if (result == 0) {
                        result = a.getKey().compareTo(b.getKey());
                    }
                    return result;
                })
                .forEach(entry -> {
                    String name = entry.getKey();
                    int likeAndComments = entry.getValue().getTotal();
                    System.out.println(String.format("%s: %d", name, likeAndComments));
                });
    }

    public static class User {
        private int likes;
        private int comments;

        public User(int likes, int comments) {
            this.likes = likes;
            this.comments = comments;
        }

        public int getLikes() {
            return this.likes;
        }

        public void addLikes(int likes) {
            this.likes += likes;
        }

        public int getComments() {
            return this.comments;
        }

        public void increaseComments() {
            this.comments++;
        }

        public int getTotal() {
            return this.comments + this.likes;
        }
    }
}
