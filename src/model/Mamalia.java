package model;

public class Mamalia extends Hewan {
    private boolean menyusui;

    public Mamalia(String nama, String jenis, String habitat, float umur, boolean menyusui) {
        super(nama, jenis, habitat, umur);
        this.menyusui = menyusui;
    }

    public boolean isMenyusui() {
        return menyusui;
    }

    public void setMenyusui(boolean menyusui) {
        this.menyusui = menyusui;
    }

    @Override
    public String toString() {
        return super.toString() + " | Mamalia [Menyusui: " + (menyusui ? "Ya" : "Tidak") + "]";
    }
}
