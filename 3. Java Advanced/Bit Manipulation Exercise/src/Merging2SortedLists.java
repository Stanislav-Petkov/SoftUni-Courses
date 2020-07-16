import java.util.*;

public class Merging2SortedLists {
    public static void main(String[] args) {

        List<Integer> a = new LinkedList<>(Arrays.asList(3,12,19,46));
        List<Integer> b = new LinkedList<>(Arrays.asList(4,14,21,23));
        List<Integer> c = new LinkedList<>();

        while (a.size() > 0 && b.size() > 0){
            if(a.get(0) <= b.get(0)){
                c.add(a.get(0));
                a.remove(a.get(0));
            }else {
                c.add((b.get(0)));
                b.remove(b.get(0));
            }
        }
        while (a.size() > 0){
            c.add(a.get(0));
            a.remove(a.get(0));
        }
        while (b.size() > 0){
            c.add(b.get(0));
            b.remove(b.get(0));
        }

    }
}











