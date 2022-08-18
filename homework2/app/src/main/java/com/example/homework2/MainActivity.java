package com.example.homework2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText name = findViewById(R.id.namee);
        EditText age = findViewById(R.id.agee);
        EditText urjob = findViewById(R.id.yj);
        EditText phonen = findViewById(R.id.ph);
        EditText email = findViewById(R.id.email);
        Button next = findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String n = name.getText().toString();
                String a = age.getText().toString();
                String u = urjob.getText().toString();
                String p = phonen.getText().toString();
                String e = email.getText().toString();

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("thename", n );
                intent.putExtra("theage", a );
                intent.putExtra("thejob", u );
                intent.putExtra("thenumber", p );
                intent.putExtra("theemail", e );
                startActivity(intent);
            }
        });

    }
}