public class User {

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
}
