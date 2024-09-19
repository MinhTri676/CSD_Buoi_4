package mylinkedlist;

public class ProductSLL {
    private Node head;

    public void addHead(String id, String name, float price, int quantity) {
        Node newNode = new Node(id, name, price, quantity);
        newNode.next = head;
        head = newNode;
    }

    public void display() {
        Node newNode = head;
        while (newNode != null) {
            System.out.println(newNode.toString() + "");
            newNode = newNode.next;
        }
        System.out.print("");
    }

    public void addTail(String id, String name, float price, int quantity) {
        Node newNode = new Node(id, name, price, quantity);
        if (head == null) {
            head = newNode;
            return;
        } else {
            Node tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = newNode;
        }
    }

    public void removeHead() {
        if (head == null) {
            return;
        } else {
            head = head.next;
        }
    }

    public int sum() {
        Node newNode = head;
        int sum = 0;
        while (newNode != null) {
            sum += newNode.getQuantity();
            newNode = newNode.next;
        }
        return sum;
    }

    public void deleteFirst(){
        if (head == null){
            return;
        }
        head = head.next;
    }

    public void deleteLast(){
        if (head == null) {
            return;
        }
        if(head.next == null){
            deleteFirst();
        }
        Node tmp = head;
        Node pre = null;
        while (tmp.next != null){
            pre = tmp;
            tmp = tmp.next;
        }
        pre.next = null;

    }

    public void sort(){
        if (head == null){
            return;
        }
        boolean flag = false;
        Node tmp = head;
        do {
            while (tmp.next != null){
                if (tmp.getPrice() > tmp.next.getPrice()){
                    float a = tmp.getPrice();
                    tmp.setPrice(tmp.next.getPrice());
                    tmp.next.setPrice(a);
                    flag = true;
                }
                tmp = tmp.next;
            }
        }while (flag);
    }

    private Node MinPrice() {
        if (head == null){
            return null;
        }
        Node newNode = head;
        Node minPrice = null;
        while (newNode.next != null) {
            if (newNode.getPrice() < newNode.next.getPrice()) {
                minPrice = newNode;
            }
            newNode = newNode.next;
        }
        return minPrice;
    }

    public void listMinPrice(){
        Node newNode = head;
        while (newNode != null){
            if (newNode.getPrice() == MinPrice().getPrice()){
                System.out.println(newNode.toString());
            }
            newNode = newNode.next;
        }
    }
}
