package programy;

class Pracownik {
    private String imie;
    private String nazwisko;
    private float stawka;
    private float godziny;
    private int staz;

    public Pracownik(String imie, String nazwisko) {
        this.setImie(imie);
        this.setNazwisko(nazwisko);
        this.stawka = 0;
        this.godziny = 0;
        this.staz = 0;
    }

    public Pracownik(String imie, String nazwisko, float stawka, float godziny, int staz) {

        this.setImie(imie);
        this.setNazwisko(nazwisko);
        try {
            this.setStawka(stawka);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            this.setGodziny(godziny);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            this.setStaz(staz);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public String getImie() {
        return this.imie;
    }

    public void setImie(String imie) {
        if (imie.length() > 20) {
            this.imie = imie.substring(0, 20);
        } else {
            this.imie = imie;
        }
    }

    public String getNazwisko() {
        return this.nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        if (nazwisko.length() > 50) {
            this.nazwisko = nazwisko.substring(0, 50);
        } else {
            this.nazwisko = nazwisko;
        }

    }

    public float getStawka() {
        return this.stawka;
    }

    public void setStawka(float stawka) {
        if (stawka < 0) {
            throw new IllegalArgumentException("Nie można wprowadzić ujemniej stawki");
        } else {
            this.stawka = stawka;
        }
    }

    public float getGodziny() {
        return this.godziny;
    }

    public void setGodziny(float godziny) {
        if (godziny < 320 && godziny > 0) {
            this.godziny = godziny;
        } else {
            if (godziny > 320) {
                throw new IllegalArgumentException("Liczba godzin nie może byś wieksza niż 320 ");
            } else if (godziny < 0) {
                throw new IllegalArgumentException("Liczba godzin nie może być mniejsza niż 0");
            }
        }
    }

    public int getStaz() {
        return this.staz;
    }

    public void setStaz(int staz) {
        if (staz < 55 && staz > 0) {
            this.staz = staz;
        } else {
            if (staz > 55) {
                throw new IllegalArgumentException("Staz nie moze być dłuższy niż 55 lat");
            } else if (staz < 0) {
                throw new IllegalArgumentException("Staz nie moze być mniejszy od 0 ");
            }
        }
    }

    public void wypisz() {
        System.out.println(this.getImie() + " " + this.getNazwisko() + " " + this.getStawka() + " " + this.getGodziny() + " " + this.getStaz());
    }
}


public class Kadry {

    public static void main(String[] args) {


        Pracownik pracownik1 = new Pracownik("Adam", "Romanowski");
        pracownik1.wypisz();
        System.out.println();

        Pracownik pracownik2 = new Pracownik("Rafał", "Kopydłowski", 3500.20f, 80f, 24);
        pracownik2.wypisz();
        System.out.println();

        Pracownik pracownik3 = new Pracownik("Jan", "Kołowski", -3050.40f, -2, -6);
        pracownik3.wypisz();
        System.out.println();

        Pracownik pracownik4 = new Pracownik("kamilekrafalowskiiiiiiiiiiii", "Lamito", -4f, 4000f, 80);
        System.out.println();
        pracownik4.wypisz();

    }
}

