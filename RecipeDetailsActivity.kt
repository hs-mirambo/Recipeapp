class RecipeDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // Setting the content view to the layout defined in activity_recipe_details.xml
        setContentView(R.layout.activity_recipe_details)

        // Retrieving the Recipe object from the intent
        val recipe = intent.getSerializableExtra("recipe") as Recipe

        findViewById<TextView>(R.id.titleTextView).text = recipe.title

        findViewById<TextView>(R.id.typeTextView).text = "Type: ${recipe.type}"

        findViewById<TextView>(R.id.servesTextView).text = "Serves: ${recipe.serves}"

        findViewById<TextView>(R.id.difficultyTextView).text = "Difficulty: ${recipe.difficulty}"

        findViewById<TextView>(R.id.ingredientsTextView).text = "Ingredients: ${recipe.ingredients.joinToString(", ")}"

        findViewById<TextView>(R.id.stepsTextView).text = "Steps:\n${recipe.steps.joinToString("\n")}"
    }// setting the views to the layout defined in an xml
}
