package com.juaracoding.halodos;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;

public class SearchActivity extends AppCompatActivity {
ImageButton btnDetailDos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        Toolbar toolbar = findViewById(R.id.toolbarSearch);
        setSupportActionBar(toolbar);
        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);

        btnDetailDos = findViewById(R.id.btnDetailDos);

        btnDetailDos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kedetail = new Intent(SearchActivity.this,DetailDosenActivity.class);
                startActivity(kedetail);
            }
        });

    }
}