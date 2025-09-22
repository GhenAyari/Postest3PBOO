package model;

public class Burung extends Hewan {
    private boolean bisaTerbang;

    public Burung(String nama, String jenis, String habitat, float umur, boolean bisaTerbang) {
        super(nama, jenis, habitat, umur);
        this.bisaTerbang = bisaTerbang;
    }

    public boolean isBisaTerbang() {
        return bisaTerbang;
    }

    public void setBisaTerbang(boolean bisaTerbang) {
        this.bisaTerbang = bisaTerbang;
    }

    @Override
    public String toString() {
        return super.toString() + " | Burung [Bisa Terbang: " + (bisaTerbang ? "Ya" : "Tidak") + "]";
    }
}
