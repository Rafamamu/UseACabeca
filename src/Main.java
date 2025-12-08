//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int bottlesNum = 10;
        String word = "bottles";


        while ( bottlesNum > 0) {

            if (bottlesNum == 1) {

                System.out.println( bottlesNum+" green bottle  hanging  on the wall,\n" +
                        bottlesNum+" green  bottle hanging on the wall,\n" +
                        "And if that green bottle should accidentally fall\n" +
                        "There'll be no more green bottles hanging on the wall.");


                break;
            }


            System.out.println(bottlesNum+" green " +word+ " hanging on the wall,\n" +
                    bottlesNum+" green " +word+" hanging on the wall,\n" +
                    "And if one green bottle should accidentally fall");

            bottlesNum = bottlesNum - 1;

            System.out.println("There'll be "+bottlesNum+" green " +word+" hanging on the wall.");
            System.out.println("");








        }
    }
}
