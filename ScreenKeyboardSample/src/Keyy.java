import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Keyy extends JFrame implements ActionListener {

    private String s1 [] = {"1","2","3","4","5","6","7","8","9","0"};
    private String s2 [] = {"Q","W","E","R","T","Y","U","I","O","P","Ğ","Ü"};
    private String s3[]={"A","S","D","F","G","H","J","K","L","Ş","İ"};
    private String s4[]={"Z","X","C","V","B","N","M","Ö","Ç","DEL"};
    private String buffer="";
    private JTextField textField;
    private JPanel pText;
    private JPanel pKey;
    public Keyy(){        setLayout(new BorderLayout());

        textField = new JTextField();
        pText = new JPanel();
        pKey = new JPanel();
        textField.setPreferredSize(new Dimension(710,250));
        add(pText,BorderLayout.CENTER);
        add(pKey,BorderLayout.SOUTH);
        pText.setLayout(new FlowLayout());


        pKey.setLayout(new GridLayout(5,1));

        pText.add(textField);
        pKey.add(createPanel(s1));
        pKey.add(createPanel(s2));
        pKey.add(createPanel(s3));
        pKey.add(createPanel(s4));



        setVisible(true);
        setLocationRelativeTo(null);
        setSize(720,480);
    }

    public static void main(String[] args) {
        new Keyy();
    }
    private JPanel createPanel(String [] row){
        JPanel p = new JPanel(new GridLayout(1, row.length));
        for (int i=0;i< row.length;i++){
            JButton button = new JButton(row[i]);
            button.setPreferredSize(new Dimension(50,50));
            p.add(button);
            button.addActionListener(this);
        }
        return p;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();

        if (button.getText().equals("DEL")){
            buffer=buffer.substring(0,buffer.length()-1);
        }
        else {
            buffer=buffer+button.getText();
        }
        textField.setText(buffer);

    }
}
