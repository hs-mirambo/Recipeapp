// Explore Activity
class ExploreActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var fabAddRecipe: FloatingActionButton

    // A list of recipes
    private val recipeList = mutableListOf(
        Recipe("Chapati", "Breakfast", 2, listOf("Flour", "Water"), listOf("Mix ingredients", "Cook on frying pan")),
        Recipe("Coleslaw", "Lunch", 4, listOf("Mayonnaise", "Lettuce", "Carrot"),
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explore)

        // Initializing UI components
        recyclerView = findViewById(R.id.recyclerView)
        fabAddRecipe = findViewById(R.id.fabAddRecipe)

        // Setting up RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = RecipeAdapter(recipeList) { showRecipeDetails(it) }

        // Setting up click listener
        fabAddRecipe.setOnClickListener { addNewRecipe() }
    }

    // Function to show recipe details when a recipe item is clicked
    private fun showRecipeDetails(recipe: Recipe) {
        val intent = Intent(this, RecipeDetailsActivity::class.java)
        intent.putExtra("recipe", recipe)
        startActivity(intent)
    }

    // Function to handle adding a new recipe
    private fun addNewRecipe() {
        // Adding logic to handle adding a new recipe
       
    }
}
