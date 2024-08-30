package com.shahjahan.fragment_273;

import static android.app.PendingIntent.getActivity;
import static androidx.core.content.ContextCompat.getSystemService;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.os.Environment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

import java.io.File;


public class Fast_fragment extends Fragment {




    TextInputEditText ed_text;
    TextView generate_button,text,ed_textt,reset_button;

    CheckBox checkBox;

    ImageView copy_button,shere_button;





    String text_main ="";
    String text_main2 ="";


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View fragmentview = inflater.inflate(R.layout.fragment_fast, container, false);

        if (container != null) {
            container.removeAllViews();
        }



        //paricaya
        ed_text = fragmentview.findViewById(R.id.ed_text);
        generate_button = fragmentview.findViewById(R.id.generate_button);
        text = fragmentview.findViewById(R.id.text);
        ed_textt = fragmentview.findViewById(R.id.ed_textt);
        checkBox = fragmentview.findViewById(R.id.checkBox);
        reset_button = fragmentview.findViewById(R.id.reset_button);
        copy_button = fragmentview.findViewById(R.id.copy_button);
        shere_button = fragmentview.findViewById(R.id.shere_button);
        //paricaya








        String all_text= "";

        //generate_button generate_button generate_button generate_button generate_button generate_button
        //generate_button generate_button generate_button generate_button generate_button generate_button
        //generate_button generate_button generate_button generate_button generate_button generate_button
        generate_button.setOnClickListener(v -> {

          text.setText("");

          if (ed_text.length() == 0 && ed_textt.length() == 0){
              ed_text.setError("error");
              ed_textt.setError("error");
          }else if (ed_text.length() == 0){
              ed_text.setError("error");
          } else if (ed_textt.length() == 0) {
              ed_textt.setError("error");
          }else {

            String s = ed_text.getText().toString();
            String f = ed_textt.getText().toString();

            //if (s.length() > 0 && f.length()>0 ) {

                int ed_text_int = Integer.parseInt(f);

                text.setText("");

                for (int x = 1; x <= ed_text_int; x++) {


                    //checkbox input
                    if (checkBox.isChecked()) {
                        String back = "\n";

                        text_main=all_text + s + back;
                        text.append(text_main);

                    }else {
                       text_main2=all_text + s;
                       text.append(text_main2);
                    }
                    //checkbox input



                }


          }//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>else


        });
        //generate_button generate_button generate_button generate_button generate_button generate_button
        //generate_button generate_button generate_button generate_button generate_button generate_button
        //generate_button generate_button generate_button generate_button generate_button generate_button




        //reset_button reset_button reset_button reset_button reset_button reset_button reset_button reset_button
        //reset_button reset_button reset_button reset_button reset_button reset_button reset_button reset_button
        //reset_button reset_button reset_button reset_button reset_button reset_button reset_button reset_button

        reset_button.setOnClickListener(v -> {
            ed_text.setText("");
            ed_textt.setText("");
            text.setText("");
        });

        //reset_button reset_button reset_button reset_button reset_button reset_button reset_button reset_button
        //reset_button reset_button reset_button reset_button reset_button reset_button reset_button reset_button
        //reset_button reset_button reset_button reset_button reset_button reset_button reset_button reset_button



        //copy_button copy_button copy_button copy_button copy_button copy_button copy_button copy_button copy_button
        //copy_button copy_button copy_button copy_button copy_button copy_button copy_button copy_button copy_button
        //copy_button copy_button copy_button copy_button copy_button copy_button copy_button copy_button copy_button

        copy_button.setOnClickListener(v -> {

            // Get text from TextView
            String textCopy = text.getText().toString(); // Convert CharSequence to String

            // Get reference to ClipboardManager
            ClipboardManager clipboardManager = (ClipboardManager) getActivity(). getSystemService(Context.CLIPBOARD_SERVICE);

            // Create a new ClipData
            ClipData clip = ClipData.newPlainText("textCopy", textCopy);

            // Set the ClipData to ClipboardManager
            clipboardManager.setPrimaryClip(clip);

            // Show a toast indicating successful copy
            Toast.makeText(getActivity(), "Text copied to clipboard", Toast.LENGTH_SHORT).show();

        });

        //copy_button copy_button copy_button copy_button copy_button copy_button copy_button copy_button copy_button
        //copy_button copy_button copy_button copy_button copy_button copy_button copy_button copy_button copy_button
        //copy_button copy_button copy_button copy_button copy_button copy_button copy_button copy_button copy_button






        //shere_button shere_button shere_button shere_button shere_button shere_button shere_button shere_button
        //shere_button shere_button shere_button shere_button shere_button shere_button shere_button shere_button

        shere_button.setOnClickListener(v -> {

            // Get text from TextView
            String textCopy = text.getText().toString(); // Convert CharSequence to String

            if (text.length()>0){

            Intent sharingIntent = new Intent(Intent.ACTION_SEND);
            sharingIntent.setType("text/plain");
            sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, textCopy);
            sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Subject");
            startActivity(Intent.createChooser(sharingIntent, "Share using"));

            }else {
                Toast.makeText(getActivity(), "error", Toast.LENGTH_SHORT).show();
            }

        });
        //shere_button shere_button shere_button shere_button shere_button shere_button shere_button shere_button
        //shere_button shere_button shere_button shere_button shere_button shere_button shere_button shere_button









        return fragmentview;
    }
}