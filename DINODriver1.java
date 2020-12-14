
/**
 * Write a description of class DINODriver1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DINODriver1
{
    public static void main(String[] args)
    {
        DINO[] pop = new DINO[10];
        for(int i=0; i<pop.length; i++)
        {
            pop[i] = new DINO("TRex");
            // age up all dinos to random age between 0 and 35
            int x = (int)(Math.random()*40);
            for(int j=0 ; j< x; j++)
                pop[i].ageUp();
        }

        for(int i=0; i<pop.length; i++)
        {
            System.out.println(pop[i]);
        }
    }
}
