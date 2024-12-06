package com.example.firebasecloudmessage.crashlytics

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.firebasecloudmessage.databinding.ActivityFireBaseCrashlyticsBinding
import com.google.firebase.crashlytics.FirebaseCrashlytics

class FireBaseCrashlytics : AppCompatActivity() {

    private lateinit var binding: ActivityFireBaseCrashlyticsBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFireBaseCrashlyticsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Button to trigger a test crash
        binding.btnTestCrash.setOnClickListener {
            FirebaseCrashlytics.getInstance().log("Test crash button clicked")
            throw RuntimeException("Test Crash for Firebase Crashlytics")
        }

        // Button to log a non-fatal exception
        binding.btnLogException.setOnClickListener {
            try {
                val result = 10 / 0
                print(result)
            } catch (e: Exception) {
                FirebaseCrashlytics.getInstance().recordException(e)
                print("Non-fatal exception recorded")
                binding.tvLog.text = "Non-fatal exception recorded"
            }
        }
    }
}
