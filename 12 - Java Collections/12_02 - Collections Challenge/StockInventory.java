import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class StockInventory {
    private final Map<String, StockItem> inventory;

    public StockInventory()
    {
        this.inventory = new LinkedHashMap<>();
    }

    public int addStock(StockItem item){
        if (item != null){
            // Checks the item from the list if it's available and assigns the item if not
            StockItem inStock = inventory.getOrDefault(item.getName(), item);

            if(inStock != item){
                item.adjustStock(inStock.availableStock());
            }

            inventory.put(item.getName(), item);
            return item.availableStock();
        }

        return 0;
    }

    public int reserveStock(String item, int quantity){
        StockItem inStock = inventory.get(item);

        if((inStock != null) && (quantity > 0)){
            return inStock.reserveItem(quantity);
        }

        return 0;
    }

    public int cancelReservedStock(String item, int quantity){
        StockItem inStock = inventory.get(item);

        if((inStock != null) && (quantity > 0)){
            return inStock.cancelItem(quantity);
        }

        return 0;
    }

    public int removeStock(String item, int quantity){
        StockItem inStock = inventory.get(item);

        if((inStock != null) && (quantity > 0)){
            return inStock.finaliseStock(quantity);
        }

        return 0;
    }

    public StockItem get(String key){
        return inventory.get(key);
    }

    public Map<String, StockItem> Items(){
        return Collections.unmodifiableMap(inventory);
    }

    public Map<String, Double> PriceList(){
        Map<String, Double> prices = new LinkedHashMap<>();
        for(Map.Entry<String, StockItem> item : inventory.entrySet()){
            prices.put(item.getKey(), item.getValue().getPrice());
        }
        return Collections.unmodifiableMap(prices);
    }

    @Override
    public String toString()
    {
        String s = "\nStock List\n";
        double totalCost = 0.0;

        for(Map.Entry<String, StockItem> item : inventory.entrySet()){
            StockItem stockItem = item.getValue();
            double itemValue = stockItem.getPrice() * stockItem.availableStock();

            s = s + stockItem + ", Qty: " + stockItem.availableStock() + ", £" + String.format("%.2f", itemValue) + "\n";
            totalCost += itemValue;
        }

        return s + "Total Stock Value: £" + String.format("%.2f", totalCost);
    }
}
