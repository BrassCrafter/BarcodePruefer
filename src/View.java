import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.util.Objects;

public class View extends JFrame{
    private JPanel mainPanel;
    private JTextField tfEANCode;
    private JButton btnCheck;
    private JLabel jlbWCheckMarks;

    public View() throws  HeadlessException{
        setContentPane(mainPanel);
        setTitle("EAN-13-Code Checker");
        setSize(300, 100);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        btnCheck.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(EANCode.istKorrekt(tfEANCode.getText())){
                    jlbWCheckMarks.setIcon(View.this.imgIntoIcon("Checkmark.png"));
                    jlbWCheckMarks.setSize(50, 50);
                }
                else{
                    jlbWCheckMarks.setIcon(View.this.imgIntoIcon("FalseMark.png"));
                    jlbWCheckMarks.setSize(50, 50);
                }
            }
        });
    }
    private Icon imgIntoIcon(String imgPath) throws HeadlessException{
        return new ImageIcon(Objects.requireNonNull(this.getClass().getResource(imgPath)));
    }
    public static void main(String[] args) {
        View view = new View();
    }
}
