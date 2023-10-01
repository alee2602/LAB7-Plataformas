//Universidad del Valle de Guatemala
//Programación de Plataformas Móviles
//Sección 20
//Mónica Salvatierra
//Carné: 22249

package com.example.lab7ms.ui.mealdetail.viewmodel

import androidx.lifecycle.ViewModel
import com.example.lab7ms.networking.response.MealResponseLookup
import com.example.lab7ms.ui.mealdetail.repository.MealDetailRepository


class MealDetailsViewModel(private val repository: MealDetailRepository = MealDetailRepository()) : ViewModel() {
    fun getMealById(
        mealId: String,
        successCallback: (response: MealResponseLookup?) -> Unit
    ) {
        repository.getMealById(mealId) { response ->
            successCallback(response)
        }
    }
}
