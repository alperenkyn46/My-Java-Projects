

import java.util.Random;

public class CarLab {

    public static String model;
    public static String renk;
    public static String Konum;
    public static int yas;
    public static int benzinMiktari1;
    public static boolean isRenkli;

    public static int yol;
    public static int hiz;
    public static int mod;
    int benzinMiktari;

    public CarLab(String model,int yas) {
        this.model=model;
        this.yas=yas;
    }


    public void setModel(String model)
    {
        this.model=model;
    }
    public String getModel()
    {
        return model;
    }
    public void setYas(int yas)
    {
        this.yas=yas;
    }
    public int getYas()
    {
        return yas;
    }
    public static void setHiz(int hiz)
    {
        hiz=hiz;
    }
    public int getHiz()

    {
        return hiz;
    }

    public static void arttirBenzinMiktari(int z)
    {
        benzinMiktari1+=z;
    }
    public static void azaltBenzinMiktari(int z)
    {
        benzinMiktari1-=z;

    }
    public static void benzinGoster() {
        System.out.println(benzinMiktari1);
    }
    public static void renkGoster() {
        System.out.println(renk);
    }
    public static void  konumtanimlama( ) {
        if(yol>0 & yol<=50) {
            Konum="Edremit";
            System.out.println(Konum);
        }
        else if(yol>51 & yol<=100) {
            Konum="Marmara";
            System.out.println(Konum);
        }

        else if(yol>101 & yol<=150) {
            Konum="Erdek";
            System.out.println(Konum);
        }
        else if(yol>151 & yol<=200) {
            Konum="Altı Eylül";
            System.out.println(Konum);
        }
        else if(yol>201 & yol<=250) {
            Konum="Bandırma";
            System.out.println(Konum);
        }
        else if(yol<0 || yol>250) {

            System.out.println("Varmak istediğiniz lokasyon: "+yol+", alan dışındadır. Sınırlar 0-250 Arasındadır");

        }

    }

    public static void baslat(int saat)
    {

        if(benzinMiktari1>0) {
            hiz=25;
            yol=hiz*saat;
            System.out.println("Kalan Benzin: "+benzinMiktari1);
            azaltBenzinMiktari(yol);
        }
        else
            System.out.println("Benziniz yok");


        konumtanimlama();


    }

    public static void gitIleri(int saat) {
        if(benzinMiktari1>0)
        {
            yol=yol + (hiz*saat);

            azaltBenzinMiktari(hiz*saat);
            System.out.println("Kalan Benzin: "+benzinMiktari1);
            azaltBenzinMiktari(yol);

            konumtanimlama();

        }
        else
        {
            System.out.println("Yeterli benzininiz yok, en kısa süre içerisinde benzin telafisini yapınız :) ");
        }

    }
    public static void gitGeri(int saat) {
        if(benzinMiktari1>0)
        {
            yol=yol - (hiz*saat);

            azaltBenzinMiktari(hiz*saat);
            System.out.println("Kalan Benzin: "+benzinMiktari1);
            konumtanimlama();

        }
        else
        {
            System.out.println("Yeterli benzininiz yok, en kısa süre içerisinde benzin telafisini yapınız :) ");
        }
    }

    public static void artirHiz()
    {
        Random r=new Random();
        int dizi[]= {2,3,5};
        int a=r.nextInt(3);
        hiz=hiz*dizi[a];
        System.out.println("Mevcut Hızınız: "+hiz);
    }
    public static void azaltHiz()
    {

        hiz=hiz/2;
        System.out.println("Mevcut Hızınız "+hiz+" km/h'ye Düşürüldü");
    }

    public static void kontrolEtRadar() {
        if(hiz >= 140) {
            System.out.println("Radara Yakalandınız. Hızınız : " + hiz);
            mod = 3;
        }
        else if (hiz >= 100 && hiz < 140) {
            System.out.println("Hızınızı düşürünüz. Hızınız : " + hiz);
            mod = 2;
        }
        else if (hiz >= 70 && hiz < 100) {
            System.out.println("Teşekkür ederiz, güvenilir bir yolculuk yapıyorsunuz. Hızınız : " + hiz);
            mod = 1;
        }
    }
    public static void silRenk()
    {
        if(mod==3)
        {
            isRenkli=false;
        }
        else
            isRenkli=true;
    }

    public static void ataRenk()
    {
        if(mod==1)
        {
            Random r=new Random();
            String dizi[]= {"Beyaz","Mavi","Siyah","Kırmızı","Gri"};
            int a=r.nextInt(5);
            renk=dizi[a];
            System.out.println("Aracınıza Atanan Renk: "+renk);
        }
    }

    public static void gosterBilgi()
    {
        System.out.println("------------------");

        System.out.println("Aracın Modu: "+mod);

        System.out.println("Aracın Rengi: "+renk);

        System.out.println("Aracın Benzin Miktarı: "+benzinMiktari1);

        System.out.println("Aracın Hızı: "+hiz);

    }
    public static void main(String[] args) {



        baslat(3);
        gitIleri(1);
        gitGeri(6);
        artirHiz();
        azaltHiz();
        kontrolEtRadar();
        silRenk();
        ataRenk();
        gosterBilgi();
    }








}

