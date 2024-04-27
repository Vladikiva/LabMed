package com.ensias.healthcareapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainZastavka extends AppCompatActivity {

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zastavka);

        mAuth = FirebaseAuth.getInstance();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Проверка текущего пользователя
                FirebaseUser currentUser = mAuth.getCurrentUser();
                if (currentUser != null) {
                    // Если пользователь вошел, перенаправление на NavigationActivity
                    Intent intent = new Intent(MainZastavka.this, SignInClient.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(intent);
                } else {
                    // Если пользователь не вошел, перенаправление на экран входа (например, LoginActivity)
                    Intent intent = new Intent(MainZastavka.this, NavigationActivity.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(intent);
                }
            }
        }, 3000);
    }
}