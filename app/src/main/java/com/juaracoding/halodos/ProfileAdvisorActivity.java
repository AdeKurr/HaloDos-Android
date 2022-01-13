package com.juaracoding.halodos;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import in.mayanknagwanshi.imagepicker.ImageSelectActivity;

public class ProfileAdvisorActivity extends AppCompatActivity {
    Button btnEditProfileAdv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_advisor);
        // my_child_toolbar is defined in the layout file
        Toolbar toolbar =
                (Toolbar) findViewById(R.id.toolbaradvisorprofile);
        setSupportActionBar(toolbar);

        // Get a support ActionBar corresponding to this toolbar
        ActionBar ab = getSupportActionBar();

        // Enable the Up button
        ab.setDisplayHomeAsUpEnabled(true);

        btnEditProfileAdv = findViewById(R.id.editprofileadv);

        btnEditProfileAdv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), EditProfileAdvisorActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
    public void imageClick(View view){
        Intent intent = new Intent(getApplicationContext(), ImageSelectActivity.class);
        intent.putExtra(ImageSelectActivity.FLAG_CAMERA, true);//default is true
        intent.putExtra(ImageSelectActivity.FLAG_GALLERY, true);//default is true
        startActivityForResult(intent, 1213);
    }
}