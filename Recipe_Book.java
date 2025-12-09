import java.util.ArrayList;
/**
 * Write a description of class Recipe_Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Recipe_Book
{
    private String title = "My kitchen";
    private ArrayList<String>ingredients = new ArrayList<>();
    private ArrayList<String>steps = new ArrayList<>();
    private int servings;
    public Recipe_Book(int servings)
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
}
