package com.shahjahan.fragment_273;

import android.graphics.Color;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;


public class Three_fragment extends Fragment {


    private int progress = 0;
    TextView button_decr,button_incr;
    ProgressBar progress_bar;
    TextView text_view_progress;


    CardView toolbar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_three, container, false);

        if (container != null) {
            container.removeAllViews();
        }

        button_decr = view.findViewById(R.id.button_decr);
        button_incr = view. findViewById(R.id.button_incr);
        progress_bar = view.findViewById(R.id.progress_bar);
        text_view_progress =view.findViewById(R.id.text_view_progress);
        toolbar =view.findViewById(R.id.toolbar);



        //toolbar.setBackgroundColor(Color.parseColor("#9932CC"));

        progress=0;

        // when clicked on buttonIncrement progress is increased by 99%
        button_incr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // if progress is less than or equal
                // to 90% then only it can be increased
                if (progress <= 99) {
                    progress += 1;
                    updateProgressBar();
                }else {
                    progress = 0;
                    progress += 1;
                    updateProgressBar();
                }
            }
        });

        // when clicked on buttonIncrement progress is decreased by 10%
        button_decr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // If progress is greater than
                // 10% then only it can be decreased

                    progress = 0;
                    updateProgressBar();
                
            }
        });



        return view;
    } //onCreac Mathud end here =============================================================



    // updateProgressBar() method sets
    // the progress of ProgressBar in text
    private void updateProgressBar() {
        progress_bar.setProgress(progress);
        text_view_progress.setText(String.valueOf(progress));

    }







}//public class end here==========================================