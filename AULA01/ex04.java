import javax.swing.JOptionPane;

public class ex04 {
   public static void main(String[] args){
      String dia = JOptionPane.showInputDialog("Entre com o Dia:");
      String mes = JOptionPane.showInputDialog("Entre com o Mês:");
      String ano = JOptionPane.showInputDialog("Entre com o Ano:");
      JOptionPane.showMessageDialog(null,"Data: "+dia+"/"+mes+"/"+ano);
   }
}