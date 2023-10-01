//Universidad del Valle de Guatemala
//Programación de Plataformas Móviles
//Sección 20
//Mónica Salvatierra
//Carné: 22249

package com.example.lab7ms.ui.categories.viewmodel

import androidx.lifecycle.ViewModel
import com.example.lab7ms.networking.response.MealResponseCategories
import com.example.lab7ms.ui.categories.repository.MealsCategoriesRepository

class MealCategoriesViewModel(private val repository: MealsCategoriesRepository= MealsCategoriesRepository()): ViewModel(){
    fun getMealCategories(successCallback: (response: MealResponseCategories?) -> Unit){
        repository.getMealCategories{response ->
            successCallback(response)
        }
    }
}