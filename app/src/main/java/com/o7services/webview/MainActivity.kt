package com.o7services.webview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebViewClient
import androidx.core.view.get
import com.o7services.webview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //this will enable the javascript setting
        val webSettings:WebSettings =binding.webView.settings
        binding.webView.getSettings().setSupportMultipleWindows(true);
        webSettings.javaScriptEnabled= true

        binding.webView.webViewClient= WebViewClient()
        //this will load the url of the website
        binding.webView.loadUrl("https://www.google.com/search?q=version+of+android+studio&rlz=1C1CHBF_enIN994IN994&oq=version+of+android&gs_lcrp=EgZjaHJvbWUqBwgBEAAYgAQyCQgAEEUYORiABDIHCAEQABiABDIHCAIQABiABDIHCAMQABiABDIHCAQQABiABDIHCAUQABiABDIHCAYQABiABDIHCAcQABiABDIHCAgQABiABDINCAkQABiGAxiABBiKBdIBCTE5OTYxajBqN6gCALACAA&sourceid=chrome&ie=UTF-8" )

        //if you want to enable zoom feature
        binding.webView.settings.setSupportZoom(true)
    }
}