package br.com.fiap.tutors

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import br.com.fiap.tutors.model.Tutor
import br.com.fiap.tutors.ui.screen.TutorProfileScreen

class TutorProfile : AppCompatActivity() {

    private val tutor: Tutor by lazy {
        intent?.getSerializableExtra(TUTOR_ID) as Tutor
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            TutorProfileScreen(tutor = tutor)
        }
    }

    companion object {
        private const val TUTOR_ID = "tutor_id"
        fun newIntent(context: Context, tutor: Tutor) =
            Intent(context, TutorProfile::class.java).apply {
                putExtra(TUTOR_ID, tutor)
            }
    }

}