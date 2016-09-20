public class CartaoDeCredito extends Pagamento {
   //atributos
   private String numeroDoCartao;
   
   //construtor
   public CartaoDeCredito(String nomeDoPagador, String cpf, double valorASerPago, String numeroDoCartao){
      super(nomeDoPagador, cpf, valorASerPago);
      this.numeroDoCartao = numeroDoCartao;
   }
   
   //metodo modificador
   public void setNumeroDoCartao(String numeroDoCartao){
      this.numeroDoCartao = numeroDoCartao;
   }
   
   //metodo de acesso
   public String getNumeroDoCartao(){
      return this.numeroDoCartao;
   }
}