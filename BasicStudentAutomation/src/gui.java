import javax.management.RuntimeErrorException;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.basic.BasicBorders;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class gui  extends JFrame implements ItemListener, ActionListener {

    private JTextArea textAreaOgrenci;
    private JTextArea textAreaDers;
    private JTextArea textAreaNot;


    private JFrame frame = new JFrame();


    private JPanel seceneklerPanel;
    private JPanel yeniDersPanel;
    private JPanel yeniOgrenciPanel;
    private JPanel listeleDersPanel;
    private JPanel listeleOgrenciPanel;
    private JPanel ekleNotPanel;
    private JPanel listeleNotPanel;
    private JTextField dersKod;
    private JTextField dersKod2;
    private JTextField dersBaslik;
    private JTextField ogrenciNoText;
    private JTextField ogrenciNoText2;
    private JTextField ogrenciAdText;
    private JTextField ogrenciSoyadText;
    private JTextField listeleText;

    private  JTextField yilText;
    private JTextField notText;

    private JRadioButton radioButton;
    private JRadioButton radioButton2;
    private JRadioButton radioButton3;
    private JRadioButton radioButton4;
    private JRadioButton radioButton5;
    private JRadioButton radioButton6;



    private JLabel ydlabel;
    private JLabel ydlabel2;
    private JLabel bosluk;
    private JLabel bosluk2;
    private JLabel bosluk3;
    private JLabel bosluk4;
    private JLabel bosluk5;
    private JLabel bosluk6;
    private JLabel ydlabel3;
    private JLabel ogrenciNoLabel;
    private JLabel ogrenciNoLabel2;

    private JLabel ogrenciAdLabel;
    private JLabel ogrenciSoyadLabel;
    private JLabel yilLabel;
    private  JLabel notLabel;
    private JButton button;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;


    private JLabel secenekler;



    public gui () throws IOException {



        bosluk = new JLabel("");
        bosluk2 = new JLabel("");
        secenekler = new JLabel("Secenekler");

        setTitle("Ogrenci Islemleri");
        setSize(200,300);
        setVisible(false);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

//------------------------- SECENEKLER PANELİ -------------------------------------

        seceneklerPanel = new JPanel();
        seceneklerPanel.setLayout(new GridLayout(6,1));
        seceneklerPanel.setPreferredSize(new Dimension(180,240));
        //seceneklerPanel.setSize(180,300);
        seceneklerPanel.setBorder(BorderFactory.createTitledBorder("Secenekler"));

        seceneklerPanel.setVisible(true);


        radioButton = new JRadioButton("Yeni Ders");
        radioButton2 = new JRadioButton("Yeni Öğrenci");
        radioButton3 = new JRadioButton("Listele Ders");
        radioButton4 = new JRadioButton("Listele Öğrenci");
        radioButton5 = new JRadioButton("Ekle Not");
        radioButton6 = new JRadioButton("Listele Not");
        ButtonGroup g = new ButtonGroup();
        g.add(radioButton);g.add(radioButton2);g.add(radioButton3);g.add(radioButton4);g.add(radioButton5);g.add(radioButton6);
        radioButton.addItemListener(this);
        radioButton2.addItemListener(this);
        radioButton3.addItemListener(this);
        radioButton4.addItemListener(this);
        radioButton5.addItemListener(this);
        radioButton6.addItemListener(this);


        seceneklerPanel.add(radioButton);seceneklerPanel.add(radioButton2);seceneklerPanel.add(radioButton3);seceneklerPanel.add(radioButton4);seceneklerPanel.add(radioButton5);seceneklerPanel.add(radioButton6);

        add(seceneklerPanel);

        // ---------------- YENİ DERS PANEL ----------------------     button=kaydet button2=temizle

        yeniDersPanel = new JPanel();
        yeniDersPanel.setPreferredSize(new Dimension(250,240));
        yeniDersPanel.setVisible(false);
        yeniDersPanel.setBorder(BorderFactory.createTitledBorder("Yeni Ders"));
        yeniDersPanel.setLayout(new FlowLayout(FlowLayout.CENTER));


        ydlabel = new JLabel("Ders Kod"); ydlabel.setPreferredSize(new Dimension(100,30));
        ydlabel2 = new JLabel("Ders Baslik"); ydlabel2.setPreferredSize(new Dimension(100,30));
        dersKod = new JTextField(); dersKod.setPreferredSize(new Dimension(100,30));
        dersBaslik = new JTextField(); dersBaslik.setPreferredSize(new Dimension(100,30));
        button = new JButton("Kaydet"); button.setPreferredSize(new Dimension(100,30)); button.addActionListener(this);



        button2 = new JButton("Temizle"); button2.setPreferredSize(new Dimension(100,30)); button2.addActionListener(this);
        bosluk.setPreferredSize(new Dimension(100,30)); bosluk2.setPreferredSize(new Dimension(100,30));


        yeniDersPanel.add(ydlabel);yeniDersPanel.add(dersKod);yeniDersPanel.add(ydlabel2);yeniDersPanel.add(dersBaslik);yeniDersPanel.add(bosluk);yeniDersPanel.add(button);yeniDersPanel.add(bosluk2);yeniDersPanel.add(button2);
        add(yeniDersPanel,BorderLayout.EAST);


//------------------ YENİ ÖĞRENCİ PANELİ-----------------     button3=kaydet button4=temizle

        yeniOgrenciPanel = new JPanel();

        yeniOgrenciPanel.setPreferredSize(new Dimension(250,240));
        yeniOgrenciPanel.setVisible(false);
        yeniOgrenciPanel.setBorder(BorderFactory.createTitledBorder("Yeni Ogrenci"));
        yeniOgrenciPanel.setLayout(new FlowLayout(FlowLayout.CENTER));

        ogrenciAdLabel = new JLabel("Ogrenci Ad"); ogrenciSoyadLabel = new JLabel("Ogrenci Soyad"); ogrenciNoLabel = new JLabel("Ogrenci No");
        ogrenciAdText = new JTextField(); ogrenciSoyadText = new JTextField(); ogrenciNoText = new JTextField();
        button3 = new JButton("Kaydet"); button3.setPreferredSize(new Dimension(100,30)); button3.addActionListener(this);
        button4 = new JButton("Temizle"); button4.setPreferredSize(new Dimension(100,30)); button4.addActionListener(this);
        bosluk3 = new JLabel("");
        bosluk4 = new JLabel("");
        bosluk3.setPreferredSize(new Dimension(100,30)); bosluk4.setPreferredSize(new Dimension(100,30));


        ogrenciAdLabel.setPreferredSize(new Dimension(100,30));
        ogrenciSoyadLabel.setPreferredSize(new Dimension(100,30));
        ogrenciNoLabel.setPreferredSize(new Dimension(100,30));

        ogrenciAdText.setPreferredSize(new Dimension(100,30));
        ogrenciSoyadText.setPreferredSize(new Dimension(100,30));
        ogrenciNoText.setPreferredSize(new Dimension(100,30));

        yeniOgrenciPanel.add(ogrenciNoLabel);
        yeniOgrenciPanel.add(ogrenciNoText);
        yeniOgrenciPanel.add(ogrenciAdLabel);
        yeniOgrenciPanel.add(ogrenciAdText);
        yeniOgrenciPanel.add(ogrenciSoyadLabel);
        yeniOgrenciPanel.add(ogrenciSoyadText);
        yeniOgrenciPanel.add(bosluk3);
        yeniOgrenciPanel.add(button3);
        yeniOgrenciPanel.add(bosluk4);
        yeniOgrenciPanel.add(button4);

        add(yeniOgrenciPanel,BorderLayout.EAST);

//-----------------------LİSTELE DERS PANELİ---------------------------------
        listeleDersPanel = new JPanel();

        listeleDersPanel.setPreferredSize(new Dimension(250,240));
        listeleDersPanel.setVisible(false);
        listeleDersPanel.setBorder(BorderFactory.createTitledBorder("Listele Ders"));
        listeleDersPanel.setLayout(new FlowLayout(FlowLayout.CENTER));

        listeleText = new JTextField();
        textAreaDers = new JTextArea();
        textAreaDers.setPreferredSize(new Dimension(240,210));
        listeleText.setPreferredSize(new Dimension(240,210));
        listeleDersPanel.add(textAreaDers);

        add(listeleDersPanel,BorderLayout.EAST);

//-----------------------LİSTELE ÖĞRENCİ PANELİ----------------------
        listeleOgrenciPanel = new JPanel();

        listeleOgrenciPanel.setPreferredSize(new Dimension(250,240));
        listeleOgrenciPanel.setVisible(false);
        listeleOgrenciPanel.setBorder(BorderFactory.createTitledBorder("Listele Ogrenci"));
        listeleOgrenciPanel.setLayout(new FlowLayout(FlowLayout.CENTER));

        listeleText = new JTextField();
        textAreaOgrenci = new JTextArea();
        textAreaOgrenci.setPreferredSize(new Dimension(240,210));

        listeleText.setPreferredSize(new Dimension(240,210));
        listeleOgrenciPanel.add(textAreaOgrenci);

        add(listeleOgrenciPanel,BorderLayout.EAST);

//-------------------------EKLE NOT PANELİ----------------------------   button5=kaydet button6=temizle

        ekleNotPanel = new JPanel();

        ekleNotPanel.setPreferredSize(new Dimension(250,240));
        ekleNotPanel.setVisible(false);
        ekleNotPanel.setBorder(BorderFactory.createTitledBorder("Ekle Not"));
        ekleNotPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        //ogrenciNoLabel, ogrenciNoText, ydlabel,derskod,yilLabel,yiltext,notlabel,nottext,buton5,buton6
        button5 = new JButton("Kaydet"); button5.setPreferredSize(new Dimension(100,30)); button5.addActionListener(this);

        button6 = new JButton("Temizle"); button6.setPreferredSize(new Dimension(100,30)); button6.addActionListener(this);
        bosluk5 = new JLabel("");
        bosluk6 = new JLabel("");
        bosluk5.setPreferredSize(new Dimension(100,30)); bosluk6.setPreferredSize(new Dimension(100,30));

        yilLabel = new JLabel("Yil");
        yilLabel.setPreferredSize(new Dimension(100,30));
        yilText = new JTextField();
        yilText.setPreferredSize(new Dimension(100,30));
        notLabel = new JLabel("Not");
        notLabel.setPreferredSize(new Dimension(100,30));
        notText = new JTextField();
        notText.setPreferredSize(new Dimension(100,30));
        ogrenciNoLabel2 = new JLabel("Ogrenci No");
        ogrenciNoLabel2.setPreferredSize(new Dimension(100,30));
        ogrenciNoText2 = new JTextField();
        ogrenciNoText2.setPreferredSize(new Dimension(100,30));
        ydlabel3 = new JLabel("Ders Kod");
        ydlabel3.setPreferredSize(new Dimension(100,30));
        dersKod2 = new JTextField();
        dersKod2.setPreferredSize(new Dimension(100,30));
        //derskod2,yiltext,notext,ogrencinotext

        ekleNotPanel.add(ogrenciNoLabel2);
        ekleNotPanel.add(ogrenciNoText2);
        ekleNotPanel.add(ydlabel3);
        ekleNotPanel.add(dersKod2);
        ekleNotPanel.add(yilLabel);
        ekleNotPanel.add(yilText);
        ekleNotPanel.add(notLabel);
        ekleNotPanel.add(notText);
        ekleNotPanel.add(bosluk5);
        ekleNotPanel.add(button5);
        ekleNotPanel.add(bosluk6);
        ekleNotPanel.add(button6);

        add(ekleNotPanel,BorderLayout.EAST);

//---------------------- LİSTELE NOT PANELİ ----------------------------
        listeleNotPanel = new JPanel();

        listeleNotPanel.setPreferredSize(new Dimension(250,240));
        listeleNotPanel.setVisible(false);
        listeleNotPanel.setBorder(BorderFactory.createTitledBorder("Listele Not"));
        listeleNotPanel.setLayout(new FlowLayout(FlowLayout.CENTER));

        textAreaNot = new JTextArea();
        textAreaNot.setPreferredSize(new Dimension(240,210));

        listeleNotPanel.add(textAreaNot);

        add(listeleNotPanel,BorderLayout.EAST);


    }

    public static void main(String[] args) throws IOException {
        new gui();


    }



    @Override
    public void actionPerformed(ActionEvent e)  {
        JButton buttonk = (JButton) e.getSource();


        if (buttonk==button){

            try {
                File dersFile = new File("C:\\Users\\alper\\IdeaProjects\\VizeSonrasiHafta3_1\\src\\dersFile");
                FileWriter fWriterDers = new FileWriter(dersFile);
                BufferedWriter bWriterDers = new BufferedWriter(fWriterDers);

                fWriterDers.write(dersKod.getText()+"\t"+dersBaslik.getText());
                fWriterDers.close();
                JOptionPane.showMessageDialog(null,"Ders Başarılı Bir Şekilde Eklendi");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            dersKod.setText(""); dersBaslik.setText("");

        }
        else if (buttonk==button5){

            try {
                File notFile = new File("C:\\Users\\alper\\IdeaProjects\\VizeSonrasiHafta3_1\\src\\notFile");
                FileWriter fWriterNot = new FileWriter(notFile);
                BufferedWriter bWriterNot = new BufferedWriter(fWriterNot);

                fWriterNot.write(ogrenciNoText2.getText()+" "+dersKod2.getText()+" "+yilText.getText()+" "+notText.getText());
                fWriterNot.close();
                JOptionPane.showMessageDialog(null,"Not Bilgileri Başarılı Bir Şekilde Eklendi");

            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }

        }
        else if (buttonk==button3){

            try {
                File ogrenciFile = new File("C:\\Users\\alper\\IdeaProjects\\VizeSonrasiHafta3_1\\src\\ogrenciFile");
                FileWriter fWriterOgrenci = new FileWriter(ogrenciFile);
                BufferedWriter bWriterOgrenci = new BufferedWriter(fWriterOgrenci);

                fWriterOgrenci.write(ogrenciNoText.getText()+"\t"+ogrenciAdText.getText()+"\t"+ogrenciSoyadText.getText());
                fWriterOgrenci.close();
                JOptionPane.showMessageDialog(null,"Öğrenci Bilgileri Başarılı Bir Şekilde Eklendi");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }

        }

        else  if (buttonk.getText().equals("Temizle")) {
            dersKod2.setText(" ");
            yilText.setText(" ");
            notText.setText(" ");
            ogrenciNoText2.setText("");

            ogrenciNoText.setText("");
            ogrenciSoyadText.setText("");
            ogrenciAdText.setText("");

            dersKod.setText("");
            dersBaslik.setText("");



        }


    }




    @Override
    public void itemStateChanged(ItemEvent e) {
        if (radioButton.isSelected()){
            yeniOgrenciPanel.setVisible(false);
            listeleDersPanel.setVisible(false);
            listeleOgrenciPanel.setVisible(false);
            ekleNotPanel.setVisible(false);
            yeniDersPanel.setVisible(true);
            setSize(470,300);

        }
        else if (radioButton2.isSelected()){
            yeniDersPanel.setVisible(false);
            listeleDersPanel.setVisible(false);
            listeleOgrenciPanel.setVisible(false);
            ekleNotPanel.setVisible(false);
            yeniOgrenciPanel.setVisible(true);
            setSize(470,300);

        }
        else if (radioButton3.isSelected()){
            yeniDersPanel.setVisible(false);
            yeniOgrenciPanel.setVisible(false);
            listeleOgrenciPanel.setVisible(false);
            ekleNotPanel.setVisible(false);
            listeleDersPanel.setVisible(true);
            setSize(470,300);
            //LİSTELE DERS İŞLEMLERİ BURADA YAPILACAK
            try {
                File dersFile = new File("C:\\Users\\alper\\IdeaProjects\\VizeSonrasiHafta3_1\\src\\dersFile");
                FileReader fReaderDers = new FileReader(dersFile);
                BufferedReader bReaderDers = new BufferedReader(fReaderDers);
                String line = bReaderDers.readLine();
                textAreaDers.setText("DERS NO"+"\tDERS BASLİK"+"\n"+line);
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }

        }
        else if (radioButton4.isSelected()){

            try {
                File ogrenciFile = new File("C:\\Users\\alper\\IdeaProjects\\VizeSonrasiHafta3_1\\src\\ogrenciFile");
                FileReader fReaderOgrenci = new FileReader(ogrenciFile);
                BufferedReader bReaderOgrenci = new BufferedReader(fReaderOgrenci);
                String line = bReaderOgrenci.readLine();
                textAreaOgrenci.setText("ID"+"\tAd"+"\tSoyad"+"\n"+line);
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }

            yeniDersPanel.setVisible(false);
            yeniOgrenciPanel.setVisible(false);
            listeleDersPanel.setVisible(false);
            ekleNotPanel.setVisible(false);
            listeleOgrenciPanel.setVisible(true);
            setSize(470,300);
            //LİSTELE ÖĞRENCİ PANEL İŞLEMLERİ BURADA YAPILACAK

        }
        else if (radioButton5.isSelected()){
            yeniDersPanel.setVisible(false);
            yeniOgrenciPanel.setVisible(false);
            listeleDersPanel.setVisible(false);
            listeleOgrenciPanel.setVisible(false);
            ekleNotPanel.setVisible(true);
            setSize(470,300);


        }
        else if (radioButton6.isSelected()){
            yeniDersPanel.setVisible(false);
            yeniOgrenciPanel.setVisible(false);
            listeleDersPanel.setVisible(false);
            listeleOgrenciPanel.setVisible(false);
            ekleNotPanel.setVisible(false);
            listeleNotPanel.setVisible(true);
            setSize(470,300);

            try {
                File notFile = new File("C:\\Users\\alper\\IdeaProjects\\VizeSonrasiHafta3_1\\src\\notFile");
                FileReader fReaderNot = new FileReader(notFile);
                BufferedReader bReaderNot = new BufferedReader(fReaderNot);
                String line = bReaderNot.readLine();
                textAreaNot.setText("ID "+"D.Kod "+"Yil "+"Not "+"\n"+line);
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }



        }
    }



}
