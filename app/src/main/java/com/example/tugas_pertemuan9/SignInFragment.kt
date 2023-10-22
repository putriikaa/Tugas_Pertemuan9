package com.example.tugas_pertemuan9

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.tugas_pertemuan9.databinding.FragmentSignInBinding

class SignInFragment : Fragment() {

    private lateinit var binding: FragmentSignInBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSignInBinding.inflate(inflater, container, false)

        binding.loginButton.setOnClickListener {
            val enteredUsername = binding.username.text.toString()
            val enteredPassword = binding.password.text.toString()

            if (enteredUsername == "nanda" && enteredPassword == "492615") {
                val intentRegister = Intent(requireActivity(), ResultLogin::class.java)
                intentRegister.putExtra(EXTRA_USERNAME, enteredUsername)
                startActivity(intentRegister)
            } else {
                val toastMessage = "Username atau password salah"
                Toast.makeText(requireContext(), toastMessage, Toast.LENGTH_SHORT).show()
            }

        }

        return binding.root
    }

    companion object {
        const val EXTRA_USERNAME = "extra_username"
    }
}
