package id.zaxx.diceroller

import android.os.Bundle
import android.widget.ImageView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import id.zaxx.diceroller.ui.theme.DiceRollerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DiceRollerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    DiceRollerApp()

                }
            }
        }
    }
}


@Composable
fun DiceWithButtonAndImage(
    modifer: Modifier = Modifier
        .fillMaxSize()
        .wrapContentSize(Alignment.Center)
){
    val Image = painterResource(id = R.drawable.dice_1)
    Column(
        modifer, horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painter = Image, contentDescription =null )
        Text(text = stringResource(id = R.string.unit_test))
    }
}

@Preview (showBackground = true)
@Composable
fun DiceRollerApp(modifer: Modifier = Modifier){
    DiceWithButtonAndImage()
}