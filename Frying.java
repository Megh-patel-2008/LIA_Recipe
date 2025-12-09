
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
    public String getOilType(){
        return oilType;
    }
    public void setOilType(String oilType){
        this.oilType = oilType;
    }
    
    public int getFryTime(){
        return fryTime;
    }
    public void setFryTime(int fryTime){
        this.fryTime = fryTime;
    }
    public boolean isDeepFry(){
        return isDeepFry;
    }
    public void setDeepFry(boolean isDeepFry){
        this.isDeepFry = isDeepFry;
    }
}
