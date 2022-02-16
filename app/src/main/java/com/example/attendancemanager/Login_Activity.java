package com.example.attendancemanager;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Login_Activity extends AppCompatActivity {

    private EditText entered_Username;
    private EditText entered_Password;
    private Button login;
    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        entered_Username = findViewById(R.id.username);
        entered_Password = findViewById(R.id.password);
        login = findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String username = entered_Username.toString();
                String password = entered_Password.toString();

                if (password.length() < 6) {
                    Toast.makeText(Login_Activity.this, "Password Length is Too Short", Toast.LENGTH_SHORT).show();
                } else
                    auth.signInWithEmailAndPassword(username,password).addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                        @Override
                        public void onSuccess(AuthResult authResult) {
                            Toast.makeText(Login_Activity.this, "Login Successful", Toast.LENGTH_SHORT).show();
                        }
                    });
            }
        });
    }

}