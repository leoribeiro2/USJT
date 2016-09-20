public class Pagamento {
   //atributos
   private String nomeDoPagador;
   private String cpf;
   private double valorASerPago;
   
   //construtor
   public Pagamento(String nomeDoPagador, String cpf, double valorASerPago){
      this.nomeDoPagador = nomeDoPagador;
      this.cpf = cpf;
      this.valorASerPago = valorASerPago;
   }
   
   //metodos modificadores
   public void setNomeDoPagador (String nomeDoPagador){
      this.nomeDoPagador = nomeDoPagador;
   }
   public void setCpf(String cpf){
      this.cpf = cpf;
   }
   public void setValorASerPago(double valorASerPago){
      this.valorASerPago = valorASerPago;
   }
   
   //metodos de acesso
   public String getNomeDoPagador(){
      return this.nomeDoPagador;
   }
   public String getCPF(){
      return this.cpf;
   }
   public double getValorASerPago(){
      return this.valorASerPago;
   }
}