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

public class CustomAdapter1 extends ArrayAdapter<AppointmentPatient> {

    private Activity context;
    private List<AppointmentPatient> appointmentPatientList;

    public CustomAdapter1(Activity context,  List<AppointmentPatient> appointmentPatientList) {
        super(context, R.layout.sample1_layout, appointmentPatientList);
        this.context = context;
        this.appointmentPatientList = appointmentPatientList;
    }

    @NonNull
    @Override
    public View getView(int position,  View convertView,ViewGroup parent) {
        LayoutInflater layoutInflater = context.getLayoutInflater();
        View view = layoutInflater.inflate(R.layout.sample1_layout,null,true);
        AppointmentPatient appointmentPatient = appointmentPatientList.get(position);
        TextView t1 = view.findViewById(R.id.sample1_txt_doctor_name);
        TextView t2 = view.findViewById(R.id.sample1_txt_patient_name);
        TextView t3 = view.findViewById(R.id.sample1_txt_patient_phone);
        TextView t4 = view.findViewById(R.id.sample1_txt_appoint_date);
        TextView t5 = view.findViewById(R.id.sample1_txt_appoint_time);
        t1.setText("Doctor "+appointmentPatient.getDoctor_name());
        t2.setText("Patient Name: " +appointmentPatient.getPatient_name());
        t3.setText("Patient Phone: "+appointmentPatient.getPatient_phone());
        t4.setText("Appointment Date: "+appointmentPatient.getAppointment_date());
        t5.setText("Appointment Time: "+appointmentPatient.getAppointment_time());
        return view;
    }
}
