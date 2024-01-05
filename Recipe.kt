data class Recipe(
    // Title of the recipe, e.g., "Chapati"
    val title: String,

    // Type of the meal, e.g., "Breakfast"
    val type: String,

    // Number of people the recipe serves, e.g., 2
    val serves: Int,

    // Difficulty level of the recipe, e.g., "Easy"
    val difficulty: String,

    // List of ingredients required for the recipe, e.g., ["Flour", "Water"]
    val ingredients: List<String>,

    // List of steps to prepare the recipe, e.g., ["Mix ingredients", "Cook on frying pan"]
    val steps: List<String>
)
