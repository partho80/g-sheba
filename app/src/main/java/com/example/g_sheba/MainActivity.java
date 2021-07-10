package com.example.g_sheba;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private EditText editTextSignInEmail , editTextSignInPassword;
    private Button buttonSignIN;
    private TextView textViewSignIn;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAuth = FirebaseAuth.getInstance();
        editTextSignInEmail = (EditText) findViewById(R.id.signInEmailID);
        editTextSignInPassword = (EditText) findViewById(R.id.signInPasswordID);
        buttonSignIN = (Button) findViewById(R.id.signInButtonId);
        textViewSignIn = (TextView) findViewById(R.id.signInTextId);
        textViewSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),G_ShebaSignUp.class);
                startActivity(intent);

            }
        });
        buttonSignIN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userLogin();


            }
        });
    }

    private void userLogin() {
        String email = editTextSignInEmail.getText().toString().trim();
        String password = editTextSignInPassword.getText().toString().trim();
        if (email.isEmpty())
        {
            editTextSignInEmail.setError("Enter_An_Email");
            editTextSignInEmail.requestFocus();
            return;
        }
        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches())
        {
            editTextSignInEmail.setError("Invalid_Email");
            editTextSignInEmail.requestFocus();
            return;
        }
        if (password.isEmpty())
        {
            editTextSignInPassword.setError("Enter_Password");
            editTextSignInPassword.requestFocus();
            return;
        }
        if(password.length()<6)
        {
            editTextSignInPassword.setError("Invalid_Password");
            editTextSignInPassword.requestFocus();
            return;
        }
        mAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful())
                {
                    Intent intent = new Intent(getApplicationContext(),HomePage.class);
                    startActivity(intent);
                    finish();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Invalid Email Or Password",Toast.LENGTH_SHORT).show();
                }

            }
        });


    }
}


