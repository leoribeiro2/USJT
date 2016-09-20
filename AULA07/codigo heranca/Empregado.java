public class Empregado{
   private String nome;
   
   public Empregado(String nome){
      this.nome = nome;
   }
   
   public String getNome(){
      return nome;
   }
   
   public void setNome(String nome){
      this.nome = nome;
   }
   
   public double salario(){
      return 0.0;
   }
   
   public String toString(){
      return getNome() + " - " + salario();
   }
}