package com.isetr.tp5app.ui.ajout

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.isetr.tp5app.databinding.FragmentAjoutBinding

class AjoutFragment : Fragment() {

    private var _binding: FragmentAjoutBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentAjoutBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textAjout
        textView.text = "Ajout d\'un Etudiant"

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}