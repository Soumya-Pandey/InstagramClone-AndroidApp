package com.example.instagramclone;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.instagramclone.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        init();
    }

    private void init(){
        binding.loginn.setOnClickListener(v -> {
            if((binding.username.getText().toString().equals("user")) & binding.password.getText().toString().equals("user")){
                Toast.makeText(MainActivity.this, "successful", Toast.LENGTH_SHORT).show();
            }

            else {
                Toast.makeText(MainActivity.this, "enter details", Toast.LENGTH_SHORT).show();
            }
        });
    }


}