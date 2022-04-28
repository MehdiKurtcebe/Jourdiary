import java.util.ArrayList;

public class User {
    
    private String name;
    
    private String surname;
    
    private final String id;

    private ArrayList<String> hobbies;

    private Notebook notebook;

    public User(){
        this("unknown_NAME","unknown_SURNAME");
    }

    public User(String name, String surname){
        this.name = name;
        this.surname = surname;
        this.id = "unknown_ID";
        this.hobbies = new ArrayList<>();
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

    public ArrayList<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(ArrayList<String> hobbies) {
        this.hobbies = hobbies;
    }

    public Notebook getNotebook() {
        return notebook;
    }

    public void setNotebook(Notebook notebook) {
        this.notebook = notebook;
    }
}
