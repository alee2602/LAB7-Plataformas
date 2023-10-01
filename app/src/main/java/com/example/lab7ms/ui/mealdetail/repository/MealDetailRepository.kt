//Universidad del Valle de Guatemala
//Programación de Plataformas Móviles
//Sección 20
//Mónica Salvatierra
//Carné: 22249

package com.example.lab7ms.ui.mealdetail.repository

import com.example.lab7ms.networking.MealsWebService
import com.example.lab7ms.networking.response.MealResponseLookup
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MealDetailRepository(private val webService: MealsWebService= MealsWebService()) {
    fun getMealById(mealId: String, successCallback: (response: MealResponseLookup?) -> Unit){
        return webService.getMealById(mealId).enqueue(object: Callback<MealResponseLookup>{
            override fun onResponse(
                call: Call<MealResponseLookup>,
                response: Response<MealResponseLookup>
            ){
                if (response.isSuccessful)
                    successCallback(response.body())
            }

            override fun onFailure(call: Call<MealResponseLookup>, t: Throwable) {
                TODO("Not yet implemented")
            }
        }
        )
    }
}