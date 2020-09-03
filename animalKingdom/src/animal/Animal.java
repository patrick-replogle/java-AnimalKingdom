package animal;

abstract class Animal
{
    private static int maxId = 0;
    protected int id;
    protected String name;
    protected int year;

    public Animal(String name, int year)
    {
        maxId++;
        id = maxId;
        this.name = name;
        this.year = year;
    }

    abstract String move();
    abstract String breath();
    abstract String reproduce();

    String consume()
    {
        return "Yummy";
    }

    String getName() 
    {
        return name;
    }

    int getYear()
    {
        return year;
    }

    void setName(String name)
    {
        this.name = name;
    }

    void setYear(int year)
    {
        this.year = year;
    }

    @Override
    public String toString()
    {
        return "Id: " + id + ", Name: " + name + ", Year: " + year;
    }
}

