package com.example.paint;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PaletteFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PaletteFragment extends Fragment implements View.OnClickListener {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;



    public PaletteFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment PaletteFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static PaletteFragment newInstance(String param1, String param2) {
        PaletteFragment fragment = new PaletteFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_palette,container,false);

        AddButtonsListener(v);
        return v;
    }

    private void AddButtonsListener(View v) {
        Button btBlue = (Button) v.findViewById(R.id.btBlue);
        btBlue.setOnClickListener(this);
        Button btYellow = (Button) v.findViewById(R.id.btYellow);
        btYellow.setOnClickListener(this);
        Button btGreen= (Button) v.findViewById(R.id.btGreen);
        btGreen.setOnClickListener(this);
        Button btTeal = (Button) v.findViewById(R.id.btTeal);
        btTeal.setOnClickListener(this);
    }


    public void changecolor(int  color) {
      SharedViewModel model = new ViewModelProvider(requireActivity()).get(SharedViewModel.class);
        model.select(color);
    }



    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btBlue:
                changecolor(Color.BLUE);
                break;
            case R.id.btGreen:
                changecolor(Color.GREEN);
                break;
            case R.id.btYellow:
                changecolor(Color.YELLOW);
                break;
            default:
                break;
        }
    }
}