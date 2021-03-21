public class SearchTree implements NodeList
{
    
    private ListItem root = null;
    
    public SearchTree(ListItem root)
    {
        this.root = root;
    }
    
    @Override public ListItem getRoot()
    {
        return this.root;
    }
    
    @Override public boolean addItem(ListItem newItem)
    {
        if (this.root == null)
        {
            this.root = newItem;
            return true;
        }
        
        ListItem currentItem = this.root;
        while (currentItem != null)
        {
            int comparison = (currentItem.compareTo(newItem));
            if (comparison < 0)
            {
                if (currentItem.next() != null)
                {
                    currentItem = currentItem.next();
                }
                else
                {
                    currentItem.setNext(newItem);
                    return true;
                }
            }
            else if (comparison > 0)
            {
                if (currentItem.previous() != null)
                {
                    currentItem = currentItem.previous();
                }
                else
                {
                    currentItem.setPrevious(newItem);
                    return true;
                }
            }
            else
            {
                System.out.println(newItem.getValue() + " is already present");
                return false;
            }
        }
        return false;
    }
    
    @Override public boolean removeItem(ListItem item)
    {
        if (item != null)
        {
            System.out.println("Deleting item: " + item.getValue());
        }
        
        ListItem currentItem = this.root;
        ListItem parentItem = currentItem;
        
        while (currentItem != null)
        {
            int comparison = (currentItem.compareTo(item));
            if (comparison < 0)
            {
                parentItem = currentItem;
                currentItem = currentItem.next();
            }
            else if (comparison > 0)
            {
                parentItem = currentItem;
                currentItem = currentItem.previous();
            }
            else
            {
                performRemoval(currentItem, parentItem);
                return true;
            }
        }
        return false;
    }
    
    @Override public void traverse(ListItem root)
    {
        // Using a recursive method
        if (root != null)
        {
            traverse(root.previous());
            System.out.println(root.getValue());
            traverse(root.next());
        }
    }
    
    private void performRemoval(ListItem currentItem, ListItem parentItem)
    {
        if (currentItem.next() == null)
        {
            if (parentItem.next() == currentItem)
            {
                parentItem.setNext(currentItem.previous());
            }
            else if (parentItem.previous() == currentItem)
            {
                parentItem.setPrevious(currentItem.previous());
            }
            else
            {
                this.root = currentItem.previous();
            }
        }
        else if (currentItem.previous() == null)
        {
            if (parentItem.next() == currentItem)
            {
                parentItem.setNext(currentItem.next());
            }
            else if (parentItem.previous() == currentItem)
            {
                parentItem.setPrevious(currentItem.next());
            }
        }
        else
        {
            ListItem current = currentItem.next();
            ListItem leftParent = currentItem;
            while (current.previous() != null)
            {
                leftParent = current;
                current = current.previous();
            } currentItem.setValue(current.getValue());
            if (leftParent == currentItem)
            {
                currentItem.setNext(current.next());
            }
            else
            {
                leftParent.setPrevious(current.next());
            }
        }
    }
    
}