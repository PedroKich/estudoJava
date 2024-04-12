import javax.swing.*;

public class Main {
    public static void main(String[] args) {

 /*

 // comparação de strings

        String s1, s2;

        s1 = JOptionPane.showInputDialog("s1: ");
        s2 = JOptionPane.showInputDialog("s2: ");

        if (s1.equals(s2)){
            JOptionPane.showMessageDialog(null, "iguais");
        } else {
            JOptionPane.showMessageDialog(null, "diferentes");
        }

*/

 // arrays e afins


        int[] numeros = new int[10];

        for(int i=0; i<10; i++){
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("digite um número de 0 a 100: "));
        }
        for (int numero : numeros) {
            System.out.println(numero);
        }






        };
    }
