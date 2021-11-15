package com.example.nutritionapp.Register;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.nutritionapp.R;
import com.example.nutritionapp.databinding.FragmentEmailBinding;
import com.example.nutritionapp.databinding.FragmentHomeBinding;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class FragmentEmail extends Fragment {
    private FragmentEmailBinding binding;
    private SharedViewModel sharedViewModel;
    EditText textEmail, textMobile;
    FloatingActionButton add;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentEmailBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        textEmail= root.findViewById(R.id.text_email);
        textMobile= root.findViewById(R.id.text_mobile);
        add= root.findViewById(R.id.email_next);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sharedViewModel= new ViewModelProvider(getActivity()).get(SharedViewModel.class);
                if(textEmail.getText().toString()!=null & textMobile.getText().toString()!= null)
                    sharedViewModel.setEmailMobile(textEmail.getText().toString(), textMobile.getText().toString());
            }
        });

        return root;

    }
}