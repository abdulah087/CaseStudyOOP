// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args){

        Inventory inventory = new Inventory();

        SmartPhone phone = new SmartPhone(1001, "Redmi Note 10", 27500, 69, 500, ProductType.ELECTRONICS, 15, 25, "Android 12",256,20);
        inventory.addProduct(phone);

        SmartPhone phone1 = new SmartPhone(1002, "Nokia 3310", 1200, 100, 200, ProductType.ELECTRONICS, 5, 30 , "Java",1,2);
        inventory.addProduct(phone1);

        System.out.println("Product Having ID 1001 is " +inventory.searchByID(1001));

        inventory.deleteProduct(phone);

        Laptop laptop = new Laptop(1003, "Hp EliteBook", 1680, 1080, 10000, ProductType.ELECTRONICS, 10, 50, Processor.x86,12,1080,720);
        inventory.addProduct(laptop);

        inventory.updateProduct(3, Processor.ARM, 32, 1680, 1080, "Dell Lattitude", 1000, 10, 50, 50, 12);

        Product[] product = inventory.searchByCategory(ProductType.ELECTRONICS);
        System.out.println("Search By Category Results Are:");
        if(product[0]==null){
            System.out.println("No Products Found.");
        }
        else{
            for(int i=0;i<product.length;i++){
                if(product[i]==null) break;
                System.out.println(product[i]);
            }
        }

        Product[] product1 = inventory.getLowStockProducts();
        System.out.println("Low In Stock Products Are:");
        if(product1[0]==null){
            System.out.println("No Products Found.");
        }
        else{
            for(int i=0;i<product1.length;i++){
                if(product1[i]==null) break;
                System.out.println(product1[i]);
            }
        }

        inventory.setThisMonthSale(50);
        System.out.println("This Month's Sales Are:"+ inventory.getSaleByMonth(1));


    }

}