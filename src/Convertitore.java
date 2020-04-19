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
        comboBox1.addItem("EZ");
        comboBox1.addItem("DIOPORCO");




    }

    public static void main(String[] args){
        JFrame frame = new JFrame("Convertitore");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new Convertitore().conv);
        frame.pack();
        frame.setVisible(true);
    }
}
