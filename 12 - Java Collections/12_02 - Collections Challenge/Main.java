import java.util.Map;

public class Main {
    private static StockInventory stockList = new StockInventory();

    public static void main(String[] args) {
        StockItem temp = new StockItem("bread", 1.59, 100);
        stockList.addStock(temp);

        temp = new StockItem("cake", 3.99, 7);
        stockList.addStock(temp);

        temp = new StockItem("chocolate", 0.60, 200);
        stockList.addStock(temp);

        temp = new StockItem("biscuits", 0.50, 75);
        stockList.addStock(temp);

        temp = new StockItem("milk", 0.95, 15);
        stockList.addStock(temp);

        temp = new StockItem("cheese", 2.50, 10);
        stockList.addStock(temp);

        temp = new StockItem("juice", 1.75, 4);
        stockList.addStock(temp);

        temp = new StockItem("butter", 1.40, 19);
        stockList.addStock(temp);

        temp = new StockItem("crisps", 1.00, 26);
        stockList.addStock(temp);

        temp = new StockItem("cake", 2.99, 4);
        stockList.addStock(temp);

        System.out.println(stockList);

        Basket basketOne = new Basket("1st Basket");
        sellItem(basketOne, "chocolate", 12);
        sellItem(basketOne, "biscuits", 8);
        sellItem(basketOne, "crisps", 2);
        removeItem(basketOne, "milk", 3);
        System.out.println(basketOne);

        Basket basketTwo = new Basket("2nd Basket");
        sellItem(basketTwo, "cake", 1);
        sellItem(basketTwo, "butter", 2);
        sellItem(basketTwo, "juice", 4);
        removeItem(basketTwo, "sauce", 6);
        System.out.println(basketTwo);


        for(Map.Entry<String, Double> price : stockList.PriceList().entrySet()){
            System.out.println(price.getKey() + " costs £" + String.format("%.2f", price.getValue()));
        }

    }

    public static int sellItem(Basket basket, String item, int quantity){
        StockItem stockItem = stockList.get(item);

        if(stockItem == null){
            System.out.println(item + " is not available");
            return 0;
        }

        if(stockList.reserveStock(item, quantity) != 0){
            return basket.addToBasket(stockItem, quantity);
        }

        return 0;
    }

    public static int removeItem(Basket basket, String item, int quantity){
        StockItem stockItem = stockList.get(item);

        if(stockItem == null){
            System.out.println(item + " is not available");
            return 0;
        }

        if(basket.removeFromBasket(stockItem, quantity) == quantity){
            return stockList.cancelReservedStock(item, quantity);
        }

        return 0;
    }

    public static void checkout(Basket basket){
        for (Map.Entry<StockItem, Integer> item : basket.Items().entrySet()){
            stockList.removeStock(item.getKey().getName(), item.getValue());
        }
        basket.clearBasket();
    }
}


