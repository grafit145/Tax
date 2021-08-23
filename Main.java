package ru.netology;

import java.util.concurrent.atomic.LongAdder;

public class Main {
    public static void main(String[] args) throws InterruptedException {


        LongAdder longAdder = new LongAdder();
        Store store1 = new Store(longAdder);
        Store store2 = new Store(longAdder);
        Store store3 = new Store(longAdder);

        Thread thread1 = new Thread(store1, "Магазин 1");
        Thread thread2 = new Thread(store2, "Магазин 2");
        Thread thread3 = new Thread(store3, "Магазин 3");

        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();

        System.out.println("Сумма:" + longAdder.sum());

    }


}
