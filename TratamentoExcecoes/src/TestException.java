public class TestException {
    public static void main(String[] args) {

        try {

//            int val = 10 / 0;

            int[] valores = new int[3];
            System.out.println(valores[4]);

            String nome = null;
            System.out.println(nome.length());

            int numero = Integer.parseInt("zero");

        } catch (ArithmeticException e) {

            System.out.println("Não é possível realizar uma divisão por zero!");

            // Mensagem com a lista de erros
            System.out.println(e.getMessage());

            // Imprime a pilha de erro da exceção
            e.printStackTrace();

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Não é possível acessar a posição 4 do array!");

        } catch (NullPointerException e) {

            System.out.println("Não foi possível retornar o length, variável nome não instanciada!");

        } catch (NumberFormatException e) {

            System.out.println("Não foi possível realizar a conversão!");

        } catch (Exception e) {

            System.out.println("Erro na execução do programa!");
        }

    }
}
