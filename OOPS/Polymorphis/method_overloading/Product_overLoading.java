class Product
{
    static int productId = 1001;
    static String productName = "Apple";
    static double price = 450.50;
    static String brand = "Himsagar";

    public static void search(int productId){
        // when it is static variable then you can not use "this()", you have to use only "classname.variable".
        if(Product.productId == productId){
        System.out.println("The product is found with id: "+productId);
        }else{
            System.out.println("Product not found");
        }
    }
    public static void search(String productName){
        //only primitive data type you can compare with "==". but when its come to non-primitive then you have to do ".equals(String)".
        if(Product.productName.equals(productName)){
        System.out.println("The product is found with name: "+productName);
        }else{
            System.out.println("Product not found");
        } 
    }
    public static void search(double price){
        if(Product.price == price){
        System.out.println("The product is found with price: "+ price);
        }
    }
    public static void search(int productId, double price){
        if(Product.productId == productId && Product.price == price){
        System.out.println("The product is found with id: "+ productId + " and product price: "+price);
        }else{
            System.out.println("Product is not found");
        }
    }
    public static void search(int productId, String brand, double price){
        if(Product.productId == productId && Product.brand.equals(brand) && Product.price == price){
        System.out.println("The product is found with id: "+ productId + " and product brand: "+brand+ " and price: "+price);
        }else{
            System.out.println("Product is not found");
        }
    }
}

class Product_overLoading
{
    public static void main(String [] args){

    Product.search(1001);
    Product.search("Apple");
    Product.search(450.50D);
    Product.search(1001, 450.50D);
    Product.search(1001, "Himsagar", 450.50D);
    }
}
