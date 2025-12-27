package exception;


class MyEx extends Exception {


}

public class ExTestDrive {
    public static void main(String[] args) {
        String test = args[0];

        try {
            System.out.print("t");
            doRisk(test);
            System.out.print("r");
            System.out.print("o");

        } catch (MyEx e) {
            System.out.print("a");

        }finally {
            System.out.print("w");
            System.out.print("s");
        }

    }

    static void doRisk(String t) throws MyEx {
        System.out.print("h");
        if ("yes".equals(t)) {
            throw new MyEx();
        }

    }


}
