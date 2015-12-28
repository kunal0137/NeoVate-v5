package com.example.administrator.neovate_v5;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Administrator on 12/27/2015.
 */
public class InfantAdapter extends ArrayAdapter<Infant> {
    public InfantAdapter(Context context, ArrayList<Infant> users) {
        super(context, R.layout.custom_infant, users);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        // Get the data item for this position
        Infant inadapter = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (row == null) {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            row = inflater.inflate(R.layout.custom_infant, parent, false);

           // row = LayoutInflater.from(getContext()).inflate(R.layout.custom_infant, parent, false);
        }
        // Lookup view for data population
        TextView inName = (TextView) row.findViewById(R.id.inName);
        TextView inHeartRate = (TextView) row.findViewById(R.id.inHeartRate);
        TextView inRespRate = (TextView) row.findViewById(R.id.inRespRate);
        TextView inTemp = (TextView) row.findViewById(R.id.inTemp);
        TextView inOxSat = (TextView) row.findViewById(R.id.inOxSat);
        /* Populate the data into the template view using the data object */
        inName.setText(inadapter.name);
  /*      inName.setText((inadapter.heartrate).toString());
        inName.setText(inadapter.name);
        inName.setText(inadapter.name);*/

        // Return the completed view to render on screen
        return row;
    }
}

