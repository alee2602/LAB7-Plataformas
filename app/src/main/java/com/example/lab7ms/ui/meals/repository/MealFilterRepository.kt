//Universidad del Valle de Guatemala
//Programación de Plataformas Móviles
//Sección 20
//Mónica Salvatierra
//Carné: 22249

package com.example.lab7ms.ui.meals.repository

import com.example.lab7ms.networking.MealsWebService
import com.example.lab7ms.networking.response.MealResponseFilter
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MealFilterRepository(private val webService: MealsWebService= MealsWebService()) {
    fun getMealsByCategory(category: String, successCallback: (response: MealResponseFilter?) -> Unit){
        return webService.getMealsByCategory(category).enqueue(object: Callback<MealResponseFilter>{
            override fun onResponse(
                call: Call<MealResponseFilter>,
                response: Response<MealResponseFilter>
            ){
                if (response.isSuccessful)
                    successCallback(response.body())
            }

            override fun onFailure(call: Call<MealResponseFilter>, t: Throwable) {
                TODO("Not yet implemented")
            }
        }
        )
    }
}









