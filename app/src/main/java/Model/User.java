package Model;

import java.util.List;

/**
 * @Author Dylan
 */
public class User {

    private int id;
    private String name;
    private String pseudo;
    private List<App> listApp;

    public User(String name, String pseudo) {
        this.name = name;
        this.pseudo = pseudo;
    }

    public User(int id, String name, String pseudo) {
        this.id = id;
        this.name = name;
        this.pseudo = pseudo;
    }

    public User(int id, String name, String pseudo, List<App> listApp) {
        this.name = name;
        this.pseudo = pseudo;
        this.listApp = listApp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public List<App> getListApp() {
        return listApp;
    }

    public void setListApp(List<App> listApp) {
        this.listApp = listApp;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pseudo='" + pseudo + '\'' +
                ", listApp=" + listApp +
                '}';
    }
}
