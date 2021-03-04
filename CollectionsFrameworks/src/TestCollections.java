import java.util.*;

/**
 * METÓDOS HERDADOS DA INTERFACE LIST
 * add = Adiciona um objeto numa determinada posição
 * get = Retorna o objeto localizado numa determinada posição
 * set = Coloca um objeto numa determinada posição (substitui objetos)
 * remove = Remove um objeto localizado numa determinada posição
 * indexOf = Retorna a posição de um objeto na lista
 * subList = Retorna parte de uma lista
 */

/**
 * METÓDOS HERDADOS DA INTERFACE COLLECTION
 * add = Adiciona um objeto no SET
 * clear = Remove todos objetos do SET
 * contains = Verifica se o objeto possui um objeto determinado
 * isEmpty = Verifica se o SET está vazio
 * remove = Remove um objeto do SET
 * size = Retorna a quantidade de objetos no SET
 * toArray = Retorna uma Array contendo os objetos do SET
 */

/**
 * METÓDOS HERDADOS DA INTERFACE MAP
 * clear = Remove todos os Mapeamentos
 * containsKey = Verifica se uma chave já está presente no Mapeamento
 * containsValue = Verifica de um valor já está presente no Mapeamento
 * get = Retorna o valor associado a uma chave determinada
 * isEmpty = Verifica se o Mapeamento está vazio
 * KeySet = Retorna um SET contendo as chaves
 * put = Adiciona um Mapeamento
 * remove = Remove um Mapeamento
 * size = Retorna o número de Mapeamento
 * values = Retorna o número de Mapeamentos
 */

public class TestCollections {
    public static void main(String[] args) {

//        ArrayList carrinho = new ArrayList();
//        Double valor = 100.55;
//        int valor2 = 1;
//        int valor3;
//
//        carrinho.add(valor);
//        carrinho.add("Uva");
//        carrinho.add(valor2);
//
//        System.out.println(carrinho.get(1));
//
//        valor3 = (int) carrinho.get(2);
//
//        System.out.println(valor3);

//        Interface List e uso de Generics
//        Generics não permite tipos primitivos
//        List<String> carrinho = new ArrayList<String>();
//
//        System.out.println(carrinho.isEmpty());
//
//        carrinho.add("Maça");
//        carrinho.add("Morango");
//        carrinho.add("Maça");
//        carrinho.set(1, "Pera");
//
//        System.out.println(carrinho.isEmpty());
//        System.out.println(carrinho.size());

//        List<String> carrinho = new ArrayList<String>();
//        carrinho.add("Maça");
//        carrinho.add("Morango");
//        carrinho.add("Maça");
//
//        System.out.println(carrinho.contains("Maça"));
//        System.out.println(carrinho.indexOf("Maça"));
//        System.out.println(carrinho.get(carrinho.indexOf("Maça")));
//        System.out.println(carrinho.lastIndexOf("Maça"));

//        carrinho.remove(carrinho.indexOf("Maça"));
//        System.out.println(carrinho.get(0));
//
//        carrinho.clear();
//        System.out.println(carrinho.isEmpty());

//        Set<String> cesta = new HashSet<String>();
//
//        System.out.println(cesta.isEmpty());
//        cesta.add("Maça");
//        cesta.add("Maça");
//        cesta.add("maça");
//        System.out.println(cesta.isEmpty());
//
//        System.out.println(cesta.size());
//        System.out.println(cesta);

//        Map<String, String> caixa = new HashMap<String, String>();
//        caixa.put("M2225", "Fernando");
//        caixa.put("M2226", "Maria");
//        caixa.put("M2227", "Soraya");
//
//        System.out.println(caixa.isEmpty());
//        System.out.println(caixa.size());
//        System.out.println(caixa.containsKey("M2225"));
//        System.out.println(caixa.containsValue("Fernando"));
//        System.out.println(caixa.get("M2226"));
//        System.out.println(caixa);

//        ArrayList lista = new ArrayList();
//        lista.add("LTP");
//        lista.add("Web");
//        lista.add("Algoritmo");
//
//        for (int i = 0; i < lista.size(); i++) {
//            System.out.println(lista.get(1));
//        }

//        ArrayList lista = new ArrayList();
//        lista.add("LTP");
//        lista.add("Web");
//        lista.add("Algoritmo");
//
//        int indice = lista.indexOf("Web");
//
//        System.out.println("O valor Web está na posição: " + indice);
//
//        HashSet cursos = new HashSet<>();
//
//        cursos.add("Java");
//        cursos.add(".NET");
//        cursos.add("Android");
//
//        cursos.add("JAVA"); //Repetido!
//
//    //Imprime todos os elementos
//        System.out.println(cursos);


//        HashMap mapa = new HashMap();
//
//        map.put("RM1234", "Thiago");
//        map.put("RM4321", "João");
//
//        System.out.println(mapa);

//        HashMap mapa = new HashMap();
//
//        map.put("RM1234", "Thiago");
//        map.put("RM4321", "João");
//
//        map.remove("RM1234"); //remove um elemento.
//
//        System.out.println(mapa.get("RM1234"));

//        ArrayList lista = new ArrayList();
//
//        Aluno aluno = new Aluno();
//
//        lista.add("FIAP"); //String
//        lista.add(2); //Integer
//        lista.add(aluno); //Aluno

        ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Thiago");
        Cliente cliente2 = new Cliente();
        cliente2.setNome("João");

        listaCliente.add(cliente1);
        listaCliente.add(cliente2);

        for (int i = 0; i < listaCliente.size(); i++) {
            Cliente cli = listaCliente.get(i); //Não é necessário o cast
            System.out.println(cli.getNome());
        }

    }
}
