package bt;

import java.io.*;
import java.util.ArrayList;
//public class Product implements Serializable {
//    private String name;
//    private int id = 0;
//    private String manufacturer;
//    private int price;
//    private String descriptions;
//
//    public Product(int id, String name, String manufacturer, int price, String descriptions){
//        this.id = id;
//        this.name = name;
//        this.manufacturer = manufacturer;
//        this.price = price;
//        this.descriptions = descriptions;
//        id++;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setManufacturer(String manufacturer) {
//        this.manufacturer = manufacturer;
//    }
//
//    public void setPrice(int price) {
//        this.price = price;
//    }
//
//    public void setDescriptions(String descriptions) {
//        this.descriptions = descriptions;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public String getManufacturer() {
//        return manufacturer;
//    }
//
//    public int getPrice() {
//        return price;
//    }
//
//    public String getDescriptions() {
//        return descriptions;
//    }
//
//    public String toString() {
//        return "Mã sản phẩm: " + id + " ,Tên sản phẩm: " + name + " ,Hãng sản xuất: " + manufacturer + " ,Giá: " + price + " ,Các mô tả khác: " + descriptions + ".";
//    }
//}
//class ProductList{
//    public static void main(String[] args) throws Exception {
//        int id = 0;
//        File files = new File("Temp/Product.dat");
//        if (!files.exists()) {
//            files.createNewFile();
//        }
//        Product products = new Product(id, "a", "b", 1, "c");
//        products.toString();
//        inWriter(files , products);
//
//    }
//
//    public static int Id(File files){
//        int id = 0;
//        try{
//            ObjectInputStream reader = new ObjectInputStream(new FileInputStream(files));
//            Product productList = (Product) reader.readObject();
//            id = productList.getId();
//            reader.close();
//        } catch (IOException | ClassNotFoundException e) {
//            System.out.println("Không có sản phẩm.");
//        }
//        return id;
//
//    }
//
//    public static void inWriter(File files, Object a){
//        int id = Id(files);
//        try{
//            ObjectOutputStream product = new ObjectOutputStream(new FileOutputStream(files));
//            product.writeObject(a);
//            product.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}

public class Product implements Serializable {
    private String productName;
    private String productVendor;
    private double productPrice;
    private int productId;
    private static int nextId=1;

    public Product(String name,String vendor,double price){
        this.productName=name;
        this.productVendor=vendor;
        this.productPrice=price;
        this.productId=nextId;
        nextId++;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductVendor() {
        return productVendor;
    }

    public void setProductVendor(String productVendor) {
        this.productVendor = productVendor;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductId() {
        return productId;
    }

    @Override
    public String toString(){
        return "[Product ID: "+getProductId()+" ,Product Name: "+getProductName()+" , Product Vendor: "+getProductVendor()+" , Product Price: "+getProductPrice()+" ]";
    }
}

class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Product product1= new Product("Xiao mi","China",1562.42);
        Product product2= new Product("Iphone X","US",2562.42);
        Product product3= new Product("Redmi","China",5562.42);
        Product product4= new Product("Samsung","Korean",25562.42);
        Product product5= new Product("LG","China",24562.42);

        String string = product1.toString();

        OutputStream outputStream=new FileOutputStream("Temp\\product.dat");

        ObjectOutputStream objectOutputStream=new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(product1);
        objectOutputStream.writeObject(product2);
        objectOutputStream.writeObject(product3);
        objectOutputStream.writeObject(product4);
        objectOutputStream.writeObject(product5);

        InputStream inputStream=new FileInputStream("Temp/product.dat");

        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);

        ArrayList<Product> myList= new ArrayList<>();

        for (int i =0 ; i < 5 ; i++){
            myList.add((Product)objectInputStream.readObject());
        }
        //forEach duyet tung phan tu
        myList.forEach(System.out::println);
    }
}