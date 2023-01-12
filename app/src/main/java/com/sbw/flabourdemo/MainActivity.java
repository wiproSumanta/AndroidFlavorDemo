package com.sbw.flabourdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView nameTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameTextView = findViewById(R.id.name_text_view);
    }

    @Override
    protected void onStart() {
        super.onStart();
        nameTextView.setText(BuildConfig.FLAVOR);

        if(!BuildConfig.FLAVOR.startsWith("amazonPreload")) {
            Toast.makeText(this, BuildConfig.FLAVOR, Toast.LENGTH_LONG).show();
        }
    }
}