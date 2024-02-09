package objectArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Product implements Comparable<Product>{


    private double weight;
    private double price;
    private int id;

    public Product(double weight, double price, int id) {
        this.weight = weight;
        this.price = price;
        this.id = id;
    }

    @Override
    public int compareTo(Product p ) {
        if (this.price>p.price){
            return 1;
        }else return -1;
    }

    @Override
    public String toString() {
        return "Product{" +
                "weight=" + weight +
                ", price=" + price +
                ", id=" + id +
                '}';
    }
}
class Main{
    public static void main(String[] a){
        List<Product> list=new ArrayList<>();
        Product p1=new Product(60.5,78,1);
        Product p2=new Product(68.7,50,2);
        Product p3=new Product(62.1,90,3);
        list.addAll(List.of(p1,p2,p3));
        Collections.sort(list);
        System.out.println(list);

    }

}
