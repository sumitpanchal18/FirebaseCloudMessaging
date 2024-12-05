package com.example.firebasecloudmessage

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.firestore.FirebaseFirestore

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Example: Save user preferences when the activity is created
        val userPreferences = mapOf(
            "promotions" to true,
            "updates" to false
        )

        // Save preferences to Firestore
        saveUserPreferences("user123", userPreferences)
    }

    // Function to save user preferences to Firestore
    private fun saveUserPreferences(userId: String, preferences: Map<String, Boolean>) {
        val db = FirebaseFirestore.getInstance()
        val userRef = db.collection("users").document(userId)

        // Save the preferences in the "users" collection
        userRef.set(mapOf("notifications" to preferences))
            .addOnSuccessListener {
                // Successfully saved preferences
                println("Preferences saved successfully")
            }
            .addOnFailureListener { e ->
                // Handle errors
                println("Error saving preferences: $e")
            }
    }
}
