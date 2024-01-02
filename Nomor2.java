import java.util.Scanner;
public class Nomor2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String[] warna= {"biru","hitam","merah","hijau","kuning","putih","ungu"};
        String[] sifat= {"Warna kesukaan kamu Biru, biasanya termasuk tipe pemurung, selalu menyenangkan dan selalu bertindak pasif\n" +
                        "dalam segala hal. Selalu mengharapkan kedamaian dan ketenangan. Kamu memiliki kesulitan dalam pergaulan.\n" +
                        "Demikian pula dalam bercinta karena kamu sering sekali menyembunyikan perasaan. ","Kamu termasuk tipe orang yang sangat lincah dalam hal-hal tertentu saja. Jika berada dilingkungan yang tidak\n" +
                        "disukai, maka kamu akan menjadi murung. Kamu selalu tampil menarik, rapi, cukup banyak lawan jenis berusaha\n" +
                        "mengejar dan merebut cinta kamu. ","Kamu sangat berwibawa dan juga senang melindungi orang yang lemah. Walau sering kali bergaul dan bercanda\n" +
                        "tapi kamu bisa menahan diri. Banyak orang mengatakan cinta, tapi kamu selalu berpikir dan berpikir lagi. Kamu\n" +
                        "termasuk tipe yang sulit jatuh cinta.","Jika warna favorit kamu hijau, maka kamu adalah tipe yang sangat romantik, menyukai keindahan, menyenangi\n" +
                        "alam dengan udara yang sejuk. Kamu adalah seseorang yang selalu memegang prinsip. Dalam hal bercinta kamu\n" +
                        "mengidam-idamkan calon teman hidup yang penuh toleransi dan dapat dipercaya.","Kesukaan kamu warna kuning menandakan bahwa kamu memiliki sifat optimis. Kamu tipe periang dan senang\n" +
                        "bergaul, tidak memiliki penampilan yang loyo. Sifat tolong-menolong selalu ada dalam diri kamu, karena menolong\n" +
                        "merupakan suatu kewajiban mutlak bagi kamu. Kamu orang yang tidak pernah meremehkan siapapun juga,\n" +
                        "walaupun seseorang itu dungu atau bloon.","Kamu adalah orang yang dilahirkan ke dunia dengan sempurna, jika menyukai warna putih, banyak orang\n" +
                        "mengagumi kamu karena sifat angun, sifat idealis dan moral kamu yang teramat tinggi. Tak pernah angkuh, senang\n" +
                        "menolong siapa saja yang membutuhkan bantuan kamu."," Warna Ungu adalah pribadi dengan tipe yang benar-benar luar biasa. Selalu optimis, dalam menghadapi masa\n" +
                        "depan kamu tidak pernah ragu-ragu, apa yang dikerjakan kamu adalah yang terbaik. Kamu pandai benar dalam\n" +
                        "mengikuti perkembangan jaman. Dalam bercinta, hanya merekalah yang kuat mental yang bisa mendekati dan\n" +
                        "menjadi kekasih kamu."};
        
        
        System.out.print("Silahkan masukkan warna kesukaan: ");
        String nama = input.nextLine();

        for(int i=0; i<warna.length; i++){
            if(nama.toLowerCase().equals(warna[i])){
                System.out.println("Karakter anda: ");
                System.out.println(sifat[i]);
                break;
            }
            else continue;
        }
        
    }
}
