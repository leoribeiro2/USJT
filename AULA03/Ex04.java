import javax.swing.*;

public class Ex04 {
   public static void main (String args[]){
      int n1, n2, n3;
      n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
      n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número"));
      n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número"));
      
      // 1 2 3
      if (n1 < n2 && n1 < n3 && n2 < n3) {
         JOptionPane.showMessageDialog(null, n1 + " " + n2 + " " + n3);
      }  
      // 1 3 2
      if (n1 < n3 && n1 < n2 && n3 < n2) {
         JOptionPane.showMessageDialog(null, n1 + " " + n3 + " " + n2);
      }
      // 2 1 3
      if (n2 < n1 && n2 < n3 && n1 < n3) {
         JOptionPane.showMessageDialog(null, n2 + " " + n1 + " " + n3);
      }
      // 2 3 1
      if (n2 < n3 && n2 < n1 && n3 < n1) {
         JOptionPane.showMessageDialog(null, n1 + " " + n3 + " " + n1);
      }
      // 3 2 1
      if (n3 < n1 && n3 < n2 && n2 < n1) {
         JOptionPane.showMessageDialog(null, n3 + " " + n2 + " " + n1);
      }
      // 3 1 2
      if (n3 < n1 && n3 < n2 && n1 < n2) {
         JOptionPane.showMessageDialog(null, n3 + " " + n1 + " " + n2);
      }
   }
}