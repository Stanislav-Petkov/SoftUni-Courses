package factoryDesignPattern.model;

public class Enemy implements GameObject {

    private int healthPoints;
    private int damage;

    public Enemy(int healthPoints, int damage){
        this.healthPoints = healthPoints;
        this.damage = damage;
    }

    public void update() {
        System.out.println("Enemy updated");
    }

    public void render() {
        System.out.println("Enemy rendered");
    }
}
