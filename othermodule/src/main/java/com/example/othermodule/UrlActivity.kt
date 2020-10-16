package com.example.othermodule

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.navArgs
import com.example.moduleissuetest.extensions.openUrlLink

class UrlActivity : AppCompatActivity() {
    private val args by navArgs<UrlActivityArgs>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(android.R.style.Theme_NoDisplay)

        openUrlLink(resources.getString(args.url))
        finish()
    }
}