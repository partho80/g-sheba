package com.example.g_sheba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class FindDoctorActivity extends AppCompatActivity {
    private TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8,textView9,textView10;
    private Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11,button12,button13,button14,button15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_doctor);
        textView1 = (TextView) findViewById(R.id.contact_id_1);
        textView2 = (TextView) findViewById(R.id.contact_id_2);
        textView3 = (TextView) findViewById(R.id.contact_id_3);
        textView4 = (TextView) findViewById(R.id.contact_id_4);
        textView5 = (TextView) findViewById(R.id.contact_id_5);
        textView6 = (TextView) findViewById(R.id.doctor_name1);
        textView7 = (TextView) findViewById(R.id.doctor_name2);
        textView8 = (TextView) findViewById(R.id.doctor_name3);
        textView9 = (TextView) findViewById(R.id.doctor_name4);
        textView10 = (TextView) findViewById(R.id.doctor_name5);
        button1 = (Button) findViewById(R.id.contact_button_1);
        button2 = (Button) findViewById(R.id.contact_button_2);
        button3 = (Button) findViewById(R.id.contact_button_3);
        button4 = (Button) findViewById(R.id.contact_button_4);
        button5 = (Button) findViewById(R.id.contact_button_5);
        button6 = (Button) findViewById(R.id.button_doctor_1);
        button7 = (Button) findViewById(R.id.button_doctor_2);
        button8 = (Button) findViewById(R.id.button_doctor_3);
        button9 = (Button) findViewById(R.id.button_doctor_4);
        button10 = (Button) findViewById(R.id.button_doctor_5);
        button11 = (Button) findViewById(R.id.button_doctor_6);
        button12 = (Button) findViewById(R.id.button_doctor_7);
        button13 = (Button) findViewById(R.id.button_doctor_8);
        button14 = (Button) findViewById(R.id.button_doctor_9);
        button15 = (Button) findViewById(R.id.button_doctor_10);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone = textView1.getText().toString();
                String s = "tel:" + phone;
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse(s));
                startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone = textView2.getText().toString();
                String s = "tel:" + phone;
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse(s));
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone = textView3.getText().toString();
                String s = "tel:" + phone;
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse(s));
                startActivity(intent);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone = textView4.getText().toString();
                String s = "tel:" + phone;
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse(s));
                startActivity(intent);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone = textView5.getText().toString();
                String s = "tel:" + phone;
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse(s));
                startActivity(intent);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Ok!!To make appointment,Press CALL_NOW",Toast.LENGTH_SHORT).show();
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Ok!!To make appointment,Press CALL_NOW",Toast.LENGTH_SHORT).show();
            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Ok!!To make appointment,Press CALL_NOW",Toast.LENGTH_SHORT).show();
            }
        });
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Ok!!To make appointment,Press CALL_NOW",Toast.LENGTH_SHORT).show();
            }
        });
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Ok!!To make appointment,Press CALL_NOW",Toast.LENGTH_SHORT).show();
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String doctor = textView6.getText().toString().trim();
                Intent intent = new Intent(getApplicationContext(),AppointmentActivity.class);
                intent.putExtra("Doctor",doctor);
                startActivity(intent);

            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String doctor = textView7.getText().toString().trim();
                Intent intent = new Intent(getApplicationContext(),AppointmentActivity.class);
                intent.putExtra("Doctor",doctor);
                startActivity(intent);

            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String doctor = textView8.getText().toString().trim();
                Intent intent = new Intent(getApplicationContext(),AppointmentActivity.class);
                intent.putExtra("Doctor",doctor);
                startActivity(intent);

            }
        });
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String doctor = textView9.getText().toString().trim();
                Intent intent = new Intent(getApplicationContext(),AppointmentActivity.class);
                intent.putExtra("Doctor",doctor);
                startActivity(intent);

            }
        });
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String doctor = textView10.getText().toString().trim();
                Intent intent = new Intent(getApplicationContext(),AppointmentActivity.class);
                intent.putExtra("Doctor",doctor);
                startActivity(intent);

            }
        });
    }
}