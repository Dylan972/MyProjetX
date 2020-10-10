package Model;

public class Game extends App{

    private String lienProfil;

    public Game(String libelle, String typeApp, String lienProfil) {
        super(libelle, typeApp);
    }

    public String getLienProfil() {
        return lienProfil;
    }

    public void setLienProfil(String lienProfil) {
        this.lienProfil = lienProfil;
    }

    @Override
    public String toString() {
        return super.toString() + ", I'm a Game{" +
                "lienProfil='" + lienProfil + '\'' +
                '}';
    }


}
