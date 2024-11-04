package JavaProject;

public class BasakkProject {
    public static void main(String[] args) {

            int[] temperatures = {52, 45, 82, 67, 90, 31, 71};
            int highestTemp = temperatures[0];
            int lowestTemp = temperatures[0];
            for (int temp : temperatures) {
                if (temp > highestTemp) {
                    highestTemp = temp;
                } else if (temp < lowestTemp) {
                    lowestTemp = temp;
                }
            }
            System.out.println("The highest temperature of the week is "+highestTemp);
            System.out.println("The lowest temperature of the week is "+ lowestTemp);
    }
}
