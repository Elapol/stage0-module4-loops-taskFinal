package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {

        public static void main (String[]args) {
            new HalfPyramid().printHalfPyramid(8);
        }
            public static void printHalfPyramid(int cathetusLength) {
int x,y;
int sp=cathetusLength-1;
int st=1;

            for ( x = 1; x <= cathetusLength; x++) {
                    for ( y = 1; y <=sp; y++) {
                            System.out.print(" ");
                    }
                    for ( y=1;y<=st;y++) {
                        System.out.print("*");
                    }
                    sp--;
                    st++;
                    System.out.println();
            }
        }
    }
