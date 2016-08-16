import javax.swing.JOptionPane;

public class Ex04 {
   public static void main(String args[]){
      String palavra1, palavra2, palavra3;
      palavra1 = JOptionPane.showInputDialog("Digite a 1ª palavra");
      palavra2 = JOptionPane.showInputDialog("Digite a 2ª palavra");
      palavra3 = JOptionPane.showInputDialog("Digite a 3ª palavra");
      int palavra1tam = palavra1.length();
      int palavra2tam = palavra2.length();
      int palavra3tam = palavra3.length();
      JOptionPane.showMessageDialog(null, "A soma dos tamanhos da palavras é: " + (palavra1tam+palavra2tam+palavra3tam)); 
   }
}