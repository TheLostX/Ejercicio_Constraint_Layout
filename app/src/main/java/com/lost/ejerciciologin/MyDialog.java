package com.lost.ejerciciologin;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class MyDialog extends DialogFragment {

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("My Title");
        builder.setMessage("This is a test message");
        builder.setPositiveButton("YES", (dialog, which) -> {
            Toast.makeText(getContext(), "Pressed Yes Button", Toast.LENGTH_LONG).show();

        });

        builder.setNegativeButton("NO", (dialog, wich) ->{
            Toast.makeText(getContext(), "Pressed No Button", Toast.LENGTH_LONG).show();
        });

        return builder.create();
    }
}
