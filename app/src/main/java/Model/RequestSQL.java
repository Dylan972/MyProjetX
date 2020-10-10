package Model;

public class RequestSQL {

     public static final String dataBaseName = "ProjectX_db";

    /**
     * @Author Dylan
     * Champ de la TABLE USER.
     */
    private static final String ID_USER = "ID_USER";
    private static final String NAME_USER = "NAME_USER";
    private static final String PSEUDO_USER = "PSEUDO_USER";

    /**
     * Champ de la TABLE USER_APP
     */
    private static final String USER_ID =  "USER_ID";
    private static final String APP_ID =  "APP_ID";


    /**
     * Champ de la TABLE APP
     */
    private static final String ID_APP = "ID_APP";
    private static final String NAME_APP = "NAME_APP";
    private static final String TYPE_APP = "TYPE_APP";

    /**
     * champ de la TABLE GAME
     */
    private static final String ID_GAME = "ID_GAME";
    private static final String LIEN_GAME = "LIEN_GAME";


    /**
     * Rassemble les requêtes SQL de création.
     */
    public class Create {
        public static final String createTableStatement = "CREATE TABLE " + dataBaseName + " ( " + ID_USER + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                NAME_USER + " TEXT, " + PSEUDO_USER + " TEXT )";
     }


    /**
     * @Author Dylan
     * Rassemble les requêtes d'insertions.
     */
    public class Insert {



    }
}
