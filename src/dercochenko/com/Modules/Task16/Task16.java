package dercochenko.com.Modules.Task16;

/**
 * this program work very slow, and do not usability. If we add new Product, we rewrite very large code block. I think this easy to do, but now i don't know why
 */
public class Task16 {
    public static void main(String[] args) {
        Rack rackWithBread = new Rack(30);
        Rack rackWithBread2 = new Rack(40);
        Rack rackWithBread3 = new Rack(40);
        Rack rackWithMilk = new Rack(40);
        Rack rackWithMilk2 = new Rack(45);
        Rack rackWithPasta = new Rack(70);
        Rack rackWithPorridge = new Rack(60);
        Store store = new Store(7);

        fullingRack(rackWithBread, new Bread());
        fullingRack(rackWithBread2, new Bread());
        fullingRack(rackWithBread3, new Bread());
        fullingRack(rackWithMilk, new Milk());
        fullingRack(rackWithMilk2, new Milk());
        fullingRack(rackWithPasta, new Pasta());
        fullingRack(rackWithPorridge, new Porridge());

        store.addContainer(rackWithBread);
        store.addContainer(rackWithBread2);
        store.addContainer(rackWithBread3);
        store.addContainer(rackWithMilk);
        store.addContainer(rackWithMilk2);
        store.addContainer(rackWithPasta);
        store.addContainer(rackWithPorridge);

        store.makeInventoried();

    }

    public static void fullingRack(Rack rack, Product product) {
        for (int i = 0; i < rack.MAX_SIZE; i++) {
            rack.add(product);
        }
    }

}
