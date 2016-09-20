public class TesteEmpregado{
   public static void main(String[] args){
      Empregado emp1 = new Empregado("Joao da Silva");
      System.out.println(emp1.toString());
      
      Mensalista emp2 = new Mensalista("Jose Pereira", 3500.00);
      System.out.println(emp2.toString());
      
      Comissionado emp3 = new Comissionado("Maria Pereira", 1500.00, 5000.00);
      System.out.println(emp3.toString());
      
      Horista emp4 = new Horista ("Leonardo", 100, 50);
      System.out.println(emp4.toString());
   }

}