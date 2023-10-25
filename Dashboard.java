package com.example.newproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Dashboard extends AppCompatActivity {


    Button btn_rentReminder,btn_location,btn_login,btn_signup;
    ImageView rentReminderImage, mapViewImage, loginImage, signUpImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        btn_rentReminder=findViewById(R.id.buttonRentReminder);
        btn_location=findViewById(R.id.buttonSearchLocation);
        btn_login=findViewById(R.id.buttonLogin);
        btn_signup=findViewById(R.id.buttonSignUp);

        rentReminderImage=findViewById(R.id.rentReminderImage);
        mapViewImage = findViewById(R.id.mapViewImage);
        loginImage=findViewById(R.id.loginImage);
        signUpImage=findViewById(R.id.signUpImage);

        btn_rentReminder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),RentReminder.class);
                startActivity(intent);
            }
        });

        btn_location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MapsActivity.class);
                startActivity(intent);
            }
        });

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),LoginActivity.class);
                startActivity(intent);
            }
        });

        btn_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),RegistrationActivity.class);
                startActivity(intent);
            }
        });





    }
}