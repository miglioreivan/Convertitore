import javax.swing.*;
import java.awt.event.ActionEvent;

public class Convertitore {
    private int conversioni;

    private JButton converti;
    private JTextField textField1;
    private JRadioButton esadecimaleRadioButton;
    private JRadioButton decimaleRadioButton;
    private JRadioButton binarioRadioButton;
    private JRadioButton ottaleRadioButton;

    public Convertitore() {

        esadecimaleRadioButton.addActionListener(ActionEvent ->{
            conversioni 1;
        })

        decimaleRadioButton.addActionListener(ActionEvent ->{
            conversioni 2;
        })

        binarioRadioButton.addActionListener(ActionEvent ->{
            conversioni 3;
        })

        ottaleRadioButton.addActionListener(ActionEvent ->{
            conversioni 4;
        })


        converti.addActionListener(ActionEvent -> {
            switch(conversioni){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }
        })
    }

    public static void main(String[] args){





    }
}
