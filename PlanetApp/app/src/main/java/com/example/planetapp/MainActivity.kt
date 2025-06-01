package com.example.planetapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.planetapp.models.Planet
import com.example.planetapp.navigation.NavGraph
import com.example.planetapp.ui.theme.PlanetAppTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val PLanetList = listOf(
            Planet(
                id = 1,
                name = "Earth",
                type = "Terrestrial",
                galaxy = "Milky Way",
                distanceFromSun = "149.6 million km",
                diameter = "12,742 km",
                characteristics = "Support life, has water and atmosphere",
                imageRes = R.drawable.terra
            )
        )

        setContent {
            NavGraph (
                onSettingsClick = {

                },
                onHelpClick = {

                },
                planetList = PLanetList
            )
        }
    }

}