import javax.swing.JOptionPane;

public class Ex02 {
   public static void main (String [] args){
      int altura, base, result;
      base = Integer.parseInt(JOptionPane.showInputDialog("Digite a medida da base do tri�ngulo:"));
      altura = Integer.parseInt(JOptionPane.showInputDialog("Digite a medida da altura do tri�ngulo:"));
      result = (base*altura)/2;
      
      JOptionPane.showMessageDialog(null, "A �rea do tringualo � " + result);
   }
}