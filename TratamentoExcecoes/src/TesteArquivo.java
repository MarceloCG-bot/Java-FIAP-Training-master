import javax.imageio.IIOException;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintWriter;

public class TesteArquivo {

    public static void main(String[] args) throws IOException {

        String nomeDoArquivo = "estoque.csv";
        String diretorio = System.getProperty("user.home");
        String caminho = diretorio + "\\" + nomeDoArquivo;

        List<String> conteudo = new ArrayList<>();
        conteudo.add("Produto; Quantidade; Unidade de Medida; Valor da Unidade;");
        conteudo.add("Pera; 200; pct; R$ 5,40;");
        conteudo.add("Morango; 400; cx; R$ 6,50;");
        conteudo.add("Abacaxi; 280; un; R$ 5,00");

//        gravarEstoque(nomeDoArquivo, caminho, conteudo);

        lerEstoque(caminho);
    }

////    private static void gravarEstoque(String nomeDoArquivo, String caminho, List<String> conteudo) throws IOException {
////
////        FileWriter stream;
////        PrintWriter print;
////
////        try {
////            //stream é uma conexão de escrita para o arquivo
////            stream = new FileWriter(caminho);
////            //a classe PrintWriter escreverá no arquivo
////            print = new PrintWriter(stream);
////
////            for (String linha : conteudo) {
////                //o método println escreve uma linha no arquivo
////                print.println(linha);
////            }
////            //close fecha o arquivo
////            print.close();
////            stream.close();
////
////            System.out.println("O arquivo " + nomeDoArquivo + " foi salvo em " + caminho);
////
////        } catch (IIOException e) {
////            e.printStackTrace();
////        }
//    }

    private static void lerEstoque (String caminho) {
        try {
            //Abre o arquivo
            FileReader stream = new FileReader(caminho);

            //BufferedReader possui o método readLine()
            //lê uma linha do arquivo e retorna uma String com o valor lido ou null
            BufferedReader reader = new BufferedReader(stream);

            //Lê uma linha do arquivo
            String linha = reader.readLine();

            //Enquanto linha for diferente de null
            while (linha != null) {

                System.out.println(linha);
                //Lê a próxima linha do arquivo
                linha = reader.readLine();
            }
            reader.close();
            //Fecha o arquivo
            stream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    File arquivo = new File(caminho);
//
//    if (arquivo.exists()) {
//        System.out.println("O arquivo existe!"+
//                "\nPode ser lido: " + arquivo.canRead() +
//                "\nPode ser gravado: " + arquivo.canWrite() +
//                "\nTamanho: " + arquivo.length() +
//                "\nCaminho: " + arquivo.getPath());
//    } else {
//        //Cria o arquivo
//        try {
//            if (arquivo.createNewFile())
//                System.out.println("Arquivo criado!");
//            else
//                System.out.println("Arquivo não criado!");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    File fDiretorio = new File(diretorio);
//
//    if (fDiretorio.exists()) {
//        System.out.println("Diretório existe!");
//    }else{
//        if (fDiretorio.mkdir())
//            System.out.println("Diretório criado!");
//        else
//            System.out.println("Diretório não criado.");
//    }
}
