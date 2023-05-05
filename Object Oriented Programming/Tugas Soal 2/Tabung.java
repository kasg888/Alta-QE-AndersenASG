public class Tabung {
    int jari;
    int tinggit;

    public Tabung(int jari, int tinggit) {
        this.jari = jari;
        this.tinggit = tinggit;
    }

    public int getJari() {
        return jari;
    }

    public void setJari(int jari) {
        this.jari = jari;
    }

    public int getTinggit() {
        return tinggit;
    }

    public void setTinggit(int tinggit) {
        this.tinggit = tinggit;
    }

    public double volume() {
        double phi = 3.1415926535897932384626433832795028841971;
        int diameter = jari*jari;
        return phi*diameter*tinggit;
    }
}
