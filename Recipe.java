import java.util.ArrayList;
/**
 * Write a description of class Recipe_Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Recipe
{
    private String title = "Your Home Kitchen";
    private ArrayList<String>ingredients = new ArrayList<>();
    private ArrayList<String>steps = new ArrayList<>();
    private int servings;
    public Recipe(int servings)
    {
        this.servings = servings;
    }
    public void addIngredient(String ingredient)
    {
        ingredients.add(ingredient);
    }
    public void addSteps(String step)
    {
        steps.add(step);
    }
    public String getTitle()
    {
        return title;
    }
    public int getServings()
    {
        return servings;
    }
    public ArrayList<String> getIngredients()
    {
        return ingredients;
    }
    public ArrayList<String> getSteps()
    {
        return steps;
    }
}
