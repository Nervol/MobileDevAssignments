package com.example.lab01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class UserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        ImageView UserIcon = (ImageView) findViewById(R.id.imageView);
        TextView WelcomeBox = (TextView) findViewById(R.id.welcome);
        String txtName = getIntent().getStringExtra("name");
        WelcomeBox.setText(WelcomeBox.getText().toString()+" "+txtName +"!");
        int intPic = getIntent().getIntExtra("pic",0);
        UserIcon.setImageResource(intPic);
    }
}
