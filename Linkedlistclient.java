public class Linkedlistclient {
    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
        list.addfirst(10);
        list.addfirst(20);
        list.addfirst(30);

        list.display();
        list.addlast(40);
        list.display();
        list.addatindex(88 , 2);
        list.display();
        System.out.println(list.Getatindex(2));
        System.out.println(list.getfirst());
        System.out.println(list.getlast());
        list.removefirst();
        list.display();
        list.removelast();
        list.display();
        list.removeatindex(1);
        list.display();
        System.out.println();
    }
}
