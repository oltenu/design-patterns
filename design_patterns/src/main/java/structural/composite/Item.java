package structural.composite;

public class Item implements ShippingObject{
    private final int price;

    public Item(int price){
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
