package com.example.metch.vegans.navigation;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.metch.vegans.R;
import com.example.metch.vegans.activitys.ImagesPerfilActivity;
import com.example.metch.vegans.databinding.FragmentPerfilBinding;
import com.google.android.material.textfield.TextInputEditText;

import de.hdodenhof.circleimageview.CircleImageView;

public class PerfilFragment extends Fragment {

    View view;
    CircleImageView circleImageView;
    Button btnSlvarPerfil;
    EditText editBio;
    TextInputEditText editNome, editInterreses, editTempoVeg;

    //FragmentPerfilBinding binding;

    public PerfilFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.main_menu, menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if( item.getItemId() == R.id.itemSair){
            sairDaConta();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

   public void sairDaConta(){
       Toast.makeText(requireContext(), "Saindo...", Toast.LENGTH_SHORT).show();
   }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_perfil, container, false);

        // iniciar Componentes da tela
        iniciarComponentes();



        return view;
    }


    // iniciar Componentes da tela
    private void iniciarComponentes(){
        // ativar menu para esse fragmento
        setHasOptionsMenu(true);

        circleImageView = view.findViewById(R.id.imageViewPerfil);
        btnSlvarPerfil = view.findViewById(R.id.button_salvarPerfil);
        editBio = view.findViewById(R.id.editTextMultiLineBio);
        editNome = view.findViewById(R.id.editTextNome);
        editInterreses = view.findViewById(R.id.editTextInteresses);
        editTempoVeg = view.findViewById(R.id.editTextVegan);

        // define o click listener da imagePerfil
        clickImageViewPerfil();
        // define o click listener do buttonSalvar
        clickButtonSalvarPerfil();
    }

    // define o click listener do buttonSalvar
    private void clickButtonSalvarPerfil(){
        btnSlvarPerfil.setOnClickListener( onClick ->{





            Toast.makeText(requireContext(), "Salvando Alterações", Toast.LENGTH_SHORT).show();
        });
    }


    // define o click listener da imagePerfil
    private void clickImageViewPerfil(){
        circleImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(requireContext(), ImagesPerfilActivity.class);
                startActivity( i );
            }
        });
    }

}