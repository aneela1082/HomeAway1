package com.example.newproject;


import android.os.Bundle;
import android.content.Intent;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import org.jetbrains.annotations.NotNull;

public class MainActivity extends AppCompatActivity {

    private TextView chooseOne;
    Button Landlord , Tenant;

    TextView textView;
    FirebaseUser user;

    //Logout button
    private FirebaseAuth mAuth;
    private Button btnLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initialising all views through id defined above
        chooseOne = findViewById(R.id.gfg);
        Landlord = findViewById(R.id.buttonLandlord);
        Tenant = findViewById(R.id.buttonTenant);
        chooseOne.setText("Choose one");

        mAuth = FirebaseAuth.getInstance();
        btnLogout = findViewById(R.id.logout);
        textView = findViewById(R.id.user_details);
        user = mAuth.getCurrentUser();
        if(user != null){
            textView.setText("User: "+ user.getEmail());
        }
        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mAuth.signOut();
                Intent intent = new Intent(MainActivity.this,Dashboard.class);
                startActivity(intent);
                finish();
                Toast.makeText(MainActivity.this,"Logout Successful",Toast.LENGTH_SHORT).show();
            }
        });

        Landlord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,
                        LandlordActivity.class);
                startActivity(intent);
            }
        });

        Tenant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,
                        RecyclerView.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
    }
}
