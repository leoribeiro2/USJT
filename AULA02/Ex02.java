import javax.swing.JOptionPane;

public class Ex02 {
   public static void main (String [] args){
      int altura, base, result;
      base = Integer.parseInt(JOptionPane.showInputDialog("Digite a medida da base do triângulo:"));
      altura = Integer.parseInt(JOptionPane.showInputDialog("Digite a medida da altura do triângulo:"));
      result = (base*altura)/2;
      
      JOptionPane.showMessageDialog(null, "A área do tringualo é " + result);
   }
}