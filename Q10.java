import java.util.*;
class Orders {
    HashMap<String,Double> order = new HashMap<String, Double>();
    List<String> completedorder = new ArrayList<String>();
    Queue<String> queue = new PriorityQueue<String>();


    void addorder(String orderid,double amount){
        order.put(orderid,amount);
        System.out.println("order is added");
    }
    void removeorder(String orderid){
        order.remove(orderid);
        System.out.println("Order is removed");
    }
    void completeorder(String orderid){
        completedorder.add(orderid);
        System.out.println("order is completed");
    }
}
class Customer {   // this class is used to maintain customer details
    private String name;
    private String token;
    Cashier cashier;
    double amount;
    String orderid;
    String customername;

    void placeOrder() {
        token = cashier.AcceptOrderAndAddCustomerToCustomerList(customername,orderid,amount);
        System.out.println("This is the order token: " + token);
    }
    boolean waitingState(){
        System.out.println("Customer" + this.name + "is waiting");
        return true;
    }

    boolean drinkingState() {
        System.out.println("Customer " + this.name + " has collected coffee");
        return true;
    }
}


class Cashier extends Orders {
    String cashiername;
    List<String> customerList = new ArrayList<String>();

    String AcceptOrderAndAddCustomerToCustomerList(String customername,String orderid,double amount){
        addorder(orderid,amount);
        customerList.add(customername);
        System.out.println("Order accepted");
        return "token";
    }
    void addordertoorderqueue(String orderid){
        queue.add(orderid);
    }
}
//this class is used to maintain Barista activity
class Barista extends Orders{
    String Baristaname;
    String ordertobeprepared;
    Cashier cash= new Cashier();
    void Cofeeprepared(){
        completeorder("Coffee");
    }
    void orderidReady(String token){
        System.out.println("order for"+token+"is ready");
    }
    void getnextorderfromorderqueue(){
        ordertobeprepared=queue.remove();
    }
}
class Q10{  //to perforn different operations
public static void main(String[] args){

        }
        }
