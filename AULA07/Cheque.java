public class Cheque extends Pagamento {
   //atributos
   private String numeroDoCheque;
   
   //construtor
   public Cheque(String nomeDoPagador, String cpf, double valorASerPago, String numeroDoCheque){
      super(nomeDoPagador, cpf, valorASerPago);
      this.numeroDoCheque = numeroDoCheque;
   }
   
   //metodo modificador
   public void setNumeroDoCheque(String numeroDoCheque){
      this.numeroDoCheque = numeroDoCheque;
   }
   
   //metodo de acesso
   public String getNumeroDoCheque(){
      return numeroDoCheque;
   }

}