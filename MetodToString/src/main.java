public class main {
    public static void main(String[] args) {
    Human h1 = new Human("Mike",29);
        System.out.println(h1);
    }
}

class Human
{
    private String name;
    private int age;

    public Human(String name, int age)
    {
        this.age=age;
        this.name=name;
    }

    public String toString()
    {
        return name+ " " + age;
    }
}
