package dataStructures.hashTable;

import java.util.ArrayList;

public class HashTable<K,V> {
    private class Pair<K,V>{
        public K key;
        public V value;

        public Pair(){ }
        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private ArrayList<Pair<K,V>>[] pairsArray = new ArrayList[1000];

    private int getKeyHashValue(K key) {
        return key.toString().hashCode() % this.pairsArray.length;
    }

    public void put(K key, V value) {
        int keyHashValue = getKeyHashValue(key);
        if(containsKey(key)) {
            Pair<K,V> newPair = new Pair<K,V>(key,value);
            pairsArray[keyHashValue].add(newPair);
        } else {
            ArrayList<Pair<K,V>> arrayList = new ArrayList<>();
            Pair<K,V> newPair = new Pair<K,V>(key,value);
            arrayList.add(newPair);
            pairsArray[keyHashValue] = arrayList;
        }
    }

    public boolean containsKey(K key) {
        int keyHashValue = getKeyHashValue(key);
        if(pairsArray[keyHashValue] != null) {
            for(Pair pair:pairsArray[keyHashValue]) {
                if(pair.key == key) return true;
            }
        }
        return false;
    }

    public void remove(K key) {
        int keyHashValue = getKeyHashValue(key);
        if(pairsArray[keyHashValue] != null) {
            pairsArray[keyHashValue].removeIf(pair->{
                return pair.key == key;
            });
        }
    }
}
