import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class giris extends JFrame  {

    public static void main(String[] args) throws Exception {
        String no;
        JFrame frame = new gui();
        no=JOptionPane.showInputDialog(null,"1:Konsol  2:GUI");
        frame.setVisible(false);
        if (no.equals("2")){

            frame.setVisible(true);


        }
        else {
            Console.Fonk();
        }
    }


}
