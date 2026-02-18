package Genrics;

import java.util.Arrays;

public class KakaniList<T> {
    Object[] data;
    final static int DEFAULT_CAPACITY = 10;
    int size = 0;
    public KakaniList(){
        data = new Object[DEFAULT_CAPACITY];
    }
    public void add(T i){
        if(isFull()){
            resize();

        }
        data[size++] = i;
    }

    private void resize() {
        Object[] temp = new Object[data.length*2];
        for(int i =0;i<data.length;i++){
            temp[i] = data[i];

        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }
    public int getSize(){
        return size;
    }
    public void set(T i,int index){
        data[index] = i;
    }
    @Override
    public String toString() {

        return Arrays.toString(data);
    }



}
