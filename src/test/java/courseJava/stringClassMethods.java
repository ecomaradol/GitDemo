package courseJava;

public class stringClassMethods {

    public static void main (String[] args){
//Строка - это объект !!!!
        String a ="Heilo";
        System.out.println(a.charAt(2)); //выводит символ на позиции 2//начиная с 0
        System.out.println(a.indexOf("e")); //выводит индекс буквы "e"
        System.out.println(a.substring(2,4)); //выводит подстроку со 2-го (включительно) до 4 (не включит)
        System.out.println(a.substring(1)); //выводит подстроку с 1-го индекса (включительно) и до конца строки
        System.out.println(a.concat(" me")); //склеивает строку а и me
        System.out.println(a.trim()); //обрезает лидирующие пробелы
        System.out.println(a.toLowerCase()); //приводит к нижнему регистру
        System.out.println(a.toUpperCase()); // приводит к верхнему регистру
        String arr[]=a.split("i"); //разделяет строку на 2 массива по i. i удаляется
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(a.replace("i", "Y")); //заменяет символ i на Y

            for (int i =a.length()-1; i>=0; i--) {          //обратное отображение строки
                System.out.println(a.charAt(i));
            }
    }
}

