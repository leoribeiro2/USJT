import javax.swing.JOptionPane;

public class Ex04 {
   public static void main(String args[]){
      String palavra1, palavra2, palavra3;
      palavra1 = JOptionPane.showInputDialog("Digite a 1� palavra");
      palavra2 = JOptionPane.showInputDialog("Digite a 2� palavra");
      palavra3 = JOptionPane.showInputDialog("Digite a 3� palavra");
      int palavra1tam = palavra1.length();
      int palavra2tam = palavra2.length();
      int palavra3tam = palavra3.length();
      JOptionPane.showMessageDialog(null, "A soma dos tamanhos da palavras �: " + (palavra1tam+palavra2tam+palavra3tam)); 
   }
}