import javax.swing.*;

public class Convertitore {
    private int conversioni;
    private int convers;
    private String selezione;

    private JButton converti;
    private JTextField textField1;
    private JPanel Convertitore;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JTextField textField2;

    public Convertitore() {
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


        converti.addActionListener(a -> {
            String value = (String)comboBox1.getSelectedItem();

            switch (value){
                case "HEX":
                    textField1.setText("perri fa cagare");
                    break;
            }


        });

    }

    public static void main(String[] args){
        JFrame frame = new JFrame("Convertitore");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new Convertitore().Convertitore);
        frame.pack();
        frame.setVisible(true);
    }
}
