import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonTest {
    private JButton button1;
    private JPanel panel1;
    private JTextField enterEmailAddressTextField;
    private JTextField enter2DigitCountryTextField;
    String email = null;
    int cc = 0;

    public ButtonTest() {
        enterEmailAddressTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                email = enterEmailAddressTextField.getText();
            }
        });
        enter2DigitCountryTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cc = Integer.parseInt(enter2DigitCountryTextField.getText());
            }
        });

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, new UniqueValues().
                        providePersonalDetails(enterEmailAddressTextField.getText(), Integer.parseInt(enter2DigitCountryTextField.getText())));
            }
        });

    }

    public static void main(String args[]) {
        JFrame jFrame = new JFrame("ButtonTest");
        jFrame.setContentPane(new ButtonTest().panel1);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        jFrame.pack();
        jFrame.setVisible(true);
    }

}
