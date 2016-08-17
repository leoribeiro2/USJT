import javax.swing.*;

public class Ex05 {
   public static void main (String args[]){
      int valor, juros, prazo, result;
      valor = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor da divida?"));
      juros = Integer.parseInt(JOptionPane.showInputDialog("Qual a taxa de juros % ao mês?"));
      prazo = Integer.parseInt(JOptionPane.showInputDialog("Qual o prazo da divida?"));
      result = valor*(1+juros/100)^prazo;
      JOptionPane.showMessageDialog(null, "Você no final do prazo estará devendo " + result + " reais!");
   }
}