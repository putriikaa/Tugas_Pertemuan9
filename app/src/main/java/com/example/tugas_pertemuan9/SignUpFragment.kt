package com.example.tugas_pertemuan9

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.tugas_pertemuan9.databinding.FragmentSignUpBinding

class SignUpFragment : Fragment() {

    private lateinit var binding: FragmentSignUpBinding
    private val TAG = "SignUpFragment"

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSignUpBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonRegister.setOnClickListener {
            val firstName = binding.firstnameEditText.text.toString()
            val lastName = binding.lastnameEditText.text.toString()
            val intent = Intent(requireActivity(), ResultRegister::class.java)
                .putExtra(EXTRA_FIRST_NAME, firstName)
                .putExtra(EXTRA_LAST_NAME, lastName)
            startActivity(intent)
        }
    }

    companion object {
        const val EXTRA_FIRST_NAME = "extra_first_name"
        const val EXTRA_LAST_NAME = "extra_last_name"
    }


}