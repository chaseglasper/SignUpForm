package edu.temple.signupform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


import static edu.temple.signupform.R.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);


        TextView name = (TextView) findViewById(R.id.nameText);
        TextView email = (TextView) findViewById(R.id.emailText);
        TextView pwText = (TextView) findViewById(R.id.emailText);

        findViewById(id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView empty = checkEmpty(name);
            }
        });



    }
}
