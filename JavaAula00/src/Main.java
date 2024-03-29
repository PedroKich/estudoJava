import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean sextou = false;

        byte numero = 2;

        char letra = 'B';

        float numeroReal = 18.4447F;

        System.out.println("sextou? " + sextou);
        System.out.println("eu venho depois do número 1, quem sou eu? " + numero);
        System.out.println("A! " + letra);
        System.out.println("estranho... " + numeroReal);

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        String nomeAluno = teclado.nextLine();

        System.out.println("O nome do aluno é " + "'" + nomeAluno + "'?");

    }
}