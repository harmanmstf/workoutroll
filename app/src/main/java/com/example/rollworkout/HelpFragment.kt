package com.example.rollworkout

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.navArgs
import com.example.rollworkout.databinding.FragmentHelpBinding
import com.example.rollworkout.databinding.FragmentWorkoutRollBinding


class HelpFragment : Fragment() {

    val args: HelpFragmentArgs by navArgs()

    private var _binding: FragmentHelpBinding? = null
    // This property is only valid between onCreateView and
// onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        _binding = FragmentHelpBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val webView: WebView = binding.webViewHelp

       // webView.webChromeClient = WebChromeClient()
        webView.loadUrl("https://www.google.com/search?q=" + args.searchUrl)



        }
    }

