package com.example.projectlayoutjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.projectlayoutjetpackcompose.ui.theme.ProjectLayoutJetPackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProjectLayoutJetPackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Greeting("Android")
                }
            }
        }
    }
}


@Composable
fun PhotographerCard(modifier: Modifier = Modifier){
    Row(modifier
        .padding(8.dp)
        .clip(RoundedCornerShape(4.dp))
        .background(MaterialTheme.colors.surface)
        .clickable(onClick = { /* Ignoring onClick */ })
        .padding(16.dp)
    ) {
        Surface(modifier = Modifier.size(50.dp),
        shape = CircleShape,
        color = MaterialTheme.colors.onSurface.copy(0.2f))
        {
            //Image
        }

        Column(modifier = Modifier
            .padding(8.dp, end = 0.dp)
            .align(Alignment.CenterVertically)) {
            Text("Onum Ungbede", fontWeight = FontWeight.Bold)
            CompositionLocalProvider(LocalContentAlpha provides ContentAlpha.medium) {
                Text("3 minutes ago", style = MaterialTheme.typography.body2)
            }
        }
        
    }
    
   
}




@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ProjectLayoutJetPackComposeTheme {
        Greeting("Android")
    }
}

@Preview
@Composable
fun PhotographerCardPreview(){
    ProjectLayoutJetPackComposeTheme{
        PhotographerCard()
    }
}