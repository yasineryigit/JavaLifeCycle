package com.ossovita.myactivitycycle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    TextView textView;
    String nameInput;
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG,"onCreate çalıştı");

        editText = findViewById(R.id.editTextTextPersonName);
        textView = findViewById(R.id.textView);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"onStart çalıştı");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"onResume çalıştı");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"onPause çalıştı");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"onStop çalıştı");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"onDestroy çalıştı");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d(TAG,"onSaveInstanceState çalıştı");
        outState.putString("saved",textView.getText().toString());

    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d(TAG,"onRestoreInstanceState");
        String savedString = savedInstanceState.getString("saved");
        textView.setText(savedString);

    }

    public void getName(View v){
        nameInput = editText.getText().toString();
        textView.setText(nameInput);
    }

    public void toSecond(View v){
        startActivity(new Intent(this,MainActivity2.class));
        finish();
    }


}