package com.fuckyou.app.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.fuckyou.app.telegram.LoginState

@Composable
fun LoginScreen(
    state: LoginState,
    onPhone: (String) -> Unit,
    onCode: (String) -> Unit,
    onPassword: (String) -> Unit,
) {
    var phone by remember { mutableStateOf("+") }
    var code by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text("FuckYou", fontSize = 40.sp, fontWeight = FontWeight.Black)
        Text(
            "сторонний клиент Telegram",
            fontSize = 14.sp,
            modifier = Modifier.padding(bottom = 32.dp),
        )

        when (state) {
            is LoginState.NeedPhone, is LoginState.Error -> {
                OutlinedTextField(
                    value = phone,
                    onValueChange = { phone = it },
                    label = { Text("Номер телефона") },
                    singleLine = true,
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
                    modifier = Modifier.fillMaxWidth(),
                )
                Button(
                    onClick = { onPhone(phone) },
                    modifier = Modifier.fillMaxWidth().padding(top = 16.dp),
                ) { Text("Получить код") }
            }

            is LoginState.NeedCode -> {
                Text("Введите код из Telegram", modifier = Modifier.padding(bottom = 8.dp))
                OutlinedTextField(
                    value = code,
                    onValueChange = { code = it },
                    label = { Text("Код") },
                    singleLine = true,
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.NumberPassword),
                    modifier = Modifier.fillMaxWidth(),
                )
                Button(
                    onClick = { onCode(code) },
                    modifier = Modifier.fillMaxWidth().padding(top = 16.dp),
                ) { Text("Войти") }
            }

            is LoginState.NeedPassword -> {
                Text("Двухэтапная проверка", modifier = Modifier.padding(bottom = 8.dp))
                OutlinedTextField(
                    value = password,
                    onValueChange = { password = it },
                    label = { Text("Пароль (2FA)") },
                    singleLine = true,
                    visualTransformation = PasswordVisualTransformation(),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                    modifier = Modifier.fillMaxWidth(),
                )
                Button(
                    onClick = { onPassword(password) },
                    modifier = Modifier.fillMaxWidth().padding(top = 16.dp),
                ) { Text("Подтвердить") }
            }

            is LoginState.Authorized -> Text("Вход выполнен ✅")
        }

        if (state is LoginState.Error) {
            Text(
                state.message,
                color = androidx.compose.material3.MaterialTheme.colorScheme.error,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(top = 16.dp).fillMaxWidth(),
            )
        }
    }
}
