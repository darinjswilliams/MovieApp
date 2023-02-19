package com.example.movieapp.navigation


//www.goggle.com/sign_in
enum class MovieScreens {
    HomeScreen,
    DetailsScreen;
    companion object{
        fun fromRoute(route: String?): MovieScreens
        = when(route?.substringBefore("/")){
            HomeScreen.name -> HomeScreen
            DetailsScreen.name -> DetailsScreen
            null -> HomeScreen
            else -> throw IllegalArgumentException("Route $route is not recogonize")
        }
    }
}