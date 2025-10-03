import javax.swing.JOptionPane;

public class Swing{
    public static void main(String[] args) {
    String nama = JOptionPane.showInputDialog("Nama:");
    String umur = JOptionPane.showInputDialog("Umur:");
    JOptionPane.showMessageDialog(null,"Nama:" + nama + "\nUmur:" + umur);
    }
}