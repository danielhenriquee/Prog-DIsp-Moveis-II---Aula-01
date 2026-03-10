package com.example.helloworld

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import org.jetbrains.compose.resources.painterResource

import helloworld.composeapp.generated.resources.Res
import helloworld.composeapp.generated.resources.compose_multiplatform

@Composable
fun App() {
    var message by remember { mutableStateOf("") }
    var showMessage by remember { mutableStateOf(false) }

    MaterialTheme {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .safeContentPadding(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text("Digite uma mensagem:")

            TextField(
                value = message,
                onValueChange = { message = it },
                modifier = Modifier.fillMaxWidth()
            )

            Button(
                onClick = { showMessage = !showMessage }
            ) {
                Text("Mostrar mensagem")
            }

            if (showMessage) {
                Text("Mensagem: $message")
            }
        }
    }
}