package dercochenko.com.Modules.Task16;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class Store {
    private Rack[] racks;
    private AtomicInteger countRackStores = new AtomicInteger(0);
    public final int MAX_SIZE;
    private boolean isInventoried = false;

    public Store() {
        this.MAX_SIZE = 100;
        racks = new Rack[MAX_SIZE];
    }

    public Store(int MAX_SIZE) {
        this.MAX_SIZE = MAX_SIZE;
        racks = new Rack[MAX_SIZE];
    }

    public void addContainer(Rack rack) {
        if (countRackStores.get() < MAX_SIZE) {
            racks[countRackStores.get()] = rack;

            countRackStores.incrementAndGet();
            isInventoried = false;
        }
    }

    public void makeInventoried() {
        int count = 0;
        int countBread = 0, countMilk = 0, countPasta = 0, countPorridge = 0;
        String name;
        for (Rack r :
                racks) {
            if (r.getProducts()[0] instanceof Bread) {
                countBread += r.countProduct();
            } else if (r.getProducts()[0] instanceof Milk) {
                countMilk += r.countProduct();
            } else if (r.getProducts()[0] instanceof Pasta) {
                countPasta += r.countProduct();
                continue;
            } else if (r.getProducts()[0] instanceof Porridge) {
                countPorridge += r.countProduct();
            }
        }

        System.out.println("Bread: " + countBread);
        System.out.println("Milk: " + countMilk);
        System.out.println("Pasta: " + countPasta);
        System.out.println("Porridge: " + countPorridge);
        isInventoried = true;
    }


    public Rack[] getRackStores() {
        return racks.clone();
    }

    public AtomicInteger getCountRackStores() {
        return countRackStores;
    }

    public int getMAX_SIZE() {
        return MAX_SIZE;
    }

    public boolean isInventoried() {
        return isInventoried;
    }

    @Override
    public String toString() {
        return "Store{" +
                "racks=" + Arrays.toString(racks) +
                '}';
    }
}
