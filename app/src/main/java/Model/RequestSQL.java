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
