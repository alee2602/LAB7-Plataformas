//Universidad del Valle de Guatemala
//Programación de Plataformas Móviles
//Sección 20
//Mónica Salvatierra
//Carné: 22249

package com.example.lab7ms

    import android.os.Bundle
    import androidx.activity.ComponentActivity
    import androidx.activity.compose.setContent
    import com.example.lab7ms.ui.categories.view.MealCategoriesMainApp

    class MainActivity : ComponentActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContent {
                MealCategoriesMainApp()
            }
        }
    }


