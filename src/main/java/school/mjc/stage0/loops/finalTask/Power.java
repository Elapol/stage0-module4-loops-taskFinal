package school.mjc.stage0.loops.finalTask;

public class Power {
    public static void main(String[] args) {
        new Power().printPower(5, 3);
    }
    public static void printPower(int numberToPrint, int power) {
        int pow=1;
        for (int i=1;i<=power;i++){
            pow=pow*numberToPrint;}
            System.out.print(pow);

        }

    }



