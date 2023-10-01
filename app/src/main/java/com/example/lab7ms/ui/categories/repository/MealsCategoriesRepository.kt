//Universidad del Valle de Guatemala
//Programación de Plataformas Móviles
//Sección 20
//Mónica Salvatierra
//Carné: 22249

package com.example.lab7ms.ui.categories.repository

import com.example.lab7ms.networking.MealsWebService
import com.example.lab7ms.networking.response.MealResponseCategories
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MealsCategoriesRepository(private val webService: MealsWebService= MealsWebService()){
    fun getMealCategories(successCallback: (response: MealResponseCategories?) -> Unit){
        return webService.getMealCategories().enqueue(object: Callback<MealResponseCategories>{
            override fun onResponse(
                call: Call<MealResponseCategories>,
                response: Response<MealResponseCategories>
            ){
                if (response.isSuccessful)
                    successCallback(response.body())
            }

            override fun onFailure(call: Call<MealResponseCategories>, t: Throwable) {
                TODO("Not yet implemented")
            }
        }
        )
    }
}