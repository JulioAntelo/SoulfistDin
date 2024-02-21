package com.example.soulfist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.soulfist.Routes.Routes
import com.example.soulfist.Screens.ScreenEO
import com.example.soulfist.Screens.ScreenInicio
import com.example.soulfist.ui.theme.SoulfistTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SoulfistTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navcontroller = rememberNavController()
                    NavHost(navController = navcontroller, startDestination = Routes.screeninicial.route){
                        composable(Routes.screeninicial.route) { ScreenInicio(navController = navcontroller) }

                    }
                }
            }
        }
    }
}
