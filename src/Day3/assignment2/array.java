//import java.util.Arrays;
package Day3.assignment2;

import java.util.Arrays;

public class array {
    public static void main (String args[]) {
        int fam[][] = {{1,1,1},{1,1,1}};
        int sam[][] = {{2,2,2},{2,2,2}};
        int dam[][] = new int[2][3];

        System.out.println(Arrays.deepToString(fam));
        System.out.println(Arrays.deepToString(sam));

        for (int i = 0; i<2; i++){
            for (int j = 0; j<3; j++){
                dam[i][j] = fam[i][j]+sam[i][j];
                System.out.print(dam[i][j]+" ");
            }
            System.out.println();
        }


//        for (int i = 0; i < fam.length; i++) {
//            for (int j = 0; j < fam[i].length; j++) {
//                System.out.print((fam[i][j]));
//            }
//            System.out.print("\n");
//        }

    }
}

