import javax.swing.*;

public class Ex01 {
   public static void main(String args[]){
     int valor1, valor2, soma;
     valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero"));
     valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero"));
     soma = valor1 + valor2;
     if(soma > 10) {
      JOptionPane.showMessageDialog(null, "A Soma é: " + soma);
     }
   }
}