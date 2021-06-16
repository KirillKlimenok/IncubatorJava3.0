package dercochenko.com.Modules.Task16;

public abstract class Product {
    private String nameProduct;

    public Product(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public Product() {
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    @Override
    public String toString() {
        return nameProduct;
    }
}

interface Containing{
    void add(Product product);
}
