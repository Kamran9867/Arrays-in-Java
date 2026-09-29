public class TwoDArray {
    public static void main(String[] args) {

        //declaration
        int[][] arr;
        //allocation
        arr = new int[3][4];
        //initialisation
        int[][] num = {
                {1, 2},
                {2,3,4,5},
                {3,4,4,5,6,7},
                {4}

        };
        int rowLength = num.length;
        //int colLength = num[0].length;
//        System.out.println(num[0][0]);
        for (int rowIndex = 0; rowIndex <= rowLength - 1; rowIndex++) {
            //jaise hi mai kisi new row me aaya
            //same point pr maine use row ka column length find out kr lia
            // current riw-> num[rowIndex].length
            int colLength= num[rowIndex].length;
            for (int col = 0; col <= colLength - 1; col++) {
                System.out.print(" "+ num[rowIndex][col]);
            }
            System.out.println();
        }

        // traversal 2 array
        for(int rowIndex=0; rowIndex<= rowLength-1; rowIndex++){
            for(int col=0; col<=num[rowIndex].length-1; col++){
                System.out.print(num[rowIndex][col]+"     ");
            }
            System.out.println();
        }
    }
}