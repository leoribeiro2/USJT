import javax.swing.JOptionPane;

public class ex02 {
   public static void main(String[] args){
      String numero = JOptionPane.showInputDialog("Entre com o numero:");
      int numeroInt = Integer.parseInt(numero);
      JOptionPane.showMessageDialog(null,"O valor do numero digitado e: "+numeroInt);
   }
}