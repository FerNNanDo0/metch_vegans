package com.example.metch.vegans.activitys;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.example.metch.vegans.R;
import com.example.metch.vegans.databinding.ActivityMainBinding;
import com.example.metch.vegans.navigation.ChatFragment;
import com.example.metch.vegans.navigation.MetchsFragment;
import com.example.metch.vegans.navigation.PerfilFragment;
import com.google.android.material.navigation.NavigationBarView;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {

    View view;
    ActivityMainBinding binding;

    FrameLayout frameLayout;
    Fragment fragmento;
    FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        view = binding.getRoot();
        setContentView(view);

        // recuperar Ref do componente
        frameLayout = binding.inclu.frameFragments;

        // passa o primeiro fragment
        fragmento = new MetchsFragment();
        openFragment(fragmento);

        // ativar click do bottomView
        clickDoNavigationView();

    }

    // click do navigationView
    @SuppressLint("NonConstantResourceId")
    private void clickDoNavigationView(){
        binding.bottomNavigationView.setOnItemSelectedListener( item -> {
            switch ( item.getItemId() ){

                case R.id.itemPerfilPerson:
                    fragmento = new PerfilFragment();
                    openFragment(fragmento);
                    break;

                case R.id.itemChat:
                    fragmento = new ChatFragment();
                    openFragment(fragmento);
                    break;

                case R.id.itemMetch:
                    fragmento = new MetchsFragment();
                    openFragment(fragmento);
                    break;
            }
            return false;
        });
    }

    // open  fragments
    private void openFragment(Fragment fragment){
        // config fragments
        fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(frameLayout.getId(), fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

    }


}