import javax.swing.*;

public class Ex02{
   public static void main(String args[]){
      int valor1, valor2, result;
      valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
      valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número"));
      result = valor1 + valor2;
      if (result <= 20){
         JOptionPane.showMessageDialog(null, "O resultado é: " + (result-5));
      }
   }
}