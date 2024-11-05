package JavaProject;

public class JustinProject {
    public static void main(String[] args) {
        // Write a program to find the second-largest number in the array
        int[] numSeries = new int[]{345, 22, 752, 95, 44, 677, 333, 832, 53};

        int prevInt = 0;
        int nowInt = 0;

        for(int x = 0; x <= numSeries.length-1; x++ ){
            if(numSeries[x] > nowInt){
                nowInt = numSeries[x];

            }
        }

        for (int i = 0; i <= numSeries.length-1; i++) {
            if(numSeries[i] > prevInt && numSeries[i] < nowInt){
                prevInt = numSeries[i];
            }
        }



        System.out.println("The second highest number is: " + prevInt);
    }
}
