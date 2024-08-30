package com.shahjahan.fragment_273;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;


public class Sacend_fragment extends Fragment {


    TextInputEditText ed_text;
    TextView text_1,text_2,text_3,text_4,text_5,text_6;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_sacend, container, false);


        if (container != null) {
            container.removeAllViews();
        }

        //paricaya
        text_1 = view.findViewById(R.id.text_1);
        text_2 = view.findViewById(R.id.text_2);
        text_3 = view.findViewById(R.id.text_3);
        text_4 = view.findViewById(R.id.text_4);
        text_5 = view.findViewById(R.id.text_5);
        text_6 = view.findViewById(R.id.text_6);
        ed_text = view.findViewById(R.id.ed_text);
        //paricaya









        //edit_text edit_text edit_text edit_text edit_text edit_text edit_text edit_text

        ed_text.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable s){}
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            String st_text1 = ed_text.getText().toString();



            text_1.setText(st_text1);
            text_2.setText(st_text1);
            text_3.setText(st_text1);
            text_4.setText(st_text1);
            text_5.setText(st_text1);
            text_6.setText(st_text1);

            }
        });

        //edit_text edit_text edit_text edit_text edit_text edit_text edit_text



        return view;
    }
}