package com.example.metch.vegans.activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.metch.vegans.R;
import com.example.metch.vegans.databinding.ActivityImagesPerfilBinding;

public class ImagesPerfilActivity extends AppCompatActivity {


    ActivityImagesPerfilBinding binding;
    View viewPerfil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_images_perfil);
        binding = ActivityImagesPerfilBinding.inflate(getLayoutInflater());
        viewPerfil = binding.getRoot();
        setContentView( viewPerfil );


        // definir button de voltar
        assert getSupportActionBar() != null;
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }


    // Acao de button voltar
    @Override
    public boolean onNavigateUp() {
        finish();
        return false;
    }

}