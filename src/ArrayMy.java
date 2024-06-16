public class ArrayMy {

ArrayMy( int[] array ) {
        double sum = 0;
        for (int i : array) {
            System.out.print (i + " ");
            sum = sum + i;
        }
        double avaerage = 0;


        avaerage = sum / array.length;
        System.out.println ("");
        System.out.println ("" + avaerage);
    }}




