package com.example.tp6;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class MainFragment extends Fragment implements View.OnClickListener {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle
            savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    public interface Callback {
        public void goTo(View v);
    }

    private Callback m_callback;
    @Override
    public void onViewCreated( View view, Bundle savedInstanceState) {
        view.findViewById(R.id.b1).setOnClickListener((View.OnClickListener) this);
        view.findViewById(R.id.b2).setOnClickListener((View.OnClickListener) this);
    }
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        m_callback = (Callback) context;
    }
    @Override
    public void onClick(View v) {
        m_callback.goTo(v);
    }
}
