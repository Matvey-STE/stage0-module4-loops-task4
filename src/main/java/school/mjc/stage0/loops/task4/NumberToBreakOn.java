package school.mjc.stage0.loops.task4;

public class NumberToBreakOn {
    public void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {
        for (int i = 1; i <= numberToGoUntil; i++){
            if (toBreakWith > numberToGoUntil){
                System.out.println("iterating till the end");
                while (i <= numberToGoUntil){
                    System.out.println(i);
                    i++;
                }
            } else {
                System.out.println(i);
                if (i == toBreakWith){
                    break;
                }
            }
        }
    }
}

