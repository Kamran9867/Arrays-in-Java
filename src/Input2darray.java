import java.util.Scanner;

public class Input2darray {
    public static void main(String[] args) {
        int[][] arr = new int[3][4];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= arr[i].length - 1; j++) {
                System.out.println("provide value for row =" + i + "and column" + j);
                arr[i][j] = input.nextInt();

            }
        }
        // display/ print
        for (int rowIndex = 0; rowIndex <= arr.length - 1; rowIndex++) {
            for (int col = 0; col <= arr[rowIndex].length - 1; col++) {
                System.out.print(arr[rowIndex][col] + "     ");
            }
            System.out.println();

        }
    }
}
