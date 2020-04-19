import javax.swing.*;

public class Convertitore {
    private int conversioni;

    private JButton converti;
    private JTextField decimale;
    private JPanel conv;
    private JTextField ottale;
    private JTextField binario;
    private JTextField esadecimale;

    public Convertitore() {

    }

    public static void main(String[] args){
        JFrame frame = new JFrame("Convertitore");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new Convertitore().conv);
        frame.pack();
        frame.setVisible(true);

    }
}
