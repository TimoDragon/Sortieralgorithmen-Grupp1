public class Person {
    private String vorname;
    private String nachname;
    private int alter;

    public Person(String pVorname, String pNachname, int pAlter){
        this.vorname = pVorname;
        this.nachname = pNachname;
        this.alter = pAlter;
    }

    public String getVorname() {
        return this.vorname;
    }
    
    public String getNachname() {
        return this.nachname;
    }

    public int getAlter() {
        return this.alter;
    }

    public String toString() {
        String str = this.getVorname() + " " + this.getNachname() + " | " + this.getAlter();

        return str;
    }
}