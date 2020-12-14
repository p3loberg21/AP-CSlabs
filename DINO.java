
/**
 * Write a description of class DINO here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DINO
{
    // instance variables - replace the example below with your own
    private String type;
    private int age;
    private String gender;
    private int health;

    /**
     * default Constructor for objects of class DINO
     */
    public DINO()
    {
        this.type = "dino";
        this.age = 0;
        int x = (int)(Math.random())*2;
        if(x==1)
            this.gender = "male";
        if(x==0)
            this.gender = "female";
        this.health = this.age+10;
    }
    //Explicit constructor for the DINO class
    public DINO(String t)
    {
        this.type =t;
        this.age = 0;
        this.health = this.age+10;
        int x = (int)((Math.random())*2);
        if(x==1)
            this.gender = "male";
        if(x==0)
            this.gender = "female";
    }
    
    /***********    Getters *************/
    //getter return the private instance data.
    public String getType()
    {
        return this.type;
    }
    public int getHealth()
    {
        return this.health;
    }
    public int getAge()
    {
        return this.age;
    }
    public String getGender()
    {
        return this.gender;
    }
    
    /***********    Setters *************/
    public void setType(String t)
    {
        this.type = t;
    }
    public void setGender(String g)
    {
        this.gender = g;
    }
    public void setAge(int a)
    {
        this.age = a;
    }
    public void setHealth(int h)
    {
        this.health = h;
    }
    
    /***********************************/
    
    public boolean Equals(DINO d)
    {
        if((d.getType()).equals(this.type))
            return true;
        else
            return false;
    }
    
    public void ageUp()
    {
        if(this.health>0) //le dino be livin
        {
            if(this.age<21)
                this.health +=10;
            if(this.age>25 && this.age<31)
                this.health -=5;
            if(this.age>30)
                this.health -=10;
            this.age++;
        }
    }
    
    public String toString()
    {
        String answer = this.type +" "+ this.age +" "+ this.health +" "+ this.gender;
        return answer;
    }
}
