package com.example.eva.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;

public class topsectionactivity extends Fragment {

private static EditText toptextinput;
    private static EditText bottomtextinput;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.top_section, container,false);
        toptextinput =(EditText) view.findViewById(R.id.toptextinput);
        bottomtextinput =(EditText) view.findViewById(R.id.bottontextinput);
final Button button =(Button) view.findViewById(R.id.button);

        button.setOnClickListener(
                new View.OnClickListener(){
                    public
                }
        );




        return view;
    }

}
