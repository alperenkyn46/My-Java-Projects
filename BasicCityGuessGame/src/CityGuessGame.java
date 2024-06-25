import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import java.util.Scanner;

public class CityGuessGame extends JFrame implements KeyListener {

    private static String [] CityNames = {"istanbul","adana","mersin","izmir","düzce"};
    private JButton [] buttons;
    private JLabel puanLabel;
    private JLabel puanlabel2;
    private JLabel puan;
    private JLabel harfLabel;
    private JTextField textField;
    private  String sehir;
    private char [] tamamlandi ;


    private JPanel gamePanel;
    private int Score=100;

    public CityGuessGame(){
        gamePanel = new JPanel();
        gamePanel.setLayout(new FlowLayout());
        gamePanel.setPreferredSize(new Dimension(600,250));
        gamePanel.setVisible(true);

        puanLabel = new JLabel("Puan: ");
        harfLabel = new JLabel("Harf Giriniz: ");
        puan = new JLabel("100");
        textField = new JTextField();
        textField.addKeyListener(this);
        textField.setPreferredSize(new Dimension(30,30));

        gamePanel.add(harfLabel);
        gamePanel.add(textField);




        Random rnd = new Random();
        int a = rnd.nextInt(0,4);
        sehir = CityNames[a];
        buttons = new JButton[sehir.length()];
        tamamlandi= new char[sehir.length()];


        for (int i=0;i<sehir.length();i++){

            buttons[i]=new JButton();
            buttons[i].setSize(30,30);
            // buttons[i].setPreferredSize(new Dimension(30,30));
            gamePanel.add(buttons[i]);

        }

        gamePanel.add(puanLabel);
        gamePanel.add(puan);


        add(gamePanel);
        setSize(600,300);
        setLocationRelativeTo(null);
        setVisible(true);
        setTitle("City Guess Game");
        setLayout(new FlowLayout());
    }


    public static void main(String[] args) {
        new CityGuessGame();


    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        char getchar=e.getKeyChar();


        for (int i=0;i<sehir.length();i++){

            if (sehir.charAt(i)==getchar){
                tamamlandi[i]=sehir.charAt(i);
                buttons[i].setText(String.valueOf(getchar));
            }
        }
        if (!sehir.contains(String.valueOf(getchar))){
            Score=Score-5;
            puan.setText(String.valueOf(Score));
        }
        if (sehir.equals(String.valueOf(tamamlandi))){
            JOptionPane.showMessageDialog(null,"Tebrikler");
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        textField.setText("");
    }
}
