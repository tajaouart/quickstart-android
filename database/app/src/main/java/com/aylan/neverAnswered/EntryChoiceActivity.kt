package com.google.firebase.quickstart.neverAnswered

import android.content.Intent
import com.firebase.example.internal.BaseEntryChoiceActivity
import com.firebase.example.internal.Choice

class EntryChoiceActivity : BaseEntryChoiceActivity() {

    override fun getChoices(): List<Choice> {
        return listOf(
                Choice(
                        "Java",
                        "Run the Firebase Realtime Database quickstart written in Java.",
                        Intent(this, com.aylan.neverAnswered.java.SignInActivity::class.java))

        )
    }
}
