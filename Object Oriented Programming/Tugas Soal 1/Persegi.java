public class Persegi {
    float sisi;

    public Persegi(float sisi) {
        this.sisi = sisi;
    }

    public float getSisi() {
        return sisi;
    }

    public void setSisi(float sisi) {
        this.sisi = sisi;
    }

    public float luas() {
        return sisi*sisi;
    }

    public float keliling() {
        return sisi*4;
    }
}
