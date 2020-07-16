import java.lang.reflect.Array;

public class ArrayCreator<T> {


    public static <T> T[] create(int lenght, T item){
        T[] array = (T[]) Array.newInstance(item.getClass(), lenght);
        for (int i = 0; i < array.length; i++) {
            array[i] = item;
        }
        return array;
    }

    public static <T> T[] create(Class<T> clazz, int length, T item ){
        T[] array = (T[]) Array.newInstance(clazz,length);
        for (int i = 0; i < array.length; i++) {
            array[i] = item;
        }
        return array;
    }
}

