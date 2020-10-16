package com.example.moduleissuetest.extensions

import android.app.Activity
import android.content.ActivityNotFoundException
import android.content.Intent
import android.util.Log
import android.widget.Toast
import androidx.core.net.toUri

fun Activity.openUrlLink(url: String) {
    val intent = Intent(Intent.ACTION_VIEW, url.toUri())
    return try {
        startActivity(intent)
    } catch (ex: ActivityNotFoundException) {
        Log.w("", "Could not start intent: ${intent.`package`}")
        ex.printStackTrace()
        Toast.makeText(this, "No application available to open link with", Toast.LENGTH_LONG)
            .show()
    }
}
