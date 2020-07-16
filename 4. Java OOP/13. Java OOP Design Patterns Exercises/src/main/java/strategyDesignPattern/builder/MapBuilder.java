package strategyDesignPattern.builder;

import java.util.Map;

public interface MapBuilder<K, V> {
    MyMapBuilder<K, V> entry(K key, V value);
    Map<K, V> build();
}














/*
    Map<K, V> build();
    MapBuilder<K,V> entry(K key, V value);
 */