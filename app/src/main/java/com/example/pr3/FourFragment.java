package com.example.pr3;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.pr3.databinding.FragmentFourBinding;

public class FourFragment extends Fragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentFourBinding binding = FragmentFourBinding.inflate(inflater, container, false);
        getChildFragmentManager()
                .setFragmentResultListener("requestKey", this, ((requestKey, result) -> {
                    binding.button.setText(result.getString("bundleKey"));
                }));
        return binding.getRoot();
    }
}