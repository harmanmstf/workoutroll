package com.example.rollworkout.ui.workouthelp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.navigation.fragment.navArgs
import com.example.rollworkout.databinding.FragmentHelpBinding



class HelpFragment : Fragment() {

    private val args: HelpFragmentArgs by navArgs()

    private var _binding: FragmentHelpBinding? = null
    // This property is only valid between onCreateView and
// onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentHelpBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val webView: WebView = binding.webViewHelp

        webView.webViewClient = WebViewClient()
        webView.loadUrl("https://www.google.com/search?q=" + args.searchUrl)



        }
    }

