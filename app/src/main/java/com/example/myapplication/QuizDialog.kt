package com.example.myapplication
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.fragment.app.DialogFragment

class QuizDialog : DialogFragment(R.layout.dialog_quiz) {

    private lateinit var textView: TextView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        textView = view.findViewById(R.id.result)
        val radioGroup = view.findViewById<RadioGroup>(R.id.answer_group)
        val submit: Button = view.findViewById(R.id.submit_button)
        val cancel:Button=view.findViewById(R.id.cancel)
        cancel.setOnClickListener{
            dismiss()
        }

        submit.setOnClickListener {
            val selectedOption: Int = radioGroup.checkedRadioButtonId

            if (selectedOption != -1) {
                val radioGroup1 = view.findViewById<RadioButton>(selectedOption)
                quiz(radioGroup1)
            } else {
                // Display a message, Snackbar or Toast to inform the user to select an option
            }
        }
    }

    private fun quiz(answer: RadioButton) {
        // Assuming the correct answer is marked with a specific tag in the XML layout
        val isCorrect = answer.tag == "correct"
        textView.text = if (isCorrect) "correct" else "incorrect"
    }
}
