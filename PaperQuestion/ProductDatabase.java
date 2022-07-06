public class ProductDatabase {
    private Product[] product;

    public ProductDatabase()
    {
        product = new Product[4];
       product[0] = new Product(2, "Biscuits", 5000);
        product[1] = new Product(3, "Patties", 4000);
        product[2] = new Product(4, "Cakes", 12000);

    }

    public void showProduct()
    {
        System.out.println("ID " + " Name " + " Price ");
        for(int i = 0; i < 3 ; i++ )
        {
            System.out.println(product[i].getID() + " " + product[i].getName() + " " + product[i].getPrice());
        }
        System.out.println("Check");
    }
}
