import javax.swing.*;

public class Convertitore {
    private int conversioni;

    private JButton converti;
    private JTextField decimale;
    private JPanel conv;
    private JComboBox comboBox1;
    private JComboBox comboBox2;

    public Convertitore() {
        converti.addActionListener(a -> {

        });
    }

    public static void main(String[] args){
        JFrame frame = new JFrame("Convertitore");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new Convertitore().conv);
        frame.pack();
        frame.setVisible(true);
        JComboBox comboBox1 = new JComboBox();
        DefaultComboBoxModel comboBox1Model = new DefaultComboBoxModel();
        comboBox1Model.addElement("HEX");
        comboBox1Model.addElement("DEC");
        comboBox1Model.addElement("OTT");
        comboBox1Model.addElement("BIN");
    }
}
