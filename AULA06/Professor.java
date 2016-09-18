public class Professor{
   //atributos
   private String nome;
   private int idade;
   
   //contrutor
   public Professor(String nome, int idade){
      this.nome = nome;
      this.idade = idade;
   };
   
   //metodos
   public void setIdade(int idade){
      this.idade = idade;
   };
   public void setNome(String nome){
      this.nome = nome;
   };
   public String getNome(){
      return nome;
   };
   public int getIdade(){
      return idade;
   };
   
   //getdados
   public String getDados(){
      return " Professor " + nome + " idade: " + idade;
   };
}