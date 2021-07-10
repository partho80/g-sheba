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

public class G_ShebaSignUp extends AppCompatActivity {
    private EditText editTextSignUpEmail, editTextSignUpPassword;
    private Button buttonSignUp;
    private TextView textViewSignUp;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_g__sheba_sign_up);
        mAuth = FirebaseAuth.getInstance();
        editTextSignUpEmail = (EditText) findViewById(R.id.signUpnEmailID);
        editTextSignUpPassword = (EditText) findViewById(R.id.signUpPasswordID);
        buttonSignUp = (Button) findViewById(R.id.signUpButtonId);
        textViewSignUp = (TextView) findViewById(R.id.signUpTextId);
        textViewSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
        buttonSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userRegister();

            }
        });


    }

    private void userRegister() {
        String email = editTextSignUpEmail.getText().toString().trim();
        String password = editTextSignUpPassword.getText().toString().trim();
        if (email.isEmpty())
        {
            editTextSignUpEmail.setError("Enter_A_Email_Id");
            editTextSignUpEmail.requestFocus();
            return;


        }
        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches())
        {
            editTextSignUpEmail.setError("Invalid_Email");
            editTextSignUpEmail.requestFocus();
            return;

        }
        if (password.isEmpty())
        {
            editTextSignUpPassword.setError("Enter_Password");
            editTextSignUpPassword.requestFocus();
            return;


        }
        if (password.length()<6)
        {
            editTextSignUpPassword.setError("Invalid_Password");
            editTextSignUpPassword.requestFocus();
            return;


        }
        mAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful())
                {
                    Toast.makeText(getApplicationContext(),"Successfully SignUp",Toast.LENGTH_SHORT).show();
                }
                else
                {

                    Toast.makeText(getApplicationContext(),"Error in SignUp",Toast.LENGTH_SHORT).show();

                }

            }
        });

    }

}