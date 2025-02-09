package summary._01_23_;

public class Basket {
    private Item[] choosedItems = new Item[0];

    public Basket(Item[] choosedItems) {
        this.choosedItems = choosedItems;
    }

    public Basket() {
    }

    public Item[] getChoosedItems() {
        return choosedItems;
    }

    public double getTotalPrice(){
        double result = 0;
        for (Item item : choosedItems){
            result += item.getPrice();
        }
        return  result ;
    };

    public double getAvgRating(){
        double rating = 0;
        for (Item item : choosedItems){
            rating += item.getRating() ;
        }
        return (Math.round((rating / choosedItems.length * 100.0) / 100.0));
    };

    public void addItems(Item item) {
        int sizeBasket = choosedItems.length;
        Item[] newItems = new Item[sizeBasket + 1];
        for (int i = 0; i < sizeBasket; i++) {
            newItems[i] = choosedItems[i];
        }
        newItems[newItems.length - 1] = item;
        choosedItems = newItems;
    }
}
