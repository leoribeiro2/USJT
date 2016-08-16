import javax.swing.JOptionPane;

public class Ex03 {
   public static void main(String[] args){
      int numero;
      double elevado;
      numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero para elavar ao expoente 2:"));
      elevado = Math.pow(numero, 2);
      JOptionPane.showMessageDialog(null, elevado);
   }
}