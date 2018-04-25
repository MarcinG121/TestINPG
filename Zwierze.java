
public class Zwierze {

    private String gatunek;
    private String rodzaj;
    private int wiek;
    private int iloscOdnozy;
    private String opis;

    public Zwierze(){
        this("Brak", "Brak", "Non description", 0, 0);
    }
    public Zwierze(String gatunek, String rodzaj, String opis) {
        this.gatunek = gatunek;
        this.rodzaj = rodzaj;
        this.opis = opis;
    }
    public Zwierze(String gatunek, String rodzaj, String opis, int wiek, int iloscOdnozy){
        this(gatunek, rodzaj, opis);
        this.wiek = wiek;
        this.iloscOdnozy = iloscOdnozy;
    }
    public String getNazwa(){
        return gatunek+rodzaj;
    }
    public int getWiek(){
        return wiek;
    }
    public int getIloscOdnozy() {
        return iloscOdnozy;
    }
    public String getOpis() {
        return opis;
    }
    public void showAllInfo(){
        System.out.println(gatunek+"\n"+rodzaj+"\n"+wiek+"\n"+iloscOdnozy+"\n"+opis);
    }
}
