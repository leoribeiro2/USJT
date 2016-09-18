import javax.swing.*;

public class TesteAtribuicao{
   public static void main(String [] args){
      String nomeProf = JOptionPane.showInputDialog("Qual o nome do professor?");
      int idadeProf = Integer.parseInt(JOptionPane.showInputDialog("Qual a idade do professor?"));
      String nomeDisciplina = JOptionPane.showInputDialog("Qual o nome da disciplina?");
      boolean pratica = Boolean.parseBoolean(JOptionPane.showInputDialog("Tem pratica? true/false"));
      
      Professor p1 = new Professor(nomeProf, idadeProf);
      Disciplina d1 = new Disciplina(nomeDisciplina, pratica);
      Atribuicao a1 = new Atribuicao(d1, p1);
      
      JOptionPane.showMessageDialog(null, a1.getDados());
   }
}