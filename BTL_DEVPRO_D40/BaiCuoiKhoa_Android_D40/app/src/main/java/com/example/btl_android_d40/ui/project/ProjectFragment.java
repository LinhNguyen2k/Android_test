package com.example.btl_android_d40.ui.project;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.btl_android_d40.R;
import com.example.btl_android_d40.ui.product.GalleryViewModel;

public class ProjectFragment extends Fragment {

    private ProjectViewModel projectViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        projectViewModel =
                ViewModelProviders.of(this).get(ProjectViewModel.class);
        View root = inflater.inflate(R.layout.fragment_project, container, false);
        final TextView textView = root.findViewById(R.id.text_home);
        projectViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
