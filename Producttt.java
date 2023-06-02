package TNSIndia;
class Product{
    String name;
    double price;
    int totalQuantity;
    static int totalSold;
    Product(String name,double price,int totalQuantity){
        this.name=name;
        this.price=price;
        this.totalQuantity=totalQuantity;
    }
    void sell(int quantity){
        if (totalQuantity>=quantity) {
            totalQuantity = totalQuantity - quantity;
            totalSold+=quantity;
            System.out.println("Congratulations!!,The products are sold");
            System.out.println("The product "+this.name+" is sold:"+quantity);
            System.out.println("The profit of the "+this.name+" is="+quantity*this.price);
            System.out.println("The remaining "+this.name+" are "+this.totalQuantity);
            System.out.println();
        }
        else{
            System.out.println("Sorry,The products can't be sold");
            System.out.println("Not enough Quantity,Only "+this.totalQuantity+" "+this.name+" are left,Please choose Again");
        }
    }
    static int getTotalSold(){
        return totalSold;
    }
}
public class Producttt {
    public static void main(String[] args) {
        Product p1=new Product("TWS",10000,10);
        p1.sell(4);
//        p1.sell(14);
//        System.out.println("Total No of all Products sold are:"+p1.getTotalSold());

        Product p2=new Product("Laptop",100000,10);
        p2.sell(4);
        System.out.println("Total No of all Products sold are:"+Product.getTotalSold());

    }
}
