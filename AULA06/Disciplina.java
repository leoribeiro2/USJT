public class Disciplina {
   //atributos
   private String nome;
   private boolean pratica;
   
   //contrutor
   public Disciplina(String nome, boolean pratica){
      this.nome =  nome;
      this.pratica = pratica;
   }
   
   //metodos
   public void setNome(String nome){
      this.nome = nome;
   }
   public void setPratica(boolean pratica){
      this.pratica = pratica;
   }
   public String getNome(){
      return nome;
   }
   public boolean getPratica(){
      return pratica;
   }
   
   //getdados
   public String getDados(){
      return " Disciplina " + nome + " Pratica: " + pratica;
   }
}