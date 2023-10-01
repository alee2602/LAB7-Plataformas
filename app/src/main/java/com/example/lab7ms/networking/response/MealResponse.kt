//Universidad del Valle de Guatemala
//Programación de Plataformas Móviles
//Sección 20
//Mónica Salvatierra
//Carné: 22249

package com.example.lab7ms.networking.response

import com.google.gson.annotations.SerializedName

data class MealResponseCategories(val categories: List<MealResponse>)

data class MealResponse(
    @SerializedName("idCategory") val id: String,
    @SerializedName("strCategory") val name: String,
    @SerializedName("strCategoryDescription") val description: String,
    @SerializedName("strCategoryThumb") val imageUrl: String
)

data class MealResponseFilter(val meals: List<Meals>)

data class Meals(
   @SerializedName("strMeal") val stringMeal: String,
   @SerializedName("strMealThumb") val imageUrlmeal: String,
   @SerializedName("idMeal") val idmeal: String,
)

data class MealResponseLookup(val meals: List<MealDetailList>)

data class MealDetailList(
    @SerializedName("idMeal") val idmeal: String,
    @SerializedName("strMeal") val name: String,
    @SerializedName("strDrinkAlternate") val drinkAlternate: String?,
    @SerializedName("strCategory") val category: String,
    @SerializedName("strArea") val area: String,
    @SerializedName("strInstructions") val instructions: String,
    @SerializedName("strMealThumb") val mealimage: String,
    @SerializedName("strTags") val tags: String,
    @SerializedName("strYoutube") val youtube: String,
    @SerializedName("strIngredient1") val strIngredient1: String,
    @SerializedName("strIngredient2") val strIngredient2: String,
    @SerializedName("strIngredient3") val strIngredient3: String,
    @SerializedName("strIngredient4") val strIngredient4: String,
    @SerializedName("strIngredient5") val strIngredient5: String,
    @SerializedName("strIngredient6") val strIngredient6: String,
    @SerializedName("strIngredient7") val strIngredient7: String,
    @SerializedName("strIngredient8") val strIngredient8: String,
    @SerializedName("strIngredient9") val strIngredient9: String,
    @SerializedName("strIngredient10") val strIngredient10: String,
    @SerializedName("strIngredient11") val strIngredient11: String,
    @SerializedName("strIngredient12") val strIngredient12: String,
    @SerializedName("strIngredient13") val strIngredient13: String,
    @SerializedName("strIngredient14") val strIngredient14: String,
    @SerializedName("strIngredient15") val strIngredient15: String,
    @SerializedName("strIngredient16") val strIngredient16: String,
    @SerializedName("strIngredient17") val strIngredient17: String,
    @SerializedName("strIngredient18") val strIngredient18: String,
    @SerializedName("strIngredient19") val strIngredient19: String,
    @SerializedName("strIngredient20") val strIngredient20: String,
    @SerializedName("strMeasure1") val strMeasure1: String,
    @SerializedName("strMeasure2") val strMeasure2: String,
    @SerializedName("strMeasure3") val strMeasure3: String,
    @SerializedName("strMeasure4") val strMeasure4: String,
    @SerializedName("strMeasure5") val strMeasure5: String,
    @SerializedName("strMeasure6") val strMeasure6: String,
    @SerializedName("strMeasure7") val strMeasure7: String,
    @SerializedName("strMeasure8") val strMeasure8: String,
    @SerializedName("strMeasure9") val strMeasure9: String,
    @SerializedName("strMeasure10") val strMeasure10: String,
    @SerializedName("strMeasure11") val strMeasure11: String,
    @SerializedName("strMeasure12") val strMeasure12: String,
    @SerializedName("strMeasure13") val strMeasure13: String,
    @SerializedName("strMeasure14") val strMeasure14: String,
    @SerializedName("strMeasure15") val strMeasure15: String,
    @SerializedName("strMeasure16") val strMeasure16: String,
    @SerializedName("strMeasure17") val strMeasure17: String,
    @SerializedName("strMeasure18") val strMeasure18: String,
    @SerializedName("strMeasure19") val strMeasure19: String,
    @SerializedName("strMeasure20") val strMeasure20: String,
    @SerializedName("strSource") val source: String,
    @SerializedName("strImageSource") val imageSource: String?,
    @SerializedName("strCreativeCommonsConfirmed") val creativeCommonsConfirmed: String?,
    @SerializedName("dateModified") val dateModified: String?
)


