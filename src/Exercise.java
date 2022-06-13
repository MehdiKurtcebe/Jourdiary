public class Exercise 
{
    public String name;
    public int cal;

    public Exercise(String n, int cal)
    {
        this.name = n;
        this.cal = cal;
    }

    public String getName()
    {
        return name;
    }

    public int getCal()
    {
        return cal;
    }

    public String toString()
    {
        return name + " : "+ cal + "\n";
    }
}
