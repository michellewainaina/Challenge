package com.example.challenge;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onRegisterbtnClick(View view){
        TextView txtFirstName=findViewById(R.id.txtFirstName);
        TextView txtSecondName=findViewById(R.id.txtSecondName);
        TextView txtEmail=findViewById(R.id.txtEmail);

        EditText edittxtFirstName=findViewById(R.id.edittxtFirstName);
        EditText edittxtSecondName=findViewById(R.id.edittxtSecondName);
        EditText edittxtEmail=findViewById(R.id.edittxtEmail);

        txtFirstName.setText("First Name:"+edittxtFirstName.getText().toString());
        txtSecondName.setText("Second Name:"+edittxtSecondName.getText().toString());
        txtEmail.setText("Email:"+edittxtEmail.getText().toString());


    }
}