public class MultpOf2DArray {
    public static void main(String[] args) {
        int[][] numArr= {{1,2,3},{1,2,3}};
        int mul=1;

        for(int i  =0;i< numArr.length; i++){
            for(int col=0;col<=numArr[i].length-1;col++){
                int value= numArr[i][col];
                mul*=value;
            }
        }
        System.out.println(mul);
    }
}
