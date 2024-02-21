package com.example.soulfist.Routes



sealed class Routes(val route:String){
    object screeninicial:Routes("inicio")
    object screenRS:Routes("RS")
    object screenEO:Routes("EO")
}