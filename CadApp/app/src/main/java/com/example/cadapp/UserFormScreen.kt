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
fun UserForm(navController: NavController) {
    var name by remember { mutableStateOf("") }
    var last_name by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var age by remember { mutableStateOf("") }
    var phone by remember { mutableStateOf("") }
    var street by remember { mutableStateOf("") }
    var neighborhood by remember { mutableStateOf("") }
    var number by remember { mutableStateOf("") }
    var cep by remember { mutableStateOf("") }
    var gender by remember { mutableStateOf("") }

    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ){
        Text(
            text = "Cadastro de Usuário e Pet",
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
            )
        )

        Spacer(modifier = Modifier.height(20.dp))

        TextField(
            value = name,
            onValueChange = {name = it},
            label = { Text("Nome") }
        )

        TextField(
            value = last_name,
            onValueChange = {last_name = it},
            label = { Text("Sobrenome") }
        )

        TextField(
            value = email,
            onValueChange = {email = it},
            label = { Text("Email") }
        )

        TextField(
            value = age,
            onValueChange = {age = it},
            label ={ Text("Idade")}
        )

        Spacer(modifier = Modifier.height(1.dp))

        TextField(
            value = phone,
            onValueChange = {phone = it},
            label ={ Text("Telefone")}
        )

        TextField(
            value = street,
            onValueChange = {street = it},
            label ={ Text("Rua/Travessa")}
        )

        Spacer(modifier = Modifier.height(1.dp))

        TextField(
            value = neighborhood,
            onValueChange = {neighborhood = it},
            label ={ Text("Bairro")}
        )

        TextField(
            value = number,
            onValueChange = {number = it},
            label ={ Text("Numero")}
        )

        TextField(
            value = cep,
            onValueChange = {cep = it},
            label ={ Text("Cep")}
        )

        TextField(
            value = gender,
            onValueChange = {gender = it},
            label ={ Text("Gênero")}
        )

        Spacer(modifier = Modifier.height(25.dp))

        Button(onClick = {
            name = ""
            email = ""
            last_name = ""
            age = ""
            phone = ""
            street = ""
            neighborhood = ""
            number = ""
            cep = ""
            gender = ""

        }) {
            Text("Clear")
        }

        Spacer(modifier = Modifier.height(10.dp))

        Button(onClick = {
            navController.navigate("pet")
        }) {
            Text("Proximo")
        }
    }

}