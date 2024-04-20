package com.example.advaitassignment

sealed class Screen(val route: String){
    object Home: Screen("home_screen")
}
