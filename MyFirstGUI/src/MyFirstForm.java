import javax.swing.*;

public class MyFirstForm {
    private JButton szamoljButton;
    private JPanel panel1;
    private JTextField szamTextField;
    private JCheckBox elfogadomAFeltételeketCheckBox;

    private void szamoljButtonActionPerformed(java.awt.event.ActionEvent evt){
        double a = Double.parseDouble(szamTextField.getText());
        System.out.println(a*3);
    }
}