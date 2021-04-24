public class StockItem implements Comparable<StockItem>
{
    private final String name;
    private double price;
    private int stockQuantity;
    private int reserved;

    public StockItem(String name, double price)
    {
        this.name = name;
        this.price = price;
        this.stockQuantity = 0;
        this.reserved = 0;
    }

    public StockItem(String name, double price, int stockQuantity)
    {
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
        this.reserved = 0;
    }

    public String getName()
    {
        return name;
    }

    public double getPrice()
    {
        return price;
    }

    public int availableStock()
    {
        return stockQuantity - reserved;
    }

    public void setPrice(double price)
    {
        if (price > 0.0)
        {
            this.price = price;
        }
    }

    public int reserveItem(int quantity){
        if (quantity <= availableStock()){
            reserved += quantity;
            return quantity;
        }

        return 0;
    }

    public int cancelItem(int quantity){
        if (quantity <= reserved){
            reserved -= quantity;
            return quantity;
        }

        return 0;
    }

    public void adjustStock(int quantity)
    {
        int newQuantity = this.stockQuantity + quantity;
        if (newQuantity >= 0)
        {
            this.stockQuantity = newQuantity;
        }
    }

    public int finaliseStock(int quantity){
        if(quantity <= reserved){
            stockQuantity -= quantity;
            reserved -= quantity;
            return quantity;
        }

        return 0;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }

        if ((obj == null) || ((obj.getClass() != this.getClass())))
        {
            return false;
        }

        String objName = ((StockItem) obj).getName();
        return this.name.equals(objName);
    }

    @Override
    public int hashCode()
    {
        return this.name.hashCode() + 28;
    }

    @Override
    public int compareTo(StockItem o)
    {
        if (this == o)
        {
            return 0;
        }

        if (o != null){
            return this.name.compareTo(o.getName());
        }

        throw new NullPointerException();
    }

    @Override
    public String toString()
    {
        return this.name + ": £" + String.format("%.2f", this.price) + ". Reserved: " + this.reserved;
    }
}
