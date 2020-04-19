import javax.swing.*;

public class Convertitore {
    private int conversioni;

    private JButton converti;
    private JTextField textField1;
    private JPanel conv;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JTextField textField2;

    public Convertitore() {
        converti.addActionListener(a -> {

        });
        comboBox1.addItem("");
        comboBox1.addItem("HEX");
        comboBox1.addItem("DEC");
        comboBox1.addItem("OTT");
        comboBox1.addItem("BIN");
        comboBox2.addItem("");
        comboBox2.addItem("HEX");
        comboBox2.addItem("DEC");
        comboBox2.addItem("OTT");
        comboBox2.addItem("BIN");

    }

    public static void main(String[] args){
        JFrame frame = new JFrame("Convertitore");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new Convertitore().conv);
        frame.pack();
        frame.setVisible(true);
    }
}
