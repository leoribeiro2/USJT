public class Boleto extends Pagamento {
   //atributos
   private String numeroDoBoleto;
   private int diaVenc;
   private int mesVenc;
   private int anoVenc;
   
   //construtor
   public Boleto (String nomeDoPagador, String cpf, double valorASerPago, String numeroDoBoleto, int diaVenc, int mesVenc, int anoVenc){
      super(nomeDoPagador, cpf, valorASerPago);
      this.numeroDoBoleto = numeroDoBoleto;
      this.diaVenc = diaVenc;
      this.mesVenc = mesVenc;
      this.anoVenc = anoVenc;
   }
   
   //metodos modificadores
   public void setNumeroDoBoleto(String NumeroDoBoleto){
      this.numeroDoBoleto = numeroDoBoleto;
   }
   public void setDiaVenc(int diaVenc){
      this.diaVenc = diaVenc;
   }
   public void setMesVenc(int mesVenc){
      this.mesVenc = mesVenc;
   }
   public void setAnoVenc(int anoVenc){
      this.anoVenc = anoVenc;
   }
   
   //metodos de acesso
   public String getNumeroDoBoleto(){
      return numeroDoBoleto;
   }
   public int getDiaVenc(){
      return diaVenc;
   }
   public int getMesVenc(){
      return mesVenc;
   }
   public int getAnoVenc(){
      return anoVenc;
   }
}
