package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        int counter = 1;
        int skippedSum = 0;
        int countedSum = 0;
        if (lastInRow < numberToSkip){
            System.out.println("number to skip is bugger then the last");

        } else if (lastInRow < 0){
            System.out.println("last number in row is negative");
        } else {
            while (counter <= lastInRow) {
                if (counter <= numberToSkip) {
                    skippedSum += counter;
                    counter++;
                } else {
                    countedSum += counter;
                    counter++;
                }
            }
            System.out.println("skipped sum is " + skippedSum);
            System.out.println("counted sum is " + countedSum);
        }
    }
}
