public class Horista extends Empregado {
   int horasTrabalhadas;
   double valorHora;
   
   public Horista(String nome, int horasTrabalhadas, double valorHora){
      super(nome);
      this.horasTrabalhadas = horasTrabalhadas;
      this.valorHora = valorHora;
   }
   
   public double salario(){
      return horasTrabalhadas * valorHora;
   }
}