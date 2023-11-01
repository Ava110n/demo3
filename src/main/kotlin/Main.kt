import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application


@Composable
@Preview
fun App() {
    var text by remember {mutableStateOf("")}
    var result by remember {mutableStateOf("")}
    Row {
        Column(modifier = Modifier.fillMaxHeight().weight(3F), verticalArrangement = Arrangement.SpaceBetween) {
            Column {
                Text(result, color = Color.Red, fontSize = 45.sp)
                Text(text, color = Color.Red, fontSize = 45.sp)
            }
            Column(modifier = Modifier.fillMaxWidth()) {
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceAround) {
                    Button(
                        onClick = { result = onClick('7'); text = x; },
                        modifier = Modifier.weight(1f).padding(10.dp)
                    ) {
                        Text("7")
                    }
                    Button(
                        onClick = { result = onClick('8'); text = x; },
                        modifier = Modifier.weight(1f).padding(10.dp)
                    ) {
                        Text("8")
                    }
                    Button(
                        onClick = { result = onClick('9'); text = x; },
                        modifier = Modifier.weight(1f).padding(10.dp)
                    ) {
                        Text("9")
                    }
                    Button(
                        onClick = { result = onClick('*'); text = x; },
                        modifier = Modifier.weight(1f).padding(10.dp)
                    ) {
                        Text("*")
                    }
                }
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceAround) {
                    Button(
                        onClick = { result = onClick('4'); text = x; },
                        modifier = Modifier.weight(1f).padding(10.dp)
                    ) {
                        Text("4")
                    }
                    Button(
                        onClick = { result = onClick('5'); text = x; },
                        modifier = Modifier.weight(1f).padding(10.dp)
                    ) {
                        Text("5")
                    }
                    Button(
                        onClick = { result = onClick('6'); text = x; },
                        modifier = Modifier.weight(1f).padding(10.dp)
                    ) {
                        Text("6")
                    }
                    Button(
                        onClick = { result = onClick('/'); text = x; },
                        modifier = Modifier.weight(1f).padding(10.dp)
                    ) {
                        Text("/")
                    }
                }
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceAround) {
                    Button(
                        onClick = { result = onClick('1'); text = x; },
                        modifier = Modifier.weight(1f).padding(10.dp)
                    ) {
                        Text("1")
                    }
                    Button(
                        onClick = { result = onClick('2'); text = x; },
                        modifier = Modifier.weight(1f).padding(10.dp)
                    ) {
                        Text("2")
                    }
                    Button(
                        onClick = { result = onClick('3'); text = x; },
                        modifier = Modifier.weight(1f).padding(10.dp)
                    ) {
                        Text("3")
                    }
                    Button(
                        onClick = { result = onClick('+'); text = x; },
                        modifier = Modifier.weight(1f).padding(10.dp)
                    ) {
                        Text("+")
                    }
                }
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceAround) {
                    Button(
                        onClick = { result = onClick('.'); text = x; },
                        modifier = Modifier.weight(1f).padding(10.dp)
                    ) {
                        Text(".")
                    }
                    Button(
                        onClick = { result = onClick('7'); text = x; },
                        modifier = Modifier.weight(1f).padding(10.dp)
                    ) {
                        Text("0")
                    }
                    Button(
                        onClick = { result = onClick('='); text = x; },
                        modifier = Modifier.weight(1f).padding(10.dp)
                    ) {
                        Text("=")
                    }
                    Button(
                        onClick = { result = onClick('-'); text = x },
                        modifier = Modifier.weight(1f).padding(10.dp)
                    ) {
                        Text("-")
                    }
                }
            }
        }
        Column(modifier = Modifier.fillMaxHeight().weight(1F)){
            Column(modifier = Modifier.fillMaxWidth().weight(1f)){

                //Canvas(modifier = ){}



            }
            Column(modifier = Modifier.fillMaxWidth().weight(1f).background(Color.Red)){

            }
        }
    }
}


fun onClick(c: Char):String{
    var result = ""
    if(symbol==null) {
        result = "$first"
    }
    try{
        c.toString().toDouble()
    }
    catch(e: Exception) {
        calculator(c)
    }
    if(symbol!=null) {
        result = "$first$symbol"
    }
    return result
}

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        App()
    }
}
