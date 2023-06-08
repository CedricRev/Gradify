package com.github.ltkicker.gradify.activities.navigation;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.github.ltkicker.gradify.R;

public class LogoutActivity extends AppCompatActivity {

    public TextView button_text;
    public ImageButton button;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logout);

        button = (ImageButton) findViewById(R.id.back);
        button_text = (TextView) findViewById(R.id.Myclasses);
        button_text = (TextView) findViewById(R.id.txtleaderboards_string);
        button_text = (TextView) findViewById(R.id.viewprofile);
        button_text = (TextView) findViewById(R.id.notifications);
        button_text = (TextView) findViewById(R.id.messages);
        button_text = (TextView) findViewById(R.id.settings);
        button_text = (TextView) findViewById(R.id.help);
        button_text = (TextView) findViewById(R.id.aboutUs);
        button_text = (TextView) findViewById(R.id.logout);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LogoutActivity.this, MenuActivity.class);
                startActivity(intent);
            }
        });
        button_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(logOut.this,);
            }
        });
    }
}