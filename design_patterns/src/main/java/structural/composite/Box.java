package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Box implements ShippingObject{
    private final List<ShippingObject> items;

    public Box(){
        items = new ArrayList<>();
    }

    public void addItem(ShippingObject item){
        items.add(item);
    }

    @Override
    public int getPrice() {
        int totalSum = 0;
        for (ShippingObject item : items) {
            totalSum += item.getPrice();
        }

        return totalSum;
    }
}
