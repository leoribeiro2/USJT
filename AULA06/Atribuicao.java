public class Atribuicao{
   private Disciplina disciplina;
   private Professor professor;
   
   //construtor
   public Atribuicao(Disciplina disciplina, Professor professor){
      this.disciplina = disciplina;
      this.professor = professor;
   }
   
   //metodos
   public void setDisciplina(Disciplina disciplina){
      this.disciplina = disciplina;
   }
   public void setProfessor(Professor professor){
      this.professor = professor;
   }
   public Disciplina getDisciplina(){
      return disciplina;
   }
   public Professor getProfessor(){
      return professor;
   }
   
   //getdados
   public String getDados(){
      return disciplina.getDados()+ " " + professor.getDados();
   }
}
