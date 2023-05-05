public class PersegiP {
    float panjang;
    float lebar;

    public PersegiP(float panjang, float lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public float getPanjang() {
        return panjang;
    }

    public void setPanjang(float panjang) {
        this.panjang = panjang;
    }

    public float getLebar() {
        return lebar;
    }

    public void setLebar(float lebar) {
        this.lebar = lebar;
    }

    public float luas() {
        return panjang*lebar;
    }

    public float keliling() {
        return (panjang*2)+(lebar*2);
    }
}
