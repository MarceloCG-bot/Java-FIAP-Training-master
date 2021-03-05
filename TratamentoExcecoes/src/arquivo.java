import java.io.*;

public class arquivo {
//    public static void main(String[] args) {
//        try {
//            //Abre o arquivo
//            FileWriter stream = new FileWriter("arquivo.txt");
//            PrintWriter print = new PrintWriter(stream);
//
//            //Escreve no arquivo
//            print.println("Teste");
//            print.println("Escrevendo no arquivo");
//
//            print.close();
//            //Fecha o arquivo
//            stream.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }

//

//

    public static void main(String[] args) {
        File diretorio = new File("fiap");

        if (diretorio.exists()){
            System.out.println("Diretório existe!");
        }else{
            if (diretorio.mkdir())
                System.out.println("Diretório criado!");
            else
                System.out.println("Diretório não criado.");
        }

        File arquivo = new File(diretorio,"file.txt");
        try {
            if (arquivo.createNewFile())
                System.out.println("Arquivo criado!");
            else
                System.out.println("Arquivo não criado!");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
