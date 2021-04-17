package com.yash10019coder.videocalling;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;
import com.yash10019coder.videocalling.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    boolean signout=false;
    ActivityMainBinding activityMainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());
        activityMainBinding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Log.i("TAG", "onClick: "+FirebaseAuth.getInstance().getCurrentUser());

            }
        });
    }
}