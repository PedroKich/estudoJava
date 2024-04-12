/*

// Exemplo 1

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        JOptionPane.showMessageDialog(null, "oi");

        int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade?"));
        //System.out.println(valor);

        JOptionPane.showConfirmDialog(null, "Confirma a idade como "+ idade + "?");

        System.out.println(JOptionPane.showConfirmDialog(null, "Olha o console..."));

    }
}
*/



import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Seja bem-vindo ao meu programa >:D \n\nCheque o console :P");
        System.out.println("O programa vai ser bemmmm simples XD \nVocê vai digitar um número e ele vai determinar se o mesmo é positivo/negativo ou igual a zero ^^ \n\n Tudo pronto? Aí vem o Prompt!!!");

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite seu número favorito que você guarda no fundo do seu coração >:3"));
        //System.out.println(valor);

        String numeroConvertidoParaTexto = Integer.toString(numero);

        JOptionPane.showConfirmDialog(null,
                "Tem certeza de que digitou o número correto?\n\n    Você digitou: %i", numeroConvertidoParaTexto, JOptionPane.YES_NO_OPTION);

        if(numero > 0){
            JOptionPane.showMessageDialog(null, "O número é positivo");
        } else if (numero < 0){
            JOptionPane.showMessageDialog(null, "O número é negativo");
        } else{
            JOptionPane.showMessageDialog(null, "Hmmmmm... Parece que você quis ser diferente e escolher o número 0 XD");
           
        }



        JOptionPane.showMessageDialog(null, "Obrigado por participar do programa :)"); // mensagem de conclusão do programa

    }
}









/*

// Exemplo 3


public class Main {
    public static void main(String[] args) {
        ///////// int to str
        int idade = 18;
        String texto = Integer.toString(idade);
        System.out.println("Texto convertido: " + texto);

//        System.out.println("Texto convertido: " + Integer.toString(idade));

        /////////// str to int
        String textoParaConverter = "30";
        int valorConvertido = Integer.parseInt(textoParaConverter);
        System.out.println("Valor convertido: "+valorConvertido);

        /////////// str to float
        textoParaConverter = "3.04";
        float floatConvertido = Float.parseFloat(textoParaConverter);
        floatConvertido += 1.5;
        System.out.println("Float convertido: "+floatConvertido);
    }
}


 */