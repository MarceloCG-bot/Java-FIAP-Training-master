import java.util.Arrays;
import java.util.Locale;

public class Caixa {
    
    public static void main(String[] args) {

        Produto[] produtos = new Produto[2];
		
		Produto prod1 = new Produto();
		prod1.setNome("Limão");
		prod1.setDescricao("Galego");
		prod1.setValor(4);
		
		Produto prod2 = new Produto();
		prod2.setNome("Maçã");
		prod2.setDescricao("Gala");
		prod2.setValor(5);
		
		produtos[0] = prod1;
		produtos[1] = prod2;

        // for(int i=0; i < produtos.length; i++) {
        //     System.out.println(produtos[i].toString());
        // }

        for(Produto prod: produtos) {
            System.out.println(prod.toString());
        }

        Produto[][] localizacaoProduto = new Produto[10][3];

        localizacaoProduto[0][1] = prod1;
        localizacaoProduto[1][1] = prod2;
    
        System.out.println(localizacaoProduto[0][1].getNome());

//        STRINGS

//        String nome;
//        nome = "Maçã";
//        System.out.println(nome);
//
//        String nome2 = new String("Maçã");
//        System.out.println(nome2);
//
//        String nome3 = "Maçã";
//        System.out.println(nome3);
//
//        String nome4 = null;
//        assert false;
//        System.out.println(nome4.length());

//        String descricao = "Tipo Gala: \nA maçã mais doce do mercado";
//        System.out.println(descricao);
//
//        descricao = "Tipo Gala:\tA maçã mais doce do mercado";
//        System.out.println(descricao);
//
//        descricao = "Tipo Gala: \"A maçã mais doce do mercado\"";
//        System.out.println(descricao);

//        String nome = "Maçã";
//        String descricao;
//        descricao = "Tipo gala: A maçã mais doce do mercado";
//
//        String propaganda = nome + " " + descricao;
//        System.out.println(propaganda);
//
//        propaganda = nome.concat(" ").concat(descricao);
//        System.out.println(propaganda);
//
//        propaganda += "!";
//        System.out.println(propaganda);

//        String nome = "FIAP";
//        String slogan = "A melhor faculdade de tecnologia";
//        String faculdade = nome + slogan;
//        System.out.println(faculdade);

        int número = 10;
        número += 10;
        System.out.println(número);

//        String nome = "FIAP";
//        String slogan = "A melhor faculdade de tecnologia";
//
//        String faculdade = nome;
//        faculdade += " - ";
//        faculdade += slogan;
//
//        System.out.println(faculdade);

//        String nome = "FIAP";
//        String slogan = "A melhor faculdade de tecnologia";
//
//        String faculdade = nome.concat(" - ").concat(slogan);
//
//        System.out.println(faculdade);

//        String nome = "FIAP";
//        String slogan = "A melhor faculdade de tecnologia";
//
//        String faculdade = nome.concat(" - ") + slogan;
//
//        System.out.println(faculdade);

//        String nome = "FIAP";
//        String nome2 = "FIAP";
//
//        if (nome.equals(nome2)){
//            System.out.println("As Strings são iguais.");
//        }else{
//            System.out.println("As Strings são diferentes.");
//        }

//        String nome = new String("maça");
//        String nome2 = new String("Maça");
//        String nome3 = new String("maça");
//
//        System.out.println(nome.equals(nome2)); // false
//
//        System.out.println(nome.equalsIgnoreCase(nome2)); // true
//
//        System.out.println(nome.equals(nome3)); // true
//
//        boolean teste = (nome == nome3);
//        System.out.println(teste); // false
//
//        String nome4 = "maça";
//        String nome5 = "maça";
//
//        teste = (nome4 == nome5);
//        System.out.println(teste); // true
//
//        String descricao = new String("Maçã gala, a maça mais doce do mercado!");
//
//        System.out.println(descricao.length());
//
//        System.out.println(descricao.startsWith("Maçã"));
//        System.out.println(descricao.endsWith("!"));

//        String descricao = new String("Maça Gala, a maça mais doce do mercado!");
//
//        System.out.println(descricao.charAt(1));
//
//        System.out.println(descricao.indexOf("G"));
//        System.out.println(descricao.indexOf("Gala"));
//
//        System.out.println(descricao.indexOf("a"));
//        System.out.println(descricao.lastIndexOf("a"));

//        String descricao = new String("Maça Gala, a maça mais doce do mercado!");
//
//        System.out.println(descricao.replace("G", "g"));
//        System.out.println(descricao.replace("Gala", "Fuji"));
//        System.out.println(descricao.replace("a", "A"));
//
//        System.out.println(descricao.split(" ").length);
//        System.out.println(Arrays.toString(descricao.split(" ")));

        String descricao = new String("Maça Gala, a maça mais doce do mercado!");

        System.out.println(descricao.toLowerCase());
        System.out.println(descricao.toUpperCase());

        System.out.println(descricao.substring(0,4));
        System.out.println(descricao.substring(4));

        System.out.println(descricao.substring(
                descricao.indexOf("Maça"),
                descricao.indexOf(" ")
        ));

        System.out.println(descricao);







    }
}
