package JavaProject;
/*
Create a 2D array or integer type where you will store odd and even numbers.
Develop a program that will identify/print the even numbers only.
 */

public class SaadiaProject {
    public static void main(String[] args) {
        int [][] numbers = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println("Even numbers in the 2D array:");

        for (int i=0; i<numbers.length; i++) {
            for (int j=0; j<numbers[i].length; j++) {
                if (numbers [i][j] % 2==0) {
                    System.out.println(numbers[i][j] + " ");
                }
            }
        }

    }
}