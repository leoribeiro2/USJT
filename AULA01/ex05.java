import javax.swing.JOptionPane;

public class ex05 {
   public static void main(String[] args){
      String peso = JOptionPane.showInputDialog("Qual o seu Peso?");
      int pesoint = Integer.parseInt(peso);
      JOptionPane.showMessageDialog(null,"O peso informado foi: "+pesoint+"KG");
   }
}