package exception;

class MinhaEx  extends  Exception {


}
public class TestMyEx2 {
    public static void main(String[] args) {

        String teste = args[0];

        try {
            System.out.println("Vamos testar sua Excessão:");
            exception(teste);

        } catch (RuntimeException e) {
            System.out.println("Rafael é lindo demais, por isso não podemos deixar entrar!");

        }finally {
            System.out.println("Essa parte roda de qualquer forma! ");
        }

    }

    static void exception(String e) throws  RuntimeException {
        if (e.equals("Rafael")) {
            throw new RuntimeException();
        }


    }




}
