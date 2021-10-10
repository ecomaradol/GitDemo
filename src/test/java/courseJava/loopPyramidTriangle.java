package courseJava;

public class loopPyramidTriangle {
    public static void main (String[] args) {
        int k=1;
        for (int i=0; i<4; i++) {
            //System.out.println(i);
            for (int j=1; j <= 4-i; j++) {

                System.out.print( k);
                //System.out.println("\t");
                k++;
            }
            System.out.println("");
        }
        int n=1;
        for (int f=1;f<=4; f++) {
            for (int m=1; m<=f;m++) {
                System.out.print(n);
                System.out.print("\t");
                n++;
            }
            System.out.println("");
        }
    }

}
