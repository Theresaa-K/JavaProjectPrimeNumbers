package JavaProject;

public class AmberProject {
    public static void main(String[] args) {

        int[] val = {4, 6, 9, 22, 3, 27, 12, 48, 11, 8, 16, 12, 24};
        int sum = 0;

        for (int i = 0; i < val.length; i++) {
            sum += val[i];

        }
        System.out.println("Your total is: " + sum);
    }
}
