package com.ucucite.blockonemobdev;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class sign_up extends AppCompatActivity {

    private EditText etEmail, etPassword;
    private Button btnLogin, btnGoogle, btnFacebook;
    private TextView tvForgotPassword, tvSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        // Initialize Views
        etEmail = findViewById(R.id.editText_gmail);
        etPassword = findViewById(R.id.editText_password);
        btnLogin = findViewById(R.id.btn_log_in);
        btnGoogle.setBackgroundResource(R.drawable.ic_google;
        btnFacebook = findViewById(R.id.btn_log_fb);
        tvForgotPassword = findViewById(R.id.tv_frgt_password);
        tvSignUp = findViewById(R.id.btn_sign_up);

        // Login Button Click Event
        btnLogin.setOnClickListener(v -> {
            String email = etEmail.getText().toString().trim();
            String password = etPassword.getText().toString().trim();

            if (email.isEmpty() || password.isEmpty()) {
                Toast.makeText(sign_up.this, "Please enter email and password!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(sign_up.this, "Logging in...", Toast.LENGTH_SHORT).show();
                // Add authentication logic here
            }
        });

        // Google Login
        btnGoogle.setOnClickListener(v ->
                Toast.makeText(sign_up.this, "Google Login Clicked!", Toast.LENGTH_SHORT).show()
        );

        // Facebook Login
        btnFacebook.setOnClickListener(v ->
                Toast.makeText(sign_up.this, "Facebook Login Clicked!", Toast.LENGTH_SHORT).show()
        );

        // Forgot Password
        tvForgotPassword.setOnClickListener(v ->
                Toast.makeText(sign_up.this, "Forgot Password Clicked!", Toast.LENGTH_SHORT).show()
        );

        // Sign Up Navigation
        tvSignUp.setOnClickListener(v -> {
            Intent intent = new Intent(sign_up.this, SignUpActivity.class);
            startActivity(intent);
        });
    }
}
