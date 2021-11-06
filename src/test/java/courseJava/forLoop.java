package courseJava;

public class forLoop {
    public static void main(String[] args){

        for (int i=0; i<10; i= i+2) {
            System.out.println(i);
        }

        int [] arr = {1,2,3,6,4};
        for (int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }

        String arrS[] = {"dfg", "dfrty", "wer"};
        for (int i=0; i<arrS.length; i++){
            System.out.println(arrS[i]);
        }
    }
}

