package dercochenko.com.Modules.Task16;

import java.util.concurrent.atomic.AtomicInteger;

public class Rack implements Containing {
    public final int MAX_SIZE;
    private Product[] products;
    private AtomicInteger a = new AtomicInteger(0);

    public Rack() {
        MAX_SIZE = 80;
        products = new Product[MAX_SIZE];
    }

    public Rack(int MAX_SIZE) {
        this.MAX_SIZE = MAX_SIZE;
        products = new Product[MAX_SIZE];
    }

    @Override
    public void add(Product product) {
        if (a.get() < MAX_SIZE) {
            products[a.get()] = product;
            a.incrementAndGet();
        }
    }

    public int getMaxSize() {
        return MAX_SIZE;
    }

    public Product[] getProducts() {
        return products.clone();
    }

    public int countProduct() {
        return a.get();
    }

}
