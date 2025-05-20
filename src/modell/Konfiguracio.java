
package modell;

public class Konfiguracio {
    private String nev;
    private int szakIndex;
    private boolean hirlevel;

    public Konfiguracio(String nev, int szakIndex, boolean hirlevel) {
        this.nev = nev;
        this.szakIndex = szakIndex;
        this.hirlevel = hirlevel;
    }

    public boolean isHirlevel() {
        return hirlevel;
    }

    public String getNev() {
        return nev;
    }

    public int getSzakIndex() {
        return szakIndex;
    }

    //az objektum szöveges reprezentációja
    @Override
    public String toString() {
        return "Konfiguracio{" 
                + "nev=" + nev 
                + ", szakIndex=" + szakIndex 
                + ", hirlevel=" + hirlevel + '}';
    }


    
    
}
