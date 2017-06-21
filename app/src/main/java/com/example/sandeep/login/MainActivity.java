package com.example.sandeep.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    void login(View V){
        EditText usernameET = (EditText) findViewById(R.id.username);
        EditText passwordEt = (EditText) findViewById(R.id.password);
        String username = usernameET.getText().toString();
        String password = passwordEt.getText().toString();
        if(username.equals("sandeep") && password.equals("gupta")){
            Intent loginIntent = new Intent(this,Logedin.class);
            startActivity(loginIntent);
        }
    }
}
