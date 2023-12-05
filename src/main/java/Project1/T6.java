package Project1;

public class T6 {
    public static void main(String[] args) {
        String a = "Star";
        String b = "Moon";
        System.out.println("String a before swapping contains "+a);
        System.out.println("String b before swapping contains "+b);
        a = a.concat(b);
        b = b.concat(a);

        a = a.substring(4, a.length());
        b = b.substring(4, 8);
        System.out.println("String a after swapping contains "+a);
        System.out.println("String b after swapping contains "+b);
    }
}
