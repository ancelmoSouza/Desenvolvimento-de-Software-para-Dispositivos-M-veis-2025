package com.example.cadapp

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun PetForm(navController: NavController) {
    var pet_type by remember { mutableStateOf("") }
    var pet_race by remember { mutableStateOf("") }
    var pet_name by remember { mutableStateOf("") }
    var pet_age by remember { mutableStateOf("") }
    var pet_sex by remember { mutableStateOf("") }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Text(
            text = "Cadastro de Usuário e Pet",
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
            )
        )

        Spacer(modifier = Modifier.height(20.dp))

        TextField(
            value = pet_type,
            onValueChange = {pet_type = it},
            label = {Text("Qual o seu pet?")}
        )

        TextField(
            value = pet_race,
            onValueChange = {pet_race = it},
            label = {Text("Raça")}
        )

        TextField(
            value = pet_name,
            onValueChange = {pet_name = it},
            label = {Text("Nome do pet?")}
        )
        Spacer(modifier = Modifier.height(1.dp))

        TextField(
            value = pet_age,
            onValueChange = {pet_age = it},
            label = {Text("Idade do pet?")}
        )

        TextField(
            value = pet_sex,
            onValueChange = {pet_sex = it},
            label = {Text("Sexo do seu pet?")}
        )

        Spacer(modifier = Modifier.height(25.dp))

        Button(onClick = {
            pet_type = ""
            pet_age = ""
            pet_race = ""
            pet_sex = ""
            pet_name = ""
        }) {
            Text("Clear")
        }

        Spacer(modifier = Modifier.height(10.dp))

        Button(onClick = {}) {
            Text("Enviar")
        }

        Spacer(modifier = Modifier.height(10.dp))

        Button(onClick = {
            navController.navigate("user")
        }) {
            Text("<- Voltar")
        }

    }
}