import javax.swing.JOptionPane;

public class ex02 {
   public static void main(String[] args){
      int numero = JOptionPane.showInputDialog("Entre com o numero:");
      JOptionPane.showMessageDialog(null,"O valor do numero digitado e: "+numero);
   }
}