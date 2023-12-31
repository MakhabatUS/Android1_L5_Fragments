package com.makhabatusen.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ButtonsFragment extends Fragment {

    Button btnShow;
    Button btnHide;
    IFragments intFragments;

    public ButtonsFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.buttons_fragment, container, false);
        buttonsInit(view);
        return view;
    }

    private void buttonsInit(View view) {
        intFragments = (IFragments) getActivity();
        btnShow = view.findViewById(R.id.btn_show);
        btnHide = view.findViewById(R.id.btn_hide);

        btnShow.setOnClickListener(v -> {
            intFragments.showFragment();

        });
        btnHide.setOnClickListener(v -> {
            intFragments.hideFragment();
        });

    }
}
