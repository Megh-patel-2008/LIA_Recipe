
/**
 * Write a description of class Baking here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Baking extends Recipe_Book

{
    private int ovenTemp;
    private int bakeTime;
    private boolean containsEgg;
    
    public Baking(int servings, int ovenTemp, int bakeTime, boolean containsEgg)
    {
        super(servings);
        this.ovenTemp = ovenTemp;
        this.bakeTime = bakeTime;
        this.containsEgg = containsEgg;
    }
}
