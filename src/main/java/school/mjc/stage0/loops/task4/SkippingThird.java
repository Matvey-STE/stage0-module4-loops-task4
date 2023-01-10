package school.mjc.stage0.loops.task4;

public class SkippingThird {
    public void printUntilButThird(int lastPrinted) {
        int counter = 1;
        while (counter <= lastPrinted){
            if (counter%3 == 0){
                counter++;
                continue;
            }
            System.out.println(counter);
            counter++;
        }
    }
}
