package patternsex.iterator.system;

import java.util.List;

public class RandomIterator<T> implements Iterator<T>{

    private T[] list;
    private int currentIndex;

    public RandomIterator(T[] list){
        this.currentIndex=0;
        this.list = list;
        shuffle();
    }

    private void shuffle() {
        int n = list.length;
        for (int i = n - 1; i > 0; i--) {
            // Generate a random index between 0 and i (inclusive)
            int j = (int) (Math.random() * (i + 1));
            // Swap elements at indices i and j
            T temp = list[i];
            list[i] = list[j];
            list[j] = temp;
        }
    }

    @Override
    public Boolean hasNext() {
        return currentIndex < list.length;
    }

    @Override
    public T next() {

        T obj = null;
        if(hasNext()){
            obj = list[currentIndex];
            currentIndex++;
        }

        return obj;
    }
}
