package com.example.lab01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = (Button) findViewById(R.id.button);
        final EditText editTextUsername = (EditText) findViewById(R.id.editUser);
        final EditText editTextPassword = (EditText) findViewById(R.id.editPass);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ArrayList<User> usersArray = createUsers();
                System.out.println("Button pressed!");
                boolean f = false;
                for (int i = 0; i < usersArray.size(); i++) {
                    System.out.println(usersArray.get(i).getLogin());
                    if (editTextUsername.getText().toString().equals(usersArray.get(i).getLogin()) &&
                            editTextPassword.getText().toString().equals(usersArray.get(i).getPassword())) {
                        f = true;
                        Intent intent = new Intent("android.intent.action.UserActivity");
                        intent.putExtra("name", editTextUsername.getText().toString());
                        intent.putExtra("pic",usersArray.get(i).getPicture());
                        startActivity(intent);
                    }
                }
                if(!f){
                    Toast.makeText(getApplicationContext(), "Wrong entering login or password!", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
private ArrayList<User> createUsers(){
    ArrayList<User> users = new ArrayList<>();
    users.add(new User("Billy","123", R.mipmap.pic1_round));
    users.add(new User("Mike","520",R.mipmap.pic2_round));
    users.add(new User("Richard","404",R.mipmap.pic3_round));
    users.add(new User("Stiven","serserser123",R.mipmap.pic4_round));
    users.add(new User("Rayan","420",R.mipmap.pic5_round));
    return users;
    }
}