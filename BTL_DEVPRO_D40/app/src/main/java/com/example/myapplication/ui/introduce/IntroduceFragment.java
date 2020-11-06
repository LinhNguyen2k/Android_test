package com.example.myapplication.ui.introduce;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.myapplication.R;
import com.example.myapplication.databinding.FragmentHomeBinding;
import com.example.myapplication.databinding.FragmentIntroduceBinding;

public class IntroduceFragment extends Fragment {

    FragmentIntroduceBinding binding;

    public static IntroduceFragment newInstance() {

        Bundle args = new Bundle();

        IntroduceFragment fragment = new IntroduceFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_introduce,container,false);

        binding.textIntroduce.setText("HEHE");

        return binding.getRoot();
    }
}
