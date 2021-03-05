public class catraca {
    private static int totalAcesso;

    private String nome;

    public void entrar(String nome){
        this.nome = nome;
        totalAcesso = totalAcesso + 1;
    }

    public static int recuperarTotal(){
        return totalAcesso;
    }

//    public static void main(String[] args) {
//        int total = catraca.recuperarTotal();
//        System.out.println("Total " + total);
//
//        long numero = Math.round(2.9);
//        System.out.println("Número arredondado: " + numero);
//    }

    public static void main(String[] args) {
        catraca a1 = new catraca();
        a1.entrar("Thiago");

        catraca a2 = new catraca();
        a2.entrar("Leandro");

        int total = catraca.recuperarTotal();
        System.out.println("Total " + total);

    }
}
