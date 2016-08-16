import java.util.*;
import java.text.*;
import javax.swing.*;
class Ex01 {
    public static void main(String[] args) throws ParseException {
        DateFormat df = new SimpleDateFormat ("dd/MM/yyyy");
        df.setLenient(false);
        Date d1 = df.parse (JOptionPane.showInputDialog("Qual sua data de nascimento?"));
        Date d2 = df.parse (JOptionPane.showInputDialog("Qual a data de hoje?"));
        long dt = (d2.getTime() - d1.getTime()) + 3600000;
        JOptionPane.showMessageDialog(null, "Você já viveu " + (dt / 86400000) + " dias!!!!");
    }
}