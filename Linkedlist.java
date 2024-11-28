import java.util.*;
public class  Linkedlist {
    private class Node {
        int val;
        Node next;
    }
    private Node head;// 1st node address yaad krega every LinkedList
    private Node tail;// last node address yaad krega every LinkedList
    private int size;// total number of Node in LinkedList
    //o(1)
    public void addfirst(int item) {
        Node nn = new Node();
        nn.val = item;
        if (size == 0) {
            this.head = nn;
            this.tail = nn;
            this.size++;
        } else {
            nn.next = head;
            head = nn;
            this.size++;
        }
    }
    // o(1)
    public void addlast(int item) {
        if (size == 0) {
            addfirst(item);
        } else {
            Node nn = new Node();
            nn.val = item;
            tail.next = nn;
            tail = nn;
            size++;
        }
    }
    //O(1)
    public int getfirst()  {
        return head.val;
    }
    // O(1)
    public int getlast()  {
        return tail.val;
    }
    // O(N)
    public int Getatindex(int k)  {
        return GetNode(k).val;
    }

    // O(N)
    public void addatindex(int item , int k) {
        if (k == 0) {
            addfirst(item);
        } else if (k == size - 1) {
            addlast(item);
        } else {
            Node nn = new Node();
            nn.val = item;
            Node k_1th = GetNode(k - 1);
            nn.next = k_1th.next;
            k_1th.next = nn;
            size++;
        }
    }
    private Node GetNode(int k)  {
        Node temp = head;
        for (int i = 1; i <= k; i++) {
            temp = temp.next;
        }
        return temp;
    }
    public int removefirst(){
        Node temp = head;
        if(size==1){
            head=null;
            tail=null;
        }
        else{
            head=head.next;
            temp.next=null;
        }
        size--;
        return temp.val;
    }
    public int removelast(){

        if(size==1){
            return removefirst();
        }
        else{
            Node prev = GetNode(size - 2);
            Node temp= tail;
            tail= prev;
            tail.next=null;
            size--;
            return temp.val;
        }
    }
    public int removeatindex(int k)  {
        if(k==0){
            return removefirst();
        }
        else if(k==size-1){
            return removelast();
        }
        else{
            Node prev = GetNode(k-1);
            Node curr = prev.next;
            prev.next=curr.next;
            size--;
            return curr.val;
        }
    }
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " --> ");
            temp = temp.next;
        }
        System.out.println(".");
    }

}
