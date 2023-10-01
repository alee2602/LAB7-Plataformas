//Universidad del Valle de Guatemala
//Programación de Plataformas Móviles
//Sección 20
//Mónica Salvatierra
//Carné: 22249

package com.example.lab7ms.ui.meals.viewmodel


import androidx.lifecycle.ViewModel
import com.example.lab7ms.networking.response.MealResponseFilter
import com.example.lab7ms.ui.meals.repository.MealFilterRepository

class MealFilterViewModel(private val repository: MealFilterRepository= MealFilterRepository()) : ViewModel() {
    fun getMealsByCategory(
        category: String,
        successCallback: (response: MealResponseFilter?) -> Unit
    ) {
        repository.getMealsByCategory(category) { response ->
            successCallback(response)
        }
    }
}
