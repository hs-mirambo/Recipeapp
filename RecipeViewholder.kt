class RecipeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    // Function to bind the data of a recipe to the ViewHolder
    fun bind(recipe: Recipe) {
        // Set the title of the recipe to the TextView with id 'titleTextView' in the layout
        itemView.findViewById<TextView>(R.id.titleTextView).text = recipe.title
        // You can bind other UI elements here if needed
    }
}
