import java.util.ArrayList;

public class User {
    
    private String name;
    
    private String surname;
    
    private final String id;

    private ArrayList<String> activeHobbies;

    private ArrayList<String> passiveHobbies;

    private Notebook notebook;

    public User(String id){
        this(id, "unknown_NAME","unknown_SURNAME");
    }

    public User(String id, String name, String surname){
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.activeHobbies = new ArrayList<>();
        this.passiveHobbies = new ArrayList<>();
        this.notebook = new Notebook();
    }

    /**
     * Setter method for name of user
     * @param name Name of user
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * Setter method for surname of user
     * @param surname Surname of user
     */
    public void setSurname(String surname){
        this.surname = surname;
    }

    /**
     * Getter method for name of user
     * @return Returns name of user
     */
    public String getName(){
        return name;
    }

    /**
     * Getter method for surname of user
     * @return Returns surname of user
     */
    public String getSurname(){
        return surname;
    }

    /**
     * Getter method for ID of user
     * @return Returns ID of user
     */
    public String getId(){
        return id;
    }

    public ArrayList<String> getActiveHobbies() {
        return activeHobbies;
    }

    public void setActiveHobbies(ArrayList<String> activeHobbies) {
        this.activeHobbies = activeHobbies;
    }

    public ArrayList<String> getPassiveHobbies() {
        return passiveHobbies;
    }

    public void setPassiveHobbies(ArrayList<String> passiveHobbies) {
        this.passiveHobbies = passiveHobbies;
    }

    public Notebook getNotebook() {
        return notebook;
    }

    public void setNotebook(Notebook notebook) {
        this.notebook = notebook;
    }
}
