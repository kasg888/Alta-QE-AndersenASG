public class Segitiga {
    double alas;
    double tinggi;

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double getAlas() {
        return alas;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double luas() {
        return alas*tinggi/2;
    }

    public double keliling() {
        double miring = Math.sqrt((alas*alas)+(tinggi*tinggi));
        return alas+tinggi+miring;
    }
}
