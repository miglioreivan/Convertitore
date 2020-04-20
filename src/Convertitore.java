import javax.swing.*;
import java.util.Objects;

public class Convertitore {

    private JButton converti;
    private JTextField textField1;
    private JPanel Convertitore;
    private JComboBox<String> comboBox1;
    private JComboBox<String> comboBox2;
    private JTextField textField2;
    private JButton cancButton;
    String result;
    int result1;
    
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


        cancButton.addActionListener(actionEvent -> {
            textField1.setText(null);
            textField2.setText(null);
        });

        converti.addActionListener(a -> {
            String value = (String)comboBox1.getSelectedItem();
            String dec = textField1.getText();

            switch (Objects.requireNonNull(value)){
                case "HEX":

                    String value0 = (String)comboBox2.getSelectedItem();
                    switch (Objects.requireNonNull(value0)){
                        case "HEX":
                            result = textField1.getText();
                            textField2.setText(result);
                            break;
                        case "DEC":
                            result1=Integer.parseInt(dec,16);
                            textField2.setText(String.valueOf(result1));
                            break;
                        case "OTT":
                            result1=Integer.parseInt(dec,16);
                            result= Integer.toOctalString(result1);
                            textField2.setText(result);

                            break;
                        case "BIN":
                            result1=Integer.parseInt(dec,16);
                            result= Integer.toBinaryString(result1);
                            textField2.setText(result);
                            break;
                    }

                    break;
                case "DEC":

                    String value1 = (String)comboBox2.getSelectedItem();
                    switch (Objects.requireNonNull(value1)){
                        case "HEX":
                            result = Integer.toHexString(Integer.parseInt(dec));
                            textField2.setText(result);
                            break;
                        case "DEC":
                            result = textField1.getText();
                            textField2.setText(result);
                            break;
                        case "OTT":
                            result = Integer.toOctalString(Integer.parseInt(dec));
                            textField2.setText(result);
                            break;
                        case "BIN":
                            result = Integer.toBinaryString(Integer.parseInt(dec));
                            textField2.setText(result);
                            break;
                    }

                    break;
                case "OTT":

                    String value2 = (String)comboBox2.getSelectedItem();
                    switch (Objects.requireNonNull(value2)){
                        case "HEX":
                            result1=Integer.parseInt(dec,8);
                            result= Integer.toHexString(result1);
                            textField2.setText(result);
                            break;
                        case "DEC":
                            result1=Integer.parseInt(dec,8);
                            textField2.setText(String.valueOf(result1));
                            break;
                        case "OTT":
                            result = textField1.getText();
                            textField2.setText(result);

                            break;
                        case "BIN":
                            result1=Integer.parseInt(dec,8);
                            result= Integer.toBinaryString(result1);
                            textField2.setText(result);
                            break;
                    }

                    break;
                case "BIN":

                    String value3 = (String)comboBox2.getSelectedItem();
                    switch (Objects.requireNonNull(value3)){
                        case "HEX":
                            result1=Integer.parseInt(dec,2);
                            result = Integer.toHexString(result1);
                            textField2.setText(result);
                            break;
                        case "DEC":
                            result1=Integer.parseInt(dec,2);
                            textField2.setText(String.valueOf(result1));
                            break;
                        case "OTT":
                            result1=Integer.parseInt(dec,2);
                            result = Integer.toOctalString(result1);
                            textField2.setText(result);
                            break;
                        case "BIN":
                            result = textField1.getText();
                            textField2.setText(result);
                            break;
                    }

                    break;
            }
        });

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Convertitore");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new Convertitore().Convertitore);
        frame.pack();
        frame.setVisible(true);
    }

}
