import java.util.Scanner ;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mesafe, yas, yolculukTipi, tekYön, gidisDönüs, normalTutar, yasIndirimi, indirimliTutar, GidisDonüsBiletIndirimi, ToplamTutar;


        System.out.print("Mesafeyi km Türünden Giriniz  :");
        mesafe = input.nextInt();


        System.out.print("Yasınızı Giriniz  :");
        yas = input.nextInt();

        if (yas < 0 || mesafe < 0) {
            System.out.println("Hatalı Veri Girdiniz! ");

        } else if (yas > 0 && mesafe > 0) {
            System.out.println("Yolculuk Tipini Giriniz :");
            System.out.println("1-Tek Yön\n2-Gidiş-Dönüş  :");
            yolculukTipi = input.nextInt();

            if (yolculukTipi == 2) {
                normalTutar = (int) (mesafe * 0.20);
                System.out.println("Normal Tutar  :" + normalTutar);


                if (yolculukTipi == 1) {
                    normalTutar = (int) (mesafe * 0.10);
                    System.out.println("Normal Tutar  :" + normalTutar);


                }


                if (yas < 12) {


                    yasIndirimi = (int) (normalTutar * 0.50);
                    System.out.println("Yas İndirimi :" + yasIndirimi);

                    indirimliTutar = (int) (normalTutar - yasIndirimi);
                    System.out.println("İndirimli Tutar :" + indirimliTutar);

                    gidisDönüs = (int) (indirimliTutar * 0.20);
                    System.out.println("Gidis Dönüş Bilet İndirimi :" + gidisDönüs);

                    ToplamTutar = (int) (indirimliTutar - gidisDönüs) * 2;
                    System.out.println("Toplam Tutar  :" + ToplamTutar);
                }
                if (yas > 12 && yas < 24) {


                    yasIndirimi = (int) (normalTutar * 0.10);
                    System.out.println("Yas İndirimi :" + yasIndirimi);

                    indirimliTutar = (int) (normalTutar - yasIndirimi);
                    System.out.println("İndirimli Tutar :" + indirimliTutar);

                    gidisDönüs = (int) (indirimliTutar * 0.20);
                    System.out.println("Gidis Dönüş Bilet İndirimi :" + gidisDönüs);

                    ToplamTutar = (int) (indirimliTutar - gidisDönüs) * 2;
                    System.out.println("Toplam Tutar  :" + ToplamTutar);
                }
                if (yas > 65) {


                    yasIndirimi = (int) (normalTutar * 0.30);
                    System.out.println("Yas İndirimi :" + yasIndirimi);

                    indirimliTutar = (int) (normalTutar - yasIndirimi);
                    System.out.println("İndirimli Tutar :" + indirimliTutar);

                    gidisDönüs = (int) (indirimliTutar * 0.20);
                    System.out.println("Gidis Dönüş Bilet İndirimi :" + gidisDönüs);

                    ToplamTutar = (int) (indirimliTutar - gidisDönüs) * 2;
                    System.out.println("Toplam Tutar  :" + ToplamTutar);
                }
            }
        }

    }
        }

