package com.ucucite.blockonemobdev;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

public class ThirdFragment extends Fragment {

    public ThirdFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout and store the view
        View view = inflater.inflate(R.layout.fragment_third, container, false);

        // Find Button using the stored view
        Button btnGetStarted = view.findViewById(R.id.btn_get_started); // ✅ Correct variable name

        // Set Click Listener
        btnGetStarted.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), SignUpActivity.class);
            startActivity(intent);
        });

        return view;
    }
}
