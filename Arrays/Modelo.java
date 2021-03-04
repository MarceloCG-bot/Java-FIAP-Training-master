public class Modelo {
    public static void main(String[] args) {
        Carro[] carros = new Carro[5];
        
        Carro carro = new Carro();
        carro.setModelo("Gol");
        
        carros[0] = carro;
        
        String modelo = carros[0].getModelo();
        System.out.println(modelo); 

    }
}
