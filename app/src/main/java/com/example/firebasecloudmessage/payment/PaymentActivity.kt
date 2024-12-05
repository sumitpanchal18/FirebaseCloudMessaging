package com.example.firebasecloudmessage.payment

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.firebasecloudmessage.R
import org.json.JSONObject

class PaymentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)
       /* findViewById<Button>(R.id.payButton).setOnClickListener {
            startPayment()
        }

        Checkout.preload(applicationContext)
*/
    }

//    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
//        super.onActivityResult(requestCode, resultCode, data)
//
//        // This is where Razorpay returns the result of the payment
//        if (requestCode == Checkout.PAYMENT_REQUEST_CODE) {
//            try {
//                val response = data?.getStringExtra("response")
//                val jsonResponse = JSONObject(response)
//
//                val paymentId = jsonResponse.getString("razorpay_payment_id")
//                val orderId = jsonResponse.getString("razorpay_order_id")
//                val signature = jsonResponse.getString("razorpay_signature")
//
//                // You can verify the signature and payment with your backend server
//                Toast.makeText(this, "Payment Success: $paymentId", Toast.LENGTH_SHORT).show()
//
//            } catch (e: Exception) {
//                e.printStackTrace()
//                Toast.makeText(this, "Payment Failed: ${e.localizedMessage}", Toast.LENGTH_SHORT)
//                    .show()
//            }
//        }
//    }

//    private fun startPayment() {
//        val activity: Activity = this
//        val checkout = Checkout()
//
//        try {
//            // Create a payment order request
//            val options = JSONObject()
//            options.put("name", "Merchant Name")
//            options.put("description", "Test Payment")
//            options.put("image", "https://your-logo-url.com/logo.png") // Optional
//            options.put("currency", "INR") // Currency
//            options.put("amount", 50000) // Amount in paise (100.00 INR = 50000 paise)
//
//            // Add the Razorpay Test Key ID
//            options.put("key", "rzp_test_abc123")  // Your Razorpay Test Key ID
//
//            val preFill = JSONObject()
//            preFill.put("email", "testuser@example.com")
//            preFill.put("contact", "9876543210")
//            options.put("prefill", preFill)
//
//            checkout.open(activity, options)
//        } catch (e: Exception) {
//            e.printStackTrace()
//        }
//    }

}