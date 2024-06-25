import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Random;

public class Game extends JFrame implements ActionListener {
    public  JPanel loginPanel;
    private JPanel level1Panel;
    private JPanel level2Panel;
    private JPanel level3Panel;
    private JButton stGameButton;
    private JButton instButton;
    private JButton levelButton;
    private JButton exitButton;
    private JLabel gameLabel;
    private ImageIcon background = new ImageIcon(getClass().getResource("background.jpg"));
    private JButton [] level1Buttons;
    private JLabel level1Label;
    private static ImageIcon [] images = {new ImageIcon("C:\\Users\\Alper\\IdeaProjects\\MemoryCardGame\\src\\Level1-InternetAssets\\0.png"),new ImageIcon("C:\\Users\\Alper\\IdeaProjects\\MemoryCardGame\\src\\Level1-InternetAssets\\1.png"),new ImageIcon("C:\\Users\\Alper\\IdeaProjects\\MemoryCardGame\\src\\Level1-InternetAssets\\2.png"),new ImageIcon("C:\\Users\\Alper\\IdeaProjects\\MemoryCardGame\\src\\Level1-InternetAssets\\3.png"),new ImageIcon("C:\\Users\\Alper\\IdeaProjects\\MemoryCardGame\\src\\Level1-InternetAssets\\4.png"),new ImageIcon("C:\\Users\\Alper\\IdeaProjects\\MemoryCardGame\\src\\Level1-InternetAssets\\5.png"),new ImageIcon("C:\\Users\\Alper\\IdeaProjects\\MemoryCardGame\\src\\Level1-InternetAssets\\6.png"),new ImageIcon("C:\\Users\\Alper\\IdeaProjects\\MemoryCardGame\\src\\Level1-InternetAssets\\7.png"),new ImageIcon("C:\\Users\\Alper\\IdeaProjects\\MemoryCardGame\\src\\Level1-InternetAssets\\8.png")};

    Icon noImage = new ImageIcon("C:\\Users\\Alper\\IdeaProjects\\MemoryCardGame\\src\\Level1-InternetAssets\\no_image.png");

    private ArrayList <ImageIcon> Cards = new ArrayList();
    private ArrayList <Integer> selectedIndices = new ArrayList();
    private int score;
    public Game(){
        setTitle("Memory Card Game");setSize(background.getIconWidth(),background.getIconHeight());setLocationRelativeTo(null);setVisible(true);setLayout(new GridLayout(5,1,5,5));setContentPane(new BackgroundPanel());
        loginPanel = new JPanel();
        loginPanel.setLayout(new GridLayout(5,0,12,12));loginPanel.setVisible(true);loginPanel.setOpaque(false);
        stGameButton = new JButton("Start Game");
        stGameButton.addActionListener(this);
        levelButton = new JButton("Select Level");
        instButton = new JButton("Instruction");
        instButton.addActionListener(this);
        exitButton = new JButton("Exit");
        gameLabel = new JLabel("Memory Card Game");
        Font font = new Font("sansserif",Font.ITALIC,30);

        gameLabel.setForeground(Color.CYAN);
        gameLabel.setFont(font);
        loginPanel.add(gameLabel);
        loginPanel.add(stGameButton);
        loginPanel.add(levelButton);
        loginPanel.add(instButton);
        loginPanel.add(exitButton);
        add(loginPanel,BorderLayout.CENTER);

        level1Panel = new JPanel();
        level1Panel.setVisible(false);
        level1Panel.setLayout(new GridLayout(4,4));
        level1Panel.setSize(480,480);
        level1Label = new JLabel("LEVEL 1: Tries Left: ");
        level1Label.setPreferredSize(new Dimension(level1Panel.getWidth(), level1Panel.getHeight()));
        level1Buttons = new JButton[16];
        // Icon [] images = {new ImageIcon("C:\\Users\\Alper\\IdeaProjects\\MemoryCardGame\\src\\Level1-InternetAssets\\0.png"),new ImageIcon("C:\\Users\\Alper\\IdeaProjects\\MemoryCardGame\\src\\Level1-InternetAssets\\1.png"),new ImageIcon("C:\\Users\\Alper\\IdeaProjects\\MemoryCardGame\\src\\Level1-InternetAssets\\2.png"),new ImageIcon("C:\\Users\\Alper\\IdeaProjects\\MemoryCardGame\\src\\Level1-InternetAssets\\3.png"),new ImageIcon("C:\\Users\\Alper\\IdeaProjects\\MemoryCardGame\\src\\Level1-InternetAssets\\4.png"),new ImageIcon("C:\\Users\\Alper\\IdeaProjects\\MemoryCardGame\\src\\Level1-InternetAssets\\5.png"),new ImageIcon("C:\\Users\\Alper\\IdeaProjects\\MemoryCardGame\\src\\Level1-InternetAssets\\6.png"),new ImageIcon("C:\\Users\\Alper\\IdeaProjects\\MemoryCardGame\\src\\Level1-InternetAssets\\7.png"),new ImageIcon("C:\\Users\\Alper\\IdeaProjects\\MemoryCardGame\\src\\Level1-InternetAssets\\8.png")};
        for (int i=0;i<8;i++){
            Cards.add(images[i]);
            Cards.add(images[i]);
        }
        Collections.shuffle(Cards);
        for (int i=0;i<16;i++){
            level1Buttons[i] = new JButton();
            level1Buttons[i].setIcon(noImage);
            level1Panel.add(level1Buttons[i]);
            level1Buttons[i].addActionListener(this);

        }
        add(level1Panel,BorderLayout.CENTER);



    }

    public static void main(String[] args) {
        new Game();
        SwingUtilities.invokeLater(() -> {
            Game frame = new Game();
            frame.setVisible(true);
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        Random rnd = new Random();
        int count=2;

        if (button.equals(instButton)){
            JOptionPane.showMessageDialog(null,"Instructions:\n There are 3 levels in game. It gets gradually harder!.\n Match all pairs of cards to win!");
        }
        if (button.equals(stGameButton)){
            level1Panel.setVisible(true);
            loginPanel.setVisible(false);
            pack();
            ShuffleThread shuffleThread = new ShuffleThread(images);
            //shuffleThread.start();
        }
        int index =-1;
        for (int i = 0; i < 16; i++) {
            if (level1Buttons[i] == button) {
                index = i;
                button.setIcon(images[index%8]);



                if (selectedIndices.size() == 1 && selectedIndices.get(0) != index) {
                    // İkinci butonun altındaki resmin gösterilmesi
                    level1Buttons[index].setIcon(images[index % 8]);

                    // Eşleşme kontrolü
                    if (images[selectedIndices.get(0) % 8].equals(images[index % 8])) {

                        // Eşleşme durumunda puan arttırma ve resimlerin gizlenmesi
                        score++;
                        JOptionPane.showMessageDialog(this, "Eşleşme! Puan: " + score);
                        //level1Buttons[selectedIndices.get(0)].setVisible(false);
                        //level1Buttons[index].setVisible(false);
                    } else {
                        // Eşleşme olmadığında resimlerin gizlenmesi
                        JOptionPane.showMessageDialog(this, "Eşleşmedi! Puan: " + score);
                        count--;

                        level1Buttons[selectedIndices.get(0)].setIcon(noImage);
                        level1Buttons[index].setIcon(noImage);
                    }
                    // Seçilen butonların indekslerinin temizlenmesi
                    selectedIndices.clear();
                } else {
                    // İlk butonun indeksinin saklanması
                    selectedIndices.add(index);
                }


            }
        }









    }

    /*public void paint (Graphics g){  // Arka Plan Rengi Ayarlama
        g.drawImage(background.getImage(),0,0,getWidth(),getHeight(),null);
    }*/
    class BackgroundPanel extends JPanel {
        private Image backgroundImage;

        public BackgroundPanel() {
            // Resim dosyasını yükle
            backgroundImage = new ImageIcon(getClass().getResource("background.jpg")).getImage();
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            // Arka plan resmini çiz
            g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        }
    }
}
