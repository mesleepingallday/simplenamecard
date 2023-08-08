package com.example.danhthiep

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.danhthiep.ui.theme.DanhThiepTheme
import androidx.compose.material3.Icon
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DanhThiepTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    Column(Modifier.background(Color(0xFF158467))) {
                        Column1()
                        Column2()
                    }

                }
            }
        }
    }
}


@Composable
fun Column1(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val image = painterResource(id = R.drawable.icon)
        Image(painter = image, contentDescription = "icon", modifier = modifier
            .padding(start = 100.dp, end = 100.dp, top = 250.dp))
        Text(
            text = "Nguyen Hoang Hai",
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Android Developer 2023",
            color = Color(0xFF3ddc84),
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
fun Row1(icon: ImageVector, content: String, description: String, modifier: Modifier = Modifier) {
    Row(
        Modifier
            .fillMaxWidth()
    ){
        Icon(
            imageVector = icon,
            contentDescription = description,
            modifier = modifier.padding(end = 20.dp))
        Text(
            text = content,
            modifier = Modifier.weight(1f)
        )
    }
}

@Composable
fun Column2(modifier: Modifier = Modifier) {
    Column(Modifier.padding(top = 100.dp, start = 100.dp, end = 50.dp)) {
        Row1(Icons.Rounded.Phone,"+89 (0)34428xxxx", "phonenumber")
        Row1(Icons.Rounded.Share,"@Android Dev", "androiddev")
        Row1(Icons.Rounded.Email,"umaruchan2k1@gmail.com", "email")
    }

}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DanhThiepTheme {
        Column(
            Modifier.background(Color(0xFF158467))
        ) {
            Column1()
            Column2()
        }
    }
}