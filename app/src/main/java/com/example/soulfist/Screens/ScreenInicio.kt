package com.example.soulfist.Screens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.rememberScaffoldState
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.soulfist.R
import com.example.soulfist.Routes.Routes

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScreenInicio(navController: NavHostController) {
    Column() {
        Row() {
            Button(onClick = { navController.navigate(Routes.screenEO.route) }) {
                Text(text = "Ir a Energy Overflow")
            }
            Button(onClick = { navController.navigate(Routes.screenRS.route) }) {
                Text(text = "Ir a Robust Spirit")
            }
        }
    }
}

