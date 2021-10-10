package courseJava;

public class whileLoop {

    public static void main(String[] args) {
        int i=0;
        while (i<10) { //в ()должно быть всегда TRUE
            System.out.println(i);
            i++;
        }
        System.out.println("---");

        int a=10;
        while (a>0) {
            System.out.println(a);
            a--;
        }
        System.out.println("---");

        int s=20;
        do {
            System.out.println(s);
            s++;

        } while (s<30);

    }
}
