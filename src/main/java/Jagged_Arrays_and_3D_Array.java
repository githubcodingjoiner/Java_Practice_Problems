public class Jagged_Arrays_and_3D_Array {
    public static void main(String [] args){
        // Jagged Arrays
        int [][] nums = new int[3][]; // jagged arrays
        // You need to specify no. of cols in every row since it is different
        nums[0] = new int[4];
        nums[1] = new int[3];
        nums[2] = new int[2];

        for (int i=0;i<nums.length;i++){
            for (int j=0;j<nums[i].length;j++){
                nums[i][j]=(int)(Math.random() *10);
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("3-D Array below:");
        //3-D Arrays
        int [][][]num1=new int[3][4][5];
        for (int i=0;i<num1.length;i++) {
            for (int j = 0; j < num1[i].length; j++) {
                for (int k = 0; k < num1[i][j].length; k++) {
                    num1[i][j][k] = (int) (Math.random() * 10);
                    System.out.print(num1[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
