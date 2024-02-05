public class Matrix {

    public static void displayMatrix(int[][]myMatrix)
    {


        for(int i=0;i<myMatrix.length;i++)
        {
            for(int j=0;j<myMatrix[i].length;j++)
            {
                int sayi=myMatrix[i][j];

                if(isPerfect1(sayi)) {
                    System.out.print("P ");
                }
                else {
                    System.out.print(sayi+" ");
                }

            }
            System.out.println();
        }
    }

    public static int[][] createMatrix()
    {
        int [][] myMatrix= {{1,4,5},{5,7,6}};
        return myMatrix;
    }


    public static boolean isPerfect1(int x) {
        int toplam=0;


        for(int i=1;i<x;i++) {
            if(x%i==0  ) {      //1 2 3
                toplam=toplam+i;

            }
        }

        return toplam==x; }
    public static void main(String[] args) {

        //		int[][] myMatrix= {{1,4,6},{5,7,9},{1}};
//		displayMatrix(myMatrix);
        int [][] newMatrix= {{6,5,34},{4,1,28},{7,28,3}};


        displayMatrix(newMatrix);
		isPerfect1(6);
//		isPerfect(newMatrix);

    }
}
