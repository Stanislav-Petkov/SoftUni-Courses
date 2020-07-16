package ListIterator;

import java.util.Arrays;
import java.util.List;

public class ListlyIterator {
    private List<String> elements;
    private int index;

    public ListlyIterator(String... values) {
        this.elements = Arrays.asList(values);
        this.index = 0;
    }

    public boolean move() {

        if (this.index == this.elements.size() - 1) {
            return false;
        }
        this.index++;
        return true;
    }

    public boolean hasNext() {
        return this.index < this.elements.size() - 1;
    }

    public String getCurrenElement() {
        if (this.elements.size() == 0) {
            throw new UnsupportedOperationException("Invalid Operation!");
        }
        return this.elements.get(this.index);
    }
}

/*
moi opit
public class ListyIterator implements Iterator<String> {
    private String firstElement;
    private List<String> list;
    private int currentIndex;
    private int nextIndex;

    public ListyIterator(List<String> list){
        this.nextIndex = 0;
        this.list = list;
    }
    public boolean move(){
        if(this.next() != null) {
            this.nextIndex = nextIndex + 1;
            return true;
        }
        return false;
    }
    @Override
    public boolean hasNext() {
        return nextIndex < list.size();
    }

    @Override
    public String next() {
        String nextStr = list.get(nextIndex);
        nextIndex = nextIndex + 1;
        return nextStr;
    }

    public String print(){
        if(this.list.isEmpty()){
            return "Invalid Operation";
        }else {
            return list.get(this.currentIndex);
        }
    }
}
 */