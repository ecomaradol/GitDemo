package courseJava;

import java.util.ArrayList;

public class ArrayAndArrayList {
    public static void main (String[] args) {

        int[] arrray = new int[5]; //create new array
        arrray[0] = 1; //заполняем массив значениями
        arrray[1] = 2;
        arrray[2] = 3;
        arrray[3] = 4;
        arrray[4] = 5;

        int[] arr = {1,2,3,4,5}; //или так сразу создали и сразу заполняем массив значениями

        ArrayList a = new ArrayList(); //создали объект а класса ArrayList
        a.add("qwe"); // добавили в ArrayList значения через объект а
        a.add("zxc");
        a.add("iop");
        System.out.println(a.get(2)); //получили значение элемента массива с индексом 2
    }
}
