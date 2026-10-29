package com.isetr.tp5app.ui.liste

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.isetr.tp5app.databinding.FragmentListeBinding

class ListeFragment : Fragment() {

    private var _binding: FragmentListeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentListeBinding.inflate(inflater, container, false)
        val root: View = binding.root
        val textView: TextView = binding.textListe
        textView.text = "Liste des Etudiants"
         return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}