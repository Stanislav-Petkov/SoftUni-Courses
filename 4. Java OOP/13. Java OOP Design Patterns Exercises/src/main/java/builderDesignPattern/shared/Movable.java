package builderDesignPattern.shared;

public interface Movable {
    int gerRow();
    int getCol();

    void decreaseRow();
    void decreaseCol();
    void increaseRow();
    void increaseCol();
}
