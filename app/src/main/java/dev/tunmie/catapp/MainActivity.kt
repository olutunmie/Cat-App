package dev.tunmie.catapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.tunmie.catapp.ui.theme.CatAppTheme

class MainActivity : ComponentActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContent {
			CatAppTheme {
				// A surface container using the 'background' color from the theme
				Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
					Greeting("Android")
				}
			}
		}
	}
}

@Composable
fun Greeting(name: String) {
	Text(text = "Hello $name!")
}

@Composable
fun CatPreview() {

	Card(
		shape = RoundedCornerShape(14.dp),
		backgroundColor = Color.White,
		modifier = Modifier
			.padding(10.dp)
			.height(150.dp)
			.width(150.dp)
	) {
		Column(
			modifier = Modifier
				.fillMaxSize()
				.padding(0.dp)
		) {

			Image(
				painter = painterResource(id = R.drawable.image),
				contentDescription = null,
				modifier = Modifier.fillMaxSize(),
				alignment = Alignment.Center,
				contentScale = ContentScale.Fit
			)
		}
//		Row {
//			Text(text = "Abysinnia", style = TextStyle(color = Color.Gray, fontSize = 16.sp))
//			Icon(imageVector = Icons.Default.Favorite, contentDescription = null)
//		}
	}
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
	CatAppTheme {
		CatPreview()
	}
}