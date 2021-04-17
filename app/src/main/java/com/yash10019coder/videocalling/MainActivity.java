package com.yash10019coder.videocalling;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.yash10019coder.videocalling.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    boolean signout=false;
    ActivityMainBinding activityMainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());
    }
}