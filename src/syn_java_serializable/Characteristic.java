package syn_java_serializable;

import java.io.Serializable;

public class Characteristic implements Serializable {

    private static final long serialVersionUID = 1L;

    static Characteristic readObject() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private String name;
    private String nameofCurrency;
    private String capital;

    public Characteristic(String name, String nameofCurrency, String capital) {
        this.name = name;
        this.nameofCurrency = nameofCurrency;
        this.capital = capital;
    }

    Characteristic(String harry_Hacker, int i, int i0, int i1, int i2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return getClass().getName() + "[name=" + name + ",nameofCurrency=" + nameofCurrency + ",capital=" + capital + "]";
    }

    void setCountry(Characteristic Kazakhstan) {
        
    }
}
