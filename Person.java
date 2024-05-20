
//ejercicio 2.72 del libro
public class Person
{
    private String name;
    private int age;
    private int credits;
    private String code;
    
    public Person()
    {
     name = "Helen";
     age = 32;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setAge(int age)
    {
      System.out.println(age);
    }
    
    public void printDetails()
    {
        System.out.println("el nombre de esta persona es" + " " + name);
    }
}
    

