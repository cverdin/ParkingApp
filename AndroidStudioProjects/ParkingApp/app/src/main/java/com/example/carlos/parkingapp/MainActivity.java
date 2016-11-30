package com.example.carlos.parkingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    signup helper = new signup();
    String email;
    String pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void OnLoginClick(View view) {

        EditText a = (EditText) findViewById(R.id.email_Main);
        email = a.getText().toString();

        EditText b = (EditText) findViewById(R.id.PasswordMain);
        pass = b.getText().toString();


        if (view.getId() == R.id.login_button){

            String password = helper.getPass(email);


            if (pass.equals(password)){

                Intent intent = new Intent(this, Location_Options.class);

                startActivity(intent);

            }
            else {
                Toast.makeText(this, "Incorrect Login Information", Toast.LENGTH_SHORT).show();
            }
        }
    }
    public void OnSignupClick(View view){
    if(view.getId() == R.id.signup_button1) {

        Intent intent = new Intent(MainActivity.this, signup.class);

        startActivityForResult(intent, 0);

       }
    }
}
