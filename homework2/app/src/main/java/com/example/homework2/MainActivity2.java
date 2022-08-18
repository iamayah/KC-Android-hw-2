package com.example.homework2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView nname = findViewById(R.id.namme);
        TextView aage = findViewById(R.id.agge);
        TextView jjob = findViewById(R.id.jjob);
        TextView pnbr = findViewById(R.id.phh);
        TextView eemail = findViewById(R.id.emmail);

        Bundle bundle = getIntent().getExtras();
        String name = bundle.getString("thename");
        nname.setText(name);

        String age = bundle.getString("theage");
        aage.setText(age);

        String job = bundle.getString("thejob");
        jjob.setText(job);

        String pn = bundle.getString("thenumber");
        pnbr.setText(pn);

        String email = bundle.getString("theemail");
        eemail.setText(email);

    }
}