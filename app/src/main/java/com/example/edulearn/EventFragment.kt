package com.example.edulearn

import android.app.AlertDialog
import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.widget.Button
import android.widget.Toast
import com.example.edulearn.databinding.FragmentEventBinding

class EventFragment : Fragment() {
    private var _binding: FragmentEventBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentEventBinding.inflate(inflater, container, false)

        binding.btnShowAlertDialog.setOnClickListener {

            val dialogBuilder = AlertDialog.Builder(requireContext())

            dialogBuilder.setTitle("Alert Dialog")
            dialogBuilder.setMessage("Alert Dialog is a window that pops up on the screen")

            dialogBuilder.setPositiveButton("Ok") { _, _ ->
                Toast.makeText(requireContext(), "User clicked Ok!", Toast.LENGTH_SHORT).show()
            }

            dialogBuilder.setNegativeButton("No") { _, _ ->
                Toast.makeText(requireContext(), "User clicked No!", Toast.LENGTH_SHORT).show()
            }

            dialogBuilder.setNeutralButton("Maybe") { _, _ ->
                Toast.makeText(requireContext(), "User clicked Maybe!", Toast.LENGTH_SHORT).show()
            }

            dialogBuilder.show()
        }

        binding.btnShowCustomDialog.setOnClickListener {
            val dialog = Dialog(requireContext())
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
            dialog.setCancelable(false)
            dialog.setContentView(R.layout.custom_dialog_layout)
            dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

            val btnLogin = dialog.findViewById<Button>(R.id.btn_login)

            btnLogin.setOnClickListener {
                Toast.makeText(requireContext(), "User Loged In!", Toast.LENGTH_SHORT).show()
                dialog.dismiss()

            }

            dialog.show()
        }

        return binding.root
    }
}