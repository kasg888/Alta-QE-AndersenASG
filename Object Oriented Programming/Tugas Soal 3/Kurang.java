public class Kurang extends Kalkulator{
    int angka1;
    int angka2;

    public Kurang(int angka1, int angka2) {
        this.angka1 = angka1;
        this.angka2 = angka2;
    }

    public int getAngka1() {
        return angka1;
    }

    public void setAngka1(int angka1) {
        this.angka1 = angka1;
    }

    public int getAngka2() {
        return angka2;
    }

    public void setAngka2(int angka2) {
        this.angka2 = angka2;
    }

    @Override
    public int rkurang() {
        int rkurang = angka1-angka2;
        System.out.println("Hasil = " +rkurang);
        return super.rkurang();
    }
}
