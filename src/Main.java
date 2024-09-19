import mylinkedlist.ProductSLL;

public class Main {
    public static void main(String[] args) {
        ProductSLL list = new ProductSLL();
        list.addHead("P01", "Pepsi", 2000, 12);
        list.addTail("P02", "Coke", 2000, 50);
        list.addHead("P03", "Heniken", 5000, 12);
        list.addTail("P04", "C2", 4000, 15);
        list.addHead("P05", "O2", 4000, 15);
        list.display();

        list.removeHead();
        System.out.println(list.sum() + "");

        list.listMinPrice();
    }
}