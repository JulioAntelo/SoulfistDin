package com.example.soulfist.Screens
import android.annotation.SuppressLint
import android.util.Log
import android.view.RoundedCorner
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.soulfist.R
import com.example.soulfist.Routes.Routes


@Composable
fun ScreenRS(navController : NavController) {
    Column(
        modifier = Modifier.fillMaxSize()
    ){
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Button(
                onClick = { navController.navigate(Routes.screeninicial.route) }
            ) {
                Text(text = "volver al inicio")
            }

            Spacer(modifier = Modifier.width(16.dp)) // Añadir espacio entre el botón y el Box

            Box(
                modifier = Modifier
                    .background(color = Color.Gray)
                    .padding(16.dp)
            ) {
                Text(
                    text = "Guia EO Soulfist",
                    color = Color.White,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.wrapContentSize()
                )
            }
            Image(
                painter = painterResource(id = R.drawable.mokoko_genkidama),
                contentDescription = null,
                modifier = Modifier.size(120.dp)
            )
        }
        Row (){
            Box(
                modifier = Modifier
                    .background(color = Color.Gray)
                    .padding(16.dp)
                    .fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "STATS \n 1800+ spec \n 600+ crit",
                    color = Color.White,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.wrapContentSize()
                )
            }
        }
        Spacer(modifier = Modifier.width(25.dp))
        Image(
            painter = painterResource(id = R.drawable.engravings_sf_rs),
            contentDescription = null,
            modifier = Modifier.size(650.dp)
        )
    }
}