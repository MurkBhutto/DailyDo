package com.example.dailydo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WelcomeScreen extends AppCompatActivity {


        Button login;
        Button signup;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            login = (Button) findViewById(R.id.toSettings);
            signup = (Button) findViewById(R.id.toPersonalInfo);


            login.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent settingsIntent = new Intent(WelcomeScreen.this , LoginActivity.class);
                    startActivity(settingsIntent);

                }
            });


            signup.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent persinfoIntent = new Intent(WelcomeScreen.this, RegisterActivity.class);
                    startActivity(persinfoIntent);

                }
            });
        }
    }

