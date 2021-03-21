public class Node extends ListItem
{
    
    public Node(Object value)
    {
        super(value);
    }
    
    @Override ListItem next()
    {
        return this.rightItem;
    }
    
    @Override ListItem previous()
    {
        return this.leftItem;
    }
    
    @Override ListItem setNext(ListItem item)
    {
        this.rightItem = item;
        return this.rightItem;
    }
    
    @Override ListItem setPrevious(ListItem item)
    {
        this.leftItem = item;
        return this.leftItem;
    }
    
    @Override int compareTo(ListItem item)
    {
        if (item != null)
        {
            return ((String) super.getValue()).compareTo((String) item.getValue());
        }
        else
        {
            return -1;
        }
    }
    
}