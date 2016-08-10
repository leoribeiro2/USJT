import javax.swing.JOptionPane;

public class Ex01 {
	public static void main(String[] args){
		String a = JOptionPane.showInputDialog("Entre com a primeira palavra");
      String b = JOptionPane.showInputDialog("Entre com a segunda palavra");
      String c = JOptionPane.showInputDialog("Entre com a terceira palavra");
      JOptionPane.showMessageDialog(null,"Resultado :\n"+c+"\n"+b+"\n"+a);
	}
}