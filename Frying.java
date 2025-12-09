
/**
 * Write a description of class Frying here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Frying extends Recipe_Book

{
    private String oilType;
    private int fryTime;
    private boolean isDeepFry;
    public Frying(int servings, String oilType, int fryTime, boolean isDeepFry) {
        super(servings);
        this.oilType = oilType;
        this.fryTime = fryTime;
        this.isDeepFry = isDeepFry;
    }
}
