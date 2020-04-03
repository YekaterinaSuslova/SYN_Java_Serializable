package syn_java_serializable;

public class Country extends Characteristic {

    private static final long serialVersionUID = 1L;
    private Characteristic country;

    public Country(String name, String nameofCurrency, String capital) {
        super(name, nameofCurrency, capital);
    }

    public void setCountry(Characteristic country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return super.toString() + "[country=" + country + "]";
    }

}
