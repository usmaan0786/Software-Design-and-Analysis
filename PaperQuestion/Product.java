public class Product {
    private int id;
    private String name;
    private int price;

    public Product(int id, String name, int price)
    {
        setID(id);
        setName(name);
        setPrice(price);
    }

    public void setID(int id)
    {
        if (id > 0)
        {
            this.id = id;
        }
        else
        {
            System.out.println("Invalid ID!!!");
        }
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setPrice(int price)
    {
        if (price >= 0)
        {
            this.price = price;
        }
        else
        {
            System.out.println("Invalid Price!!!");
        }
    }
    public int getID()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public int getPrice()
    {
        return price;
    }
}
