import javax.swing.*;

public class Ex02{
   public static void main(String args[]){
      int valor1, valor2, result;
      valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero"));
      valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n�mero"));
      result = valor1 + valor2;
      if (result <= 20){
         JOptionPane.showMessageDialog(null, "O resultado �: " + (result-5));
      }
   }
}