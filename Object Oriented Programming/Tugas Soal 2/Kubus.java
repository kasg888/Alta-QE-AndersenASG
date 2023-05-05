public class Kubus {
    float sisi;

    public Kubus(float sisi) {
        this.sisi = sisi;
    }

    public float getSisi() {
        return sisi;
    }

    public void setSisi(float sisi) {
        this.sisi = sisi;
    }

    public float volume() {
        return sisi*sisi*sisi;
    }
}
