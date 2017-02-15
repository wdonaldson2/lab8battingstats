import java.text.NumberFormat;
import java.util.Scanner;

/**
 * Created by williamdonaldson on 2/10/17.
 */
public class Lab8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        int numBatters = 0;
        int atBat = 0;

        //get input for # of batters and atbats
        //create the 2D array


        System.out.println("How many batters are in the game? ");
        numBatters = scan.nextInt();

        System.out.println("How many at-Bats per game: ");
        atBat = scan.nextInt();


        do {
            //loop through the batters (rows)
            // for (int row = 0; row < numBatters; row++) {
            int[][] batStats = new int[numBatters][atBat];
            for (int row = 0; row < batStats.length; row++) {
                //numBatters = scan.nextInt();
                //loop through the atbats (columns) for this batter
                //for (int col = 0; col < atBats; col++) {
               int sum = 0;
                for (int col = 0; col < batStats[row].length; col++) {
                    //int total = 0;

                    //System.out.println(batStats[row][col] + "");
                    System.out.println("Enter Player's number of at Bat's: " + (col +1));
                    //total = scan.nextInt();
                    batStats[row][col] = scan.nextInt();
                    //sum = batStats[row][col];
                }
                //System.out.println(batStats);
                System.out.println(sum / batStats[row].length);

                //take input for this at-bat
                //put it into batStats[row] [col]

            }
            {
                //double[] atBatsArray = new double[0];
                //Silence the sum after you figure out the calculation

                //Format percentages such that three decimal places are shown
                NumberFormat numberFormat = NumberFormat.getNumberInstance();
                numberFormat.setMinimumFractionDigits(3);

                System.out.println();
                //stub out: implement method and insert code
                //Display batting average - create a method - to create a variable you need datatype - calculate avg
                double batAvg = calculateBatAverage(batStats);          //Calling the method
                System.out.println("Batting average is: " + numberFormat.format(batAvg));

                //Display slugging percentage
                double slugPercent = calculateSlugPercent(batStats);
                System.out.println("Slugging Percentage is: " + numberFormat.format(slugPercent));
                System.out.println();

                System.out.println("Another batter? (y/n): ");
            }
        }  while (input.next().equalsIgnoreCase("Y")) ;
            input.close();

    }
    /*
       This method calculates the slug percent
     */
    public static double calculateSlugPercent(int[][] atBatsArray) {
        //int i = 0;                   //what's in comments is another way to calculate SlugPercentage
        int sum = 0;
        int row = 0;
        for (int n = 0; row < atBatsArray.length; row++) {
        }
          for (int i = 0; i < atBatsArray.length; i++) {
             //sum = atBatsArray[row][i];
        }
        double slugPercent = (double) sum / atBatsArray.length; return slugPercent;
        //double answer = sum / atBatsArray.length;
        //return answer;
    }
    /*
    This method calculates batting avg
     */
    public static double calculateBatAverage(int[][] atBatsArray) {
        //int count = 0;             //what's in comments is another way to calculate batAvg
        double sum = 0;
        for (int i = 0; i < atBatsArray.length; i++) {
           // sum = sum += atBatsArray[i];
            //if (atBatsArray[i] > 0) {
            //count++; }
        }
        double answer = sum / atBatsArray.length;
        return answer * (.5);
    }
}
