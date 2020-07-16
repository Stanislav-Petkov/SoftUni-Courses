package Collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListlyIterator implements Iterable<String>  {
    private List<String> elements;
    private int index;

    public ListlyIterator(String... values){
        this.elements = Arrays.asList(values);
        this.index = 0;
    }

    public String next() {
        return this.elements.get(index++);
    }

    public boolean move(){
        if(!this.hasNext()){
            return false;
        }
        this.index++;
        return true;
    }
    public boolean hasNext(){
        return this.index < this.elements.size();
    }

    public String getCurrentElement(){
        if(this.elements.size() == 0){
            throw new UnsupportedOperationException("Invalid Operation!");
        }
        return this.elements.get(this.index);
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return this.index < elements.size();
            }

            @Override
            public String next() {
                return elements.get(this.index++);
            }
        };
    }
}
