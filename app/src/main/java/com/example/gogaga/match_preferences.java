package com.example.gogaga;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.edmodo.rangebar.RangeBar;
import com.triggertrap.seekarc.SeekArc;

public class match_preferences extends Fragment implements RangeBar.OnRangeBarChangeListener
{
    public match_preferences()
    {
        // Required empty public constructor


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.match_preferences, container, false);

        TextView interest = view.findViewById(R.id.interest);

        return view;
    }

    @Override
    public void onIndexChangeListener(RangeBar rangeBar, int i, int i1)
    {
        Toast.makeText(getContext(), i+" "+i1, Toast.LENGTH_SHORT).show();

    }
}

/*@SuppressLint("Registered")
class mf extends AppCompatActivity
{
    RangeBar rangeBar;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        rangeBar = findViewById(R.id.rangebar);

        rangeBar.setOnRangeBarChangeListener(new RangeBar.OnRangeBarChangeListener()
        {
            @Override
            public void onIndexChangeListener(RangeBar rangeBar, int leftThumbIndex, int rightThumbIndex)
            {
                //Code using the leftThumbIndex and rightThumbIndex to update the index values.

            }
        });


    }
}*/

/*




            <me.tankery.lib.circularseekbar.CircularSeekBar
            android:id="@+id/seek_bar"
            android:layout_width="200dp"
            android:layout_height="wrap_content"
            android:layout_gravity="center_horizontal"
            app:cs_negative_enabled="true"
            app:cs_circle_style="square"
            app:cs_circle_stroke_width="18dp"
            app:cs_pointer_stroke_width="20dp"
            app:cs_pointer_angle="44"
            app:cs_pointer_alpha_ontouch = "20"
            app:cs_move_outside_circle = "true"
            app:cs_maintain_equal_circle = "true"
            />

 */


/*

<com.triggertrap.seekarc.SeekArc
                android:id="@+id/seekArc"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_gravity="center"
                android:padding="40dp"
                seekarc:rotation="180"
                seekarc:startAngle="30"
                seekarc:sweepAngle="300"
                seekarc:touchInside="true"
                seekarc:progressColor = "@color/pink"
                seekarc:roundEdges = "true"
                seekarc:arcWidth = "30dp"
                seekarc:progressWidth = "30dp"
                app:thumb="@drawable/thumb"
                />

 */

/*
    <com.edmodo.rangebar.RangeBar
                xmlns:custom="http://schemas.android.com/apk/res-auto"
                android:id="@+id/rangebar"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                custom:tickCount="5"
                custom:barColor="@color/darkblue"
                />


 */