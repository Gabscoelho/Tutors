package br.com.fiap.tutors.ui.screen

import android.content.Intent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.material.Text
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.BottomCenter
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Alignment.Companion.TopCenter
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.tutors.model.Tutor
import br.com.fiap.tutors.ui.theme.*

@Composable
fun TutorProfileScreen(tutor: Tutor) {
    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        // TODO:
        TutorProfileHeader(tutor = tutor)
        // CONTENT
    }
}

@Composable
private fun TutorProfileHeader(
    tutor: Tutor
) {
    val padding = 16.dp
    BoxWithConstraints {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState(0))
        ) {
            val imagePerfilSize = 185.dp
            Box(
                modifier = Modifier
                    .height(imagePerfilSize)
                    .background(color = AzulSecundario)
                    .fillMaxSize()
            ) {
                Spacer(Modifier.size(padding))
                Image(
                    painter = painterResource(id = tutor.tutorImagemId),
                    contentDescription = "Foto de perfil do Tutor.",
                    Modifier
                        .size(imagePerfilSize)
                        .offset(y = 90.dp)
                        .clip(shape = CircleShape)
                        .border(6.dp,Color(0xFFFFFFFF), CircleShape)
                        .align(BottomCenter),
                    contentScale = ContentScale.Crop
                )
            }
            Spacer(modifier = Modifier.height(imagePerfilSize / 2))
            Column() {
                Text(
                    text = tutor.name,
                    fontSize = 30.sp,
                    fontWeight = FontWeight.W600,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    modifier = Modifier
                        .align(CenterHorizontally)
                )
                Text(
                    text = tutor.specialty,
                    fontSize = 22.sp,
                    fontWeight = FontWeight.W400,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    modifier = Modifier
                        .align(CenterHorizontally)
                )
                Card(
                    Modifier
                        .padding(padding)
                        .fillMaxHeight(),
                    shape = RoundedCornerShape(8.dp),
                    backgroundColor = Color(0xFFF6F6F6),
                    elevation = 2.dp
                ) {
                    Text(
                        modifier = Modifier
                            .padding(16.dp),
                        text = LoremIpsum(75).values.first(),
                        fontSize = 18.sp,
                        fontWeight = FontWeight.W200,
                        overflow = TextOverflow.Ellipsis
                    )
                }
                Button(
                    onClick = {
//                    val navigate = Intent(this@TutorProfileScreen, MainActivity::class.java)
//                    startActivity(navigate)
                    },
                    Modifier
                        .padding(start = 16.dp, end = 16.dp, bottom = 16.dp)
                        .fillMaxWidth()
                        .height(50.dp),
                    shape = RoundedCornerShape(100.dp),
                ) {
                    Text(
                        text = "Quero uma tutoria!", fontSize = 16.sp,
                        fontWeight = FontWeight.W600
                    )
                }
            }
        }
    }
}