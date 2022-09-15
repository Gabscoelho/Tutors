package br.com.fiap.tutors.sampledata

import br.com.fiap.tutors.R
import br.com.fiap.tutors.model.Tutor

object SampleTutor {

    val sampleSuggestions = listOf(
        Tutor(
            id = 1,
            name = "André Luiz",
            specialty = "Game Design",
            tutorImagemId = R.drawable.t1
        ),
        Tutor(
            id = 2,
            name = "Maria de Fátima",
            specialty = "Ciência de Dados",
            tutorImagemId = R.drawable.t2

        ),
        Tutor(
            id = 3,
            name = "José Envangelista",
            specialty = "Teologia",
            tutorImagemId = R.drawable.t3
        ),
        Tutor(
            id = 4,
            name = "Maria Bethânia",
            specialty = "Engenheira de Dados",
            tutorImagemId = R.drawable.t4
        )
    )

    val sampleAttended = listOf(
        Tutor(
            id = 5,
            name = "Johny Santos",
            specialty = "Analista de Sistemas",
            tutorImagemId = R.drawable.t5
        ),
        Tutor(
            id = 6,
            name = "Marta Saulo",
            specialty = "iOS Developer",
            tutorImagemId = R.drawable.t6
        ),
        Tutor(
            id = 7,
            name = "Manuel Otávio",
            specialty = "Encanador",
            tutorImagemId = R.drawable.t7
        ),
        Tutor(
            id = 8,
            name = "Renato Russo",
            specialty = "Hacker Freelancer",
            tutorImagemId = R.drawable.t8

        )
    )

}