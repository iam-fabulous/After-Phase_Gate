import java.util.Arrays;
public class Main {

//    public String fab() {
//        int myArray[][] = new int[3][3];
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print(myArray[i][j] + " ");
//            }
//            System.out.println();
//        }
//        return Arrays.toString(myArray);
//    }

    public static String[][] display(int [][] array) {
        if(array.length != 3 && array[0].length != 3 && array[1].length != 3 && array[2].length != 3) {
            System.out.println("Invalid array Length, Must be 3 by 3");
        }
        String[][] myNewArray = new String[array.length][array[0].length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] == 1) {
                    myNewArray[i][j] = "*";
                }
                else {
                    myNewArray[i][j] = " ";
                }
            }
            System.out.println();
        }
        return myNewArray;
    }

    public static void main(String[] args) {
        int[][] fabArray = {{1,1,1},{0,1,0},{1,1,1}};
        String[][] myArray  = display(fabArray);
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[0].length; j++) {
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}