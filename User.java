public class User {
    
    private String _Name; /** Name of user */
    
    private String _Surname;/** Surname of user */
    
    private String _ID; /** ID of user */

    /**Hobbies of user */
    private String[] hobbies;

    /**Instance of Notebook class */
    Notebook notebook; 

    User(){
        this("unknown_NAME","unknown_SURNAME","unknown_ID");
    }

    /**
     * Constructor method with 3 parameters
     * @param name Name of user
     * @param surname Surname of user
     * @param ID ID of user
     */
    User(String name, String surname, String ID ){
        _Name = name;
        _Surname = surname;
        _ID = ID;
    }

    /**
     * Setter method for name of user
     * @param name Name of user
     */
    public void set_Name(String name){
        _Name = name;
    }

    /**
     * Setter method for surname of user
     * @param surname Surname of user
     */
    public void set_Surname(String surname){
        _Surname = surname;
    }

    /**
     * Getter method for name of user
     * @return Returns name of user
     */
    public String get_Name(){
        return _Name;
    }

    /**
     * Getter method for surname of user
     * @return Returns surname of user
     */
    public String get_Surname(){
        return _Surname;
    }

    /**
     * Getter method for ID of user
     * @return Returns ID of user
     */
    public String get_ID(){
        return _ID;
    }

    /**
     * Setter method for ID of user
     * @param ID ID of user
     */
    public void set_ID(String ID){
        _ID = ID;
    }

}
