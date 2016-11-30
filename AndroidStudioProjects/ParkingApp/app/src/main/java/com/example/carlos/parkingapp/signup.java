package com.example.carlos.parkingapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


/**
 * Created by Carlos on 11/17/2016.
 */

public class signup extends AppCompatActivity {
    //To store userList obects
    UserList[] list = new UserList[100];
    int size = 0;

    EditText name;
    EditText email;
    EditText pwd1;
    EditText pwd2;

    String namestr;
    String emailstr;
    String pwd1str;
    String pwd2str;

    UserList user;


    @Override
     protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        Intent i = getIntent();

    }
    public void onSignUp2(View view){
        if(view.getId() == R.id.signup_button2){

            name = (EditText) findViewById(R.id.TFName);
            email = (EditText) findViewById(R.id.TFEmail);
            pwd1 = (EditText) findViewById(R.id.TFPwd1);
            pwd2 = (EditText) findViewById(R.id.TFPwd2);

            namestr = name.getText().toString();
            emailstr = email.getText().toString();
            pwd1str = pwd1.getText().toString();
            pwd2str = pwd2.getText().toString();

            user = new UserList();

            user.setName(namestr);
            user.setEmail(emailstr);
            user.setPwd(pwd1str);

            //check to see if user already exists
            for(int i = 0; i < size; i++){
                if(list[i].getEmail().equals(emailstr)){
                    Toast.makeText(this, "User Already Exists.", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }

            if(!pwd1str.equals(pwd2str)){
                Toast.makeText(this, "Passwords Do Not Match!", Toast.LENGTH_SHORT).show();

            }

            else{
            //ADD USER INFO TO DATABASE
                list[size] = user;

                Toast.makeText(this, "New Member Added!", Toast.LENGTH_SHORT).show();

                size++;
                finish();
            }
        }
    }

    public String getPass(String email){
        String str = null;

        for(int i = 0; i < size; i++){
            if(list[i].getEmail().equals(email)){
             str = list[i].getpwd();
                break;
            }
        }
        return "test";
    }
}
