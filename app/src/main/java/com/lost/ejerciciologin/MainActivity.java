package com.lost.ejerciciologin;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.util.Patterns;

import android.widget.EditText;

import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.lost.ejerciciologin.databinding.ActivityMainBinding;
import com.squareup.picasso.Picasso;


public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    public static final String URL = "https://i.blogs.es/451111/isaac/original.jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initBinding();
        setContentView(binding.getRoot());
        loadValues();
        cargarConGlide();
        setListener();
    }

    private boolean isValidEmail(String email){

        return Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }

    private void loadValues() {

    }

    private void setListener() {
        binding.btnHola.setOnClickListener(v -> {
            registrarUsuario();

            if(!isValidEmail(binding.etCorreo.getText().toString())){
                binding.etCorreo.setError("Correo invalido");
            }

        });
    }

    private void registrarUsuario() {

        if (isValidValues()) {
            Toast.makeText(this, "Usuario Creado", Toast.LENGTH_LONG).show();
            cleanEditTexts();
        }
    }

    private boolean isValidValues() {

        boolean pass = isNotEmptyEditText(binding.etPass, "el password no puede ser en blanco");
        boolean correo = isNotEmptyEditText(binding.etCorreo, "El correo no puede ser en blanco");
        boolean apellido = isNotEmptyEditText(binding.etApellido, "El apellido no puede ser en blanco");
        boolean nombre = isNotEmptyEditText(binding.etNombre, "El nombre no puede ser en blanco");

        return pass && correo && apellido && nombre;

    }

    private void cleanEditTexts() {
        binding.etNombre.setText(null);
        binding.etApellido.setText(null);
        binding.etCorreo.setText(null);
        binding.etPass.setText(null);
    }

    private boolean isNotEmptyEditText(EditText editText, String errorMessage) {

        if (editText.getText().toString().isEmpty()) {
            editText.setError(errorMessage);
            editText.requestFocus();
            return false;
        }

        return true;
    }

    private void initBinding() {

        binding = ActivityMainBinding.inflate(getLayoutInflater());

    }

    private void cargarConPicasso() {
        Picasso.get().load(URL).into(binding.imgAvatar);
    }

    private void cargarConGlide() {
        Glide.with(this).load(URL).into(binding.imgAvatar);
    }

}