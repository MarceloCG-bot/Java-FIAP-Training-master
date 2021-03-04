import java.util.Scanner;

public class Notas {
    
    public static void main(String[] args) {
        // int[] notas = new int[40];
        // int notas[] = {10,9,8,2};
        // notas[0] = 10;

        // int notas[] = new int[4];
        // notas[0] = 10;
        // notas[1] = 9;
        // notas[2] = 8;
        // notas[3] = 2;

        // System.out.println(notas[0]);

        // byte bytes[] = new bytes[4];
        // short shorts[] = new short[8];
        // double doubles[] = new double[7];
        // float floats[] = new float[3];
        // String strings[] = new String[10];
        // Carro carros[] = new Carro[15];

        // Scanner sc = new Scanner(System.in);
        // float[] notas = new float[10];
        // for (int i=0; i<10; i++) {
        // System.out.println("Digite a nota do aluno: ");
        // notas[i] = sc.nextFloat();
        // }
        // sc.close();

        // // Calcular a média dos alunos
        // float totalNotas = 0;
        // for(int i=0;i<notas.length;i++) {
        // totalNotas = totalNotas + notas[i];
        // }
        // float médiaNotas = totalNotas/notas.length;
        // System.out.println("A média dos alunos é " + médiaNotas);

        float[][] notas = new float[5][10];
		notas[0][0] = 10;
        notas[0][1] = 9;
		
		for (float[] nota : notas) {
            for(int i=0; i<notas[i].length; i++) {
            	System.out.println(nota[i]);
            }
            System.out.println();
      
          }
    }
}
