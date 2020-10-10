package Model;


public class App {

    private String libelle;
    private String typeApp;

    public App(String libelle, String typeApp) {
        this.libelle = libelle;
        this.typeApp = typeApp;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getTypeApp() {
        return typeApp;
    }

    public void setTypeApp(String typeApp) {
        this.typeApp = typeApp;
    }

    @Override
    public String toString() {
        return "App{" +
                "libelle='" + libelle + '\'' +
                ", typeApp='" + typeApp + '\'' +
                '}';
    }



}
