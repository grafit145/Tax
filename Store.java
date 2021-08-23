package ru.netology;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.atomic.LongAdder;

public class Store implements Runnable{
    private LongAdder adder = new LongAdder();
    private Random random = new Random();
    private int[] arr;

    public Store(LongAdder adder){
        this.adder = adder;
        initialize();
    }
     public int[] getArr(){
        return arr;
     }
     private void initialize(){
        int size = random.nextInt(10);
        arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = random.nextInt(999) * 10;
        }
     }
     @Override
     public void run(){
         Arrays.stream(getArr()).forEach(adder::add);
     }

}
