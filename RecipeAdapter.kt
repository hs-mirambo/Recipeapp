class RecipeAdapter(
    // List of recipes to be displayed in the RecyclerView
    private val recipes: List<Recipe>,

    // Callback to be invoked when a recipe item is clicked
    private val onItemClick: (Recipe) -> Unit
) : RecyclerView.Adapter<RecipeViewHolder>() {

    // Function to create a new ViewHolder instance
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_recipe, parent, false)
        return RecipeViewHolder(view)
    }

    // Function to bind data to a ViewHolder at a specific position
    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {
        // Get the recipe at the current position in the list
        val recipe = recipes[position]

     
        holder.bind(recipe)

        // Setting a click listener for the recipe item to invoke the onItemClick callback
        holder.itemView.setOnClickListener { onItemClick(recipe) }
    }

    // Function to return the total number of recipes in the list
    override fun getItemCount(): Int = recipes.size
}
