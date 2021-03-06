package com.example.reubro_nav;

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

public class SlideshowFragment extends Fragment {

    public SlideshowFragment()
    {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_slideshow, container, false);
    }

    @Override
    public void onResume()
    {
        super.onResume();
        //Set title of this fragment
        if (getActivity() != null)
        {
            getActivity().setTitle("slide show");
        }
    }
}