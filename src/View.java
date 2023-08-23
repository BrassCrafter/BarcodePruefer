import javax.swing.*;

public class View {
    private JTextField EANCodeField;
    private JPanel panel1;
    private JButton pruefenButton;

    public View() {
        JFrame frame = new JFrame("EAN-Code Prüfer");
        frame.setContentPane(panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(300, 100);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new View();
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
