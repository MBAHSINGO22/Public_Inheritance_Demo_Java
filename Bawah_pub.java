package Modul_7;

public class Bawah_pub extends Atas_pub {
    public void cetak2() {
        System.out.println("Ada di class BAWAH ..");
        System.out.println("i = " + i);
    }

    public static void main(String[] args) {
        Bawah_pub bwh = new Bawah_pub();
        bwh.cetak1();
        bwh.cetak2();
    }
}
