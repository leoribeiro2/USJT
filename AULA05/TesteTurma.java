import javax.swing.*;

class TesteTurma{
   public static void main(String []args){
      String nome = JOptionPane.showInputDialog("Digite o nome da da turma");
      String curso = JOptionPane.showInputDialog("Digite o curso da turma");
      int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de alunos da turma"));
      int serie = Integer.parseInt(JOptionPane.showInputDialog("Digite a serie da turma"));
      
      Turma turma = new Turma(nome, curso, quantidade, serie);
      
      String msg = "Turma: " + turma.getNome() + "\nCurso: " + turma.getCurso() + "\nQuantidade de Alunos: " + turma.getQuantidadeDeAlunos() + "\nSerie: " + turma.getSerie();
      JOptionPane.showMessageDialog(null, msg);
      
      quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a NOVA quantidade de alunos da turma"));
      turma.setQuantidadeDeAlunos(quantidade);
      String msg2 = "Turma: " + turma.getNome() + "\nCurso: " + turma.getCurso() + "\nQuantidade de Alunos: " + turma.getQuantidadeDeAlunos() + "\nSerie: " + turma.getSerie();
      JOptionPane.showMessageDialog(null, msg2);
   }
}