
/**
 * Write a description of class Frying here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Frying extends Recipe_Book


{ // change void with String

             
    private String oilType;
    private int fryTime;
    private boolean isDeepFry;
    public Frying(int servings, String oilType, int fryTime, boolean isDeepFry) {
        super(servings); // FIX: passes required argument to Recipe_Book
        this.oilType = oilType;
        this.fryTime = fryTime;
        this.isDeepFry = isDeepFry;
    }
}
