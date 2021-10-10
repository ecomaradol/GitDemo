package courseJava;

public class firstClass {
        int a =5;
    public void getData() {
        System.out.println("I am");
    }

    public static void main (String[] args) {
        firstClass fn= new firstClass(); //создаем объект fn класса java.firstClass
        secondClass sn= new secondClass();
        sn.setData(); //вызываем метод setData из класса java.secondClass

        fn.getData(); //объект fn вызывает метод getData
        System.out.println(fn.a);
        System.out.println("Hi");
    }
}
