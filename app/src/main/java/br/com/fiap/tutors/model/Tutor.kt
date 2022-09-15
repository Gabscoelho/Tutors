package br.com.fiap.tutors.model

import androidx.annotation.DrawableRes
import java.io.Serializable

class Tutor(
    val id: Int,
    val name: String,
    val specialty: String,
    val tutorImagemId: Int = 0
//    @DrawableRes val image: Int,
) : Serializable