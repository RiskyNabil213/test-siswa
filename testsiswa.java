// Driver class

import java.util.Scanner;

public class testsiswa {
       
        public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        System.out.println("NAMA : ");
       String nama = in.nextLine();
        System.out.println("ID : ");
       int id = in.nextInt();
        System.out.println("IPK : ");
        double ipk = in.nextDouble();

        siswa dion = new siswa(id, nama , ipk);
            //nilai diatas 75 lulus
        if(dion.getIpk() >= 75){
            System.out.println(dion.getNama() +  "selamat anda lulus");
        } else {
            System.out.println(dion.getNama() +  "mohon maaf anda tidak lulus");
        }
        //nilai huruf
        if(dion.getIpk()<60){
            System.out.println("E");
        } else if(dion.getIpk() > 60 && dion.getIpk() <= 70) {
            System.out.println("D");
        }else if(dion.getIpk() > 70 && dion.getIpk() <= 80) {
            System.out.println("C");
        }else if(dion.getIpk() > 80 && dion.getIpk() <= 90) {
            System.out.println("B");
        }else if(dion.getIpk() > 90 && dion.getIpk() <= 100) {
            System.out.println("A");
        }


        in.close();
    }
}
