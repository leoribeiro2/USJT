import javax.swing.*;

public class Ex03 {
   public static void main (String Args[]){
      double numero;
      numero = Double.parseDouble(JOptionPane.showInputDialog("Digite o número"));
      if (numero > 0){
         JOptionPane.showMessageDialog(null, "Resultado: " + (Math.sqrt(numero)));
      }else {
         JOptionPane.showMessageDialog(null, "Resultado: " + (Math.pow(numero,2)));
      }
   }
}