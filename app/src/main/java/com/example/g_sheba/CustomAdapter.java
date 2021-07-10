package com.example.g_sheba;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class CustomAdapter extends ArrayAdapter<Patient> {
    private Activity context;
    private List<Patient> patientList;

    public CustomAdapter(Activity context, int resource,  List<Patient> patientList) {
        super(context, R.layout.sample_layout, patientList);
        this.context = context;
        this.patientList = patientList;
    }

    @NonNull
    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        LayoutInflater layoutInflater = context.getLayoutInflater();
        View view = layoutInflater.inflate(R.layout.sample_layout,null,true);
        Patient patient = patientList.get(position);
        TextView t1 = view.findViewById(R.id.sample_txt_name);
        TextView t2 = view.findViewById(R.id.sample_txt_age);
        TextView t3 = view.findViewById(R.id.sample_txt_condition);
        TextView t4 = view.findViewById(R.id.sample_txt_date);
        TextView t5 = view.findViewById(R.id.sample_txt_phone);
        TextView t6 = view.findViewById(R.id.sample_txt_email);
        t1.setText("Name: "+ patient.getName());
        t2.setText("Age: "+ patient.getAge());
        t3.setText("Condition: "+ patient.getCondition());
        t4.setText("Date: "+ patient.getDate());
        t5.setText("Phone: "+ patient.getPhone());
        t6.setText("email: "+ patient.getEmail());
        return view;
    }
}
