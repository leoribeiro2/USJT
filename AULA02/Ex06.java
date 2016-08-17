import javax.swing.*;

public class Ex06 {
   public static void main(String args []){
      String numero = JOptionPane.showInputDialog("Digite o número");
      JOptionPane.showMessageDialog(null, "A casa das dezenas é " + numero.substring(1,2)); 
   }
}