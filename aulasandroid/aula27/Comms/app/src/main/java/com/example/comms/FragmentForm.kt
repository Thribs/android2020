package com.example.comms

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import com.google.android.material.textfield.TextInputLayout

class FragmentForm : Fragment() {

    private val nameLayout by lazy { view?.findViewById<TextInputLayout>(R.id.layout_form_name) }
    private val emailLayout by lazy { view?.findViewById<TextInputLayout>(R.id.layout_form_email) }
    private val phoneLayout by lazy { view?.findViewById<TextInputLayout>(R.id.layout_form_phone) }
    private val passLayout by lazy { view?.findViewById<TextInputLayout>(R.id.layout_password) }
    private val passCheckLayout by lazy { view?.findViewById<TextInputLayout>(R.id.layout_passwordCheck) }

    private val nameField by lazy { view?.findViewById<EditText>(R.id.tv_form_name) }
    private val emailField by lazy { view?.findViewById<EditText>(R.id.tv_form_email) }
    private val phoneField by lazy { view?.findViewById<EditText>(R.id.tv_form_phone) }
    private val passField by lazy { view?.findViewById<EditText>(R.id.tv_password) }
    private val passCheckField by lazy { view?.findViewById<EditText>(R.id.tv_passwordCheck) }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_form, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val button = view.findViewById<Button>(R.id.btn_submit)

        button.setOnClickListener {
            onFinishForm()
        }
    }

    private fun onFinishForm() {
        val userDataContract = requireActivity() as UserDataContract
        val formChek = false

        val name = nameField?.text.toString() ?: "Name"
        val email = emailField?.text.toString() ?: "Name"
        val phone = phoneField?.text.toString() ?: "Name"
        val password = passField?.text.toString()
        val passwordCheck = passCheckField?.text.toString()

        val reqError = "Campo não pode ser vazio"
        val matchError = "Senhas não conferem"

        nameLayout?.error = (if (name.isBlank()) reqError else null)
        emailLayout?.error = (if (email.isBlank()) reqError else null)
        phoneLayout?.error = (if (phone.isBlank()) reqError else null)
        passLayout?.error = (if (password.isBlank()) reqError else null)
        passCheckLayout?.error = (if (passwordCheck.isBlank()) reqError else null)



        passCheckLayout?.error = (if (password != passwordCheck || passwordCheck.isBlank()) matchError else null)

        if (
            nameLayout?.error == null &&
            emailLayout?.error == null &&
            phoneLayout?.error == null &&
            passLayout?.error == null &&
            passCheckLayout?.error == null) {
            userDataContract.finishForm(name, email, phone)
        }
        else userDataContract.finishForm()
    }
}