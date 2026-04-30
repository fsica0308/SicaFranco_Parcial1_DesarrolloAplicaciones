package ar.edu.parcial1sicafranco

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import ar.edu.parcial1sicafranco.presentation.screens.PokemonListScreen
import ar.edu.parcial1sicafranco.ui.theme.Parcial1SicaFrancoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Parcial1SicaFrancoTheme {
                PokemonListScreen()
            }
        }
    }
}
