package br.com.fiap.tutors.ui.components

import android.security.identity.AccessControlProfile
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.tutors.model.Tutor
import br.com.fiap.tutors.sampledata.SampleTutor

@Composable
fun TutorShowcase(
    navigateToProfile: (Tutor) -> Unit,
    title: String,
    tutors: List<Tutor> = remember { SampleTutor.sampleSuggestions }
) {
    Column() {
        Text(
            text = title,
            Modifier.padding(
                start = 16.dp,
                end = 16.dp
            ),
            fontSize = 20.sp,
            fontWeight = FontWeight.W400
        )
        LazyRow(
            contentPadding = PaddingValues(
                horizontal = 16.dp, vertical = 8.dp
            )
        ) {
            items(
                items = tutors,
                itemContent = {
                    TutorView(tutor = it, navigateToProfile)
                }
            )
        }
    }
}

//@Composable
//fun TutorShowcase(
//    title: String,
//    tutors: List<Tutor>
//) {
//    Column() {
//        Text(
//            text = title,
//            Modifier.padding(
//                start = 16.dp,
//                end = 16.dp
//            ),
//            fontSize = 20.sp,
//            fontWeight = FontWeight.W400
//        )
//        Row(
//            Modifier
//                .padding(
//                    top = 32.dp
//                )
//                .fillMaxWidth()
//                .horizontalScroll(rememberScrollState(0)),
//            horizontalArrangement = Arrangement.spacedBy(16.dp)
//        ) {
//            Spacer(Modifier)
//            for (t in tutors) {
//                TutorView(tutor = t)
//            }
//            Spacer(Modifier)
//        }
//    }
//}
//
//@Preview(showBackground = true)
//@Composable
//private fun TutorShowcaseView() {
//    TutorShowcase(title = "Tutors pra você! ♥", tutors = sampleSuggestions)
//}