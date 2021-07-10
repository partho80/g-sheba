package com.example.g_sheba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Healthcondition extends AppCompatActivity {
    private int c=0,q1b1=0,q1b2=0,q2b1=0,q2b2=0,q3b1=0,q3b2=0,q4b1=0,q4b2=0,q5b1=0,q5b2=0,q6b1=0,q6b2=0,q7b1=0,q7b2=0,q8b1=0,q8b2=0,q9b1=0,q9b2=0,q10b1=0,q10b2=0,q11b1=0,q11b2=0,q12b1=0,q12b2=0,q13b1=0,q13b2=0,q14b1=0,q14b2=0,q15b1=0,q15b2=0;
    private Button healthConditionButton1,healthConditionButton2,healthConditionButton3,healthConditionButton4, healthConditionButton5,healthConditionButton6,healthConditionButton7,healthConditionButton8, healthConditionButton9,healthConditionButton10,healthConditionButton11,healthConditionButton12, healthConditionButton13,healthConditionButton14,healthConditionButton15,
            healthConditionButton16,healthConditionButton17,healthConditionButton18,healthConditionButton19, healthConditionButton20,healthConditionButton21,healthConditionButton22,healthConditionButton23, healthConditionButton24,healthConditionButton25,healthConditionButton26,healthConditionButton27, healthConditionButton28,healthConditionButton29,healthConditionButton30,
    healthConditionButton31
    ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_healthcondition);
        healthConditionButton1 = (Button) findViewById(R.id.healthCheckButton1);
        healthConditionButton2 = (Button) findViewById(R.id.healthCheckButton2);
        healthConditionButton3 = (Button) findViewById(R.id.healthCheckButton3);
        healthConditionButton4 = (Button) findViewById(R.id.healthCheckButton4);
        healthConditionButton5 = (Button) findViewById(R.id.healthCheckButton5);
        healthConditionButton6 = (Button) findViewById(R.id.healthCheckButton6);
        healthConditionButton7 = (Button) findViewById(R.id.healthCheckButton7);
        healthConditionButton8 = (Button) findViewById(R.id.healthCheckButton8);
        healthConditionButton9 = (Button) findViewById(R.id.healthCheckButton9);
        healthConditionButton10 = (Button) findViewById(R.id.healthCheckButton10);
        healthConditionButton11 = (Button) findViewById(R.id.healthCheckButton11);
        healthConditionButton12 = (Button) findViewById(R.id.healthCheckButton12);
        healthConditionButton13 = (Button) findViewById(R.id.healthCheckButton13);
        healthConditionButton14 = (Button) findViewById(R.id.healthCheckButton14);
        healthConditionButton15 = (Button) findViewById(R.id.healthCheckButton15);
        healthConditionButton16 = (Button) findViewById(R.id.healthCheckButton16);
        healthConditionButton17 = (Button) findViewById(R.id.healthCheckButton17);
        healthConditionButton18 = (Button) findViewById(R.id.healthCheckButton18);
        healthConditionButton19 = (Button) findViewById(R.id.healthCheckButton19);
        healthConditionButton20 = (Button) findViewById(R.id.healthCheckButton20);
        healthConditionButton21 = (Button) findViewById(R.id.healthCheckButton21);
        healthConditionButton22 = (Button) findViewById(R.id.healthCheckButton22);
        healthConditionButton23 = (Button) findViewById(R.id.healthCheckButton23);
        healthConditionButton24 = (Button) findViewById(R.id.healthCheckButton24);
        healthConditionButton25 = (Button) findViewById(R.id.healthCheckButton25);
        healthConditionButton26 = (Button) findViewById(R.id.healthCheckButton26);
        healthConditionButton27 = (Button) findViewById(R.id.healthCheckButton27);
        healthConditionButton28 = (Button) findViewById(R.id.healthCheckButton28);
        healthConditionButton29 = (Button) findViewById(R.id.healthCheckButton29);
        healthConditionButton30 = (Button) findViewById(R.id.healthCheckButton30);
        healthConditionButton31= (Button) findViewById(R.id.healthCheckButton31) ;
        healthConditionButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (q1b2>0)
                {
                    Toast.makeText(getApplicationContext(),"Error!!You have taken two answers.READ the question Carefully.And answer again",Toast.LENGTH_LONG).show();
                    q1b1=0;
                    q1b2=0;
                }
                else
                {
                    q1b1=q1b1+1;
                    if(q1b1==1)
                    {
                        c = c+2;
                        Toast.makeText(getApplicationContext(),"OK!!!ANSWER NEXT" ,Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"You have selected your answer.Answer the next question",Toast.LENGTH_LONG).show();
                    }
                }

            }
        });
        healthConditionButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (q1b1>0)
                {
                    Toast.makeText(getApplicationContext(),"Error!!You have taken two answers.READ the question Carefully.And answer it again",Toast.LENGTH_LONG).show();
                    c=c-2;
                    q1b1=0;
                    q1b2=0;

                }
                else
                {
                    q1b2=q1b2+1;
                    if (q1b2==1)
                    {
                        Toast.makeText(getApplicationContext(), "OK!!ANSWER NEXT", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"You have selected your answer.Answer the next question",Toast.LENGTH_LONG).show();

                    }
                }
            }
        });
        healthConditionButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (q2b2>0)
                {
                    Toast.makeText(getApplicationContext(),"Error!!You have taken two answers.READ the question Carefully.And answer again",Toast.LENGTH_LONG).show();
                    q2b1=0;
                    q2b2=0;
                }
                else
                {
                    q2b1=q2b1+1;
                    if(q2b1==1)
                    {
                        c = c+3;
                        Toast.makeText(getApplicationContext(),"OK!!!ANSWER NEXT ",Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"You have selected your answer.Answer the next question",Toast.LENGTH_LONG).show();
                    }
                }

            }
        });
        healthConditionButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (q2b1>0)
                {
                    Toast.makeText(getApplicationContext(),"Error!!You have taken two answers.READ the question Carefully.And answer it again",Toast.LENGTH_LONG).show();
                    c=c-3;
                    q2b1=0;
                    q2b2=0;

                }
                else
                {
                    q2b2=q2b2+1;
                    if(q2b2==1) {
                        Toast.makeText(getApplicationContext(), "OK!!ANSWER NEXT", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"You have selected your answer.Answer the next question",Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
        healthConditionButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (q3b2>0)
                {
                    Toast.makeText(getApplicationContext(),"Error!!You have taken two answers.READ the question Carefully.And answer again",Toast.LENGTH_LONG).show();
                    q3b1=0;
                    q3b2=0;
                }
                else
                {
                    q3b1=q3b1+1;
                    if(q3b1==1)
                    {
                        c = c+4;
                        Toast.makeText(getApplicationContext(),"OK!!!ANSWER NEXT ",Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"You have selected your answer.Answer the next question",Toast.LENGTH_LONG).show();
                    }
                }

            }
        });
        healthConditionButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (q3b1>0)
                {
                    Toast.makeText(getApplicationContext(),"Error!!You have taken two answers.READ the question Carefully.And answer it again",Toast.LENGTH_LONG).show();
                    c=c-4;
                    q3b1=0;
                    q3b2=0;

                }
                else
                {
                    q3b2=q3b2+1;
                    if(q3b2==1) {
                        Toast.makeText(getApplicationContext(), "OK!!ANSWER NEXT", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"You have selected your answer.Answer the next question",Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
        healthConditionButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (q4b2>0)
                {
                    Toast.makeText(getApplicationContext(),"Error!!You have taken two answers.READ the question Carefully.And answer again",Toast.LENGTH_LONG).show();
                    q4b1=0;
                    q4b2=0;
                }
                else
                {
                    q4b1=q4b1+1;
                    if(q4b1==1)
                    {
                        c = c+4;
                        Toast.makeText(getApplicationContext(),"OK!!!ANSWER NEXT ",Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"You have selected your answer.Answer the next question",Toast.LENGTH_LONG).show();
                    }
                }

            }
        });
        healthConditionButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (q4b1>0)
                {
                    Toast.makeText(getApplicationContext(),"Error!!You have taken two answers.READ the question Carefully.And answer it again",Toast.LENGTH_LONG).show();
                    c=c-4;
                    q4b1=0;
                    q4b2=0;

                }
                else
                {
                    q4b2=q4b2+1;
                    if(q4b2==1) {
                        Toast.makeText(getApplicationContext(), "OK!!ANSWER NEXT", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"You have selected your answer.Answer the next question",Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
        healthConditionButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (q5b2>0)
                {
                    Toast.makeText(getApplicationContext(),"Error!!You have taken two answers.READ the question Carefully.And answer again",Toast.LENGTH_LONG).show();
                    q5b1=0;
                    q5b2=0;
                }
                else
                {
                    q5b1=q5b1+1;
                    if(q5b1==1)
                    {
                        c = c+2;
                        Toast.makeText(getApplicationContext(),"OK!!!ANSWER NEXT ",Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"You have selected your answer.Answer the next question",Toast.LENGTH_LONG).show();
                    }
                }

            }
        });
        healthConditionButton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (q5b1>0)
                {
                    Toast.makeText(getApplicationContext(),"Error!!You have taken two answers.READ the question Carefully.And answer it again",Toast.LENGTH_LONG).show();
                    c=c-2;
                    q5b1=0;
                    q5b2=0;

                }
                else
                {
                    q5b2=q5b2+1;
                    if(q5b2==1) {
                        Toast.makeText(getApplicationContext(), "OK!!ANSWER NEXT", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"You have selected your answer.Answer the next question",Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
        healthConditionButton11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (q6b2>0)
                {
                    Toast.makeText(getApplicationContext(),"Error!!You have taken two answers.READ the question Carefully.And answer again",Toast.LENGTH_LONG).show();
                    q6b1=0;
                    q6b2=0;
                }
                else
                {
                    q6b1=q6b1+1;
                    if(q6b1==1)
                    {
                        c = c+3;
                        Toast.makeText(getApplicationContext(),"OK!!!ANSWER NEXT ",Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"You have selected your answer.Answer the next question",Toast.LENGTH_LONG).show();
                    }
                }

            }
        });
        healthConditionButton12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (q6b1>0)
                {
                    Toast.makeText(getApplicationContext(),"Error!!You have taken two answers.READ the question Carefully.And answer it again",Toast.LENGTH_LONG).show();
                    c=c-3;
                    q6b1=0;
                    q6b2=0;

                }
                else
                {
                    q6b2=q6b2+1;
                    if(q6b2==1) {
                        Toast.makeText(getApplicationContext(), "OK!!ANSWER NEXT", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"You have selected your answer.Answer the next question",Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
        healthConditionButton13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (q7b2>0)
                {
                    Toast.makeText(getApplicationContext(),"Error!!You have taken two answers.READ the question Carefully.And answer again",Toast.LENGTH_LONG).show();
                    q7b1=0;
                    q7b2=0;
                }
                else
                {
                    q7b1=q7b1+1;
                    if(q7b1==1)
                    {
                        c = c+4;
                        Toast.makeText(getApplicationContext(),"OK!!!ANSWER NEXT ",Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"You have selected your answer.Answer the next question",Toast.LENGTH_LONG).show();
                    }
                }

            }
        });
        healthConditionButton14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (q7b1>0)
                {
                    Toast.makeText(getApplicationContext(),"Error!!You have taken two answers.READ the question Carefully.And answer it again",Toast.LENGTH_LONG).show();
                    c=c-4;
                    q7b1=0;
                    q7b2=0;

                }
                else
                {
                    q7b2=q7b2+1;
                    if(q7b2==1) {
                        Toast.makeText(getApplicationContext(), "OK!!ANSWER NEXT", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"You have selected your answer.Answer the next question",Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
        healthConditionButton15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (q8b2>0)
                {
                    Toast.makeText(getApplicationContext(),"Error!!You have taken two answers.READ the question Carefully.And answer again",Toast.LENGTH_LONG).show();
                    q8b1=0;
                    q8b2=0;
                }
                else
                {
                    q8b1=q8b1+1;
                    if(q8b1==1)
                    {
                        c = c+4;
                        Toast.makeText(getApplicationContext(),"OK!!!ANSWER NEXT ",Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"You have selected your answer.Answer the next question",Toast.LENGTH_LONG).show();
                    }
                }

            }
        });
        healthConditionButton16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (q8b1>0)
                {
                    Toast.makeText(getApplicationContext(),"Error!!You have taken two answers.READ the question Carefully.And answer it again",Toast.LENGTH_LONG).show();
                    c=c-4;
                    q8b1=0;
                    q8b2=0;

                }
                else
                {
                    q8b2=q8b2+1;
                    if(q8b2==1) {
                        Toast.makeText(getApplicationContext(), "OK!!ANSWER NEXT", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"You have selected your answer.Answer the next question",Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
        healthConditionButton17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (q9b2>0)
                {
                    Toast.makeText(getApplicationContext(),"Error!!You have taken two answers.READ the question Carefully.And answer again",Toast.LENGTH_LONG).show();
                    q9b1=0;
                    q9b2=0;
                }
                else
                {
                    q9b1=q9b1+1;
                    if(q9b1==1)
                    {
                        c = c+5;
                        Toast.makeText(getApplicationContext(),"OK!!!ANSWER NEXT ",Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"You have selected your answer.Answer the next question",Toast.LENGTH_LONG).show();
                    }
                }

            }
        });
        healthConditionButton18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (q9b1>0)
                {
                    Toast.makeText(getApplicationContext(),"Error!!You have taken two answers.READ the question Carefully.And answer it again",Toast.LENGTH_LONG).show();
                    c=c-5;
                    q9b1=0;
                    q9b2=0;

                }
                else
                {
                    q9b2=q9b2+1;
                    if(q9b2==1) {
                        Toast.makeText(getApplicationContext(), "OK!!ANSWER NEXT", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"You have selected your answer.Answer the next question",Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
        healthConditionButton19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (q10b2>0)
                {
                    Toast.makeText(getApplicationContext(),"Error!!You have taken two answers.READ the question Carefully.And answer again",Toast.LENGTH_LONG).show();
                    q10b1=0;
                    q10b2=0;
                }
                else
                {
                    q10b1=q10b1+1;
                    if(q10b1==1)
                    {
                        c = c+3;
                        Toast.makeText(getApplicationContext(),"OK!!!ANSWER NEXT ",Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"You have selected your answer.Answer the next question",Toast.LENGTH_LONG).show();
                    }
                }

            }
        });
        healthConditionButton20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (q10b1>0)
                {
                    Toast.makeText(getApplicationContext(),"Error!!You have taken two answers.READ the question Carefully.And answer it again",Toast.LENGTH_LONG).show();
                    c=c-3;
                    q10b1=0;
                    q10b2=0;

                }
                else
                {
                    q10b2=q10b2+1;
                    if(q10b2==1) {
                        Toast.makeText(getApplicationContext(), "OK!!ANSWER NEXT", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"You have selected your answer.Answer the next question",Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
        healthConditionButton21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (q11b2>0)
                {
                    Toast.makeText(getApplicationContext(),"Error!!You have taken two answers.READ the question Carefully.And answer again",Toast.LENGTH_LONG).show();
                    q11b1=0;
                    q11b2=0;
                }
                else
                {
                    q11b1=q11b1+1;
                    if(q11b1==1)
                    {
                        c = c+5;
                        Toast.makeText(getApplicationContext(),"OK!!!ANSWER NEXT ",Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"You have selected your answer.Answer the next question",Toast.LENGTH_LONG).show();
                    }
                }

            }
        });
        healthConditionButton22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (q11b1>0)
                {
                    Toast.makeText(getApplicationContext(),"Error!!You have taken two answers.READ the question Carefully.And answer it again",Toast.LENGTH_LONG).show();
                    c=c-5;
                    q11b1=0;
                    q11b2=0;

                }
                else
                {
                    q11b2=q11b2+1;
                    if(q11b2==1) {
                        Toast.makeText(getApplicationContext(), "OK!!ANSWER NEXT", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"You have selected your answer.Answer the next question",Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
        healthConditionButton23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (q12b2>0)
                {
                    Toast.makeText(getApplicationContext(),"Error!!You have taken two answers.READ the question Carefully.And answer again",Toast.LENGTH_LONG).show();
                    q12b1=0;
                    q12b2=0;
                }
                else
                {
                    q12b1=q12b1+1;
                    if(q12b1==1)
                    {
                        c = c+4;
                        Toast.makeText(getApplicationContext(),"OK!!!ANSWER NEXT ",Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"You have selected your answer.Answer the next question",Toast.LENGTH_LONG).show();
                    }
                }

            }
        });
        healthConditionButton24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (q12b1>0)
                {
                    Toast.makeText(getApplicationContext(),"Error!!You have taken two answers.READ the question Carefully.And answer it again",Toast.LENGTH_LONG).show();
                    c=c-4;
                    q12b1=0;
                    q12b2=0;

                }
                else
                {
                    q12b2=q12b2+1;
                    if(q12b2==1) {
                        Toast.makeText(getApplicationContext(), "OK!!ANSWER NEXT", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"You have selected your answer.Answer the next question",Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
        healthConditionButton25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (q13b2>0)
                {
                    Toast.makeText(getApplicationContext(),"Error!!You have taken two answers.READ the question Carefully.And answer again",Toast.LENGTH_LONG).show();
                    q13b1=0;
                    q13b2=0;
                }
                else
                {
                    q13b1=q13b1+1;
                    if(q13b1==1)
                    {
                        c = c+3;
                        Toast.makeText(getApplicationContext(),"OK!!!ANSWER NEXT ",Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"You have selected your answer.Answer the next question",Toast.LENGTH_LONG).show();
                    }
                }

            }
        });
        healthConditionButton26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (q13b1>0)
                {
                    Toast.makeText(getApplicationContext(),"Error!!You have taken two answers.READ the question Carefully.And answer it again",Toast.LENGTH_LONG).show();
                    c=c-3;
                    q13b1=0;
                    q13b2=0;

                }
                else
                {
                    q13b2=q13b2+1;
                    if(q13b2==1) {
                        Toast.makeText(getApplicationContext(), "OK!!ANSWER NEXT", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"You have selected your answer.Answer the next question",Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
        healthConditionButton27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (q14b2>0)
                {
                    Toast.makeText(getApplicationContext(),"Error!!You have taken two answers.READ the question Carefully.And answer again",Toast.LENGTH_LONG).show();
                    q14b1=0;
                    q14b2=0;
                }
                else
                {
                    q14b1=q14b1+1;
                    if(q14b1==1)
                    {
                        c = c+5;
                        Toast.makeText(getApplicationContext(),"OK!!!ANSWER NEXT ",Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"You have selected your answer.Answer the next question",Toast.LENGTH_LONG).show();
                    }
                }

            }
        });
        healthConditionButton28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (q14b1>0)
                {
                    Toast.makeText(getApplicationContext(),"Error!!You have taken two answers.READ the question Carefully.And answer it again",Toast.LENGTH_LONG).show();
                    c=c-5;
                    q14b1=0;
                    q14b2=0;

                }
                else
                {
                    q14b2=q14b2+1;
                    if(q14b2==1) {
                        Toast.makeText(getApplicationContext(), "OK!!ANSWER NEXT", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"You have selected your answer.Answer the next question",Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
        healthConditionButton29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (q15b2>0)
                {
                    Toast.makeText(getApplicationContext(),"Error!!You have taken two answers.READ the question Carefully.And answer again",Toast.LENGTH_LONG).show();
                    q15b1=0;
                    q15b2=0;
                }
                else
                {
                    q15b1=q15b1+1;
                    if(q15b1==1)
                    {
                        c = c+5;
                        Toast.makeText(getApplicationContext(),"OK!!",Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"You have selected your answer.",Toast.LENGTH_LONG).show();
                    }
                }

            }
        });
        healthConditionButton30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (q15b1>0)
                {
                    Toast.makeText(getApplicationContext(),"Error!!You have taken two answers.READ the question Carefully.And answer it again",Toast.LENGTH_LONG).show();
                    c=c-5;
                    q15b1=0;
                    q15b2=0;

                }
                else
                {
                    q15b2=q15b2+1;
                    if(q15b2==1) {
                        Toast.makeText(getApplicationContext(), "OK!!", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"You have selected your answer.",Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
        healthConditionButton31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),result.class);
                intent.putExtra("Result",c);
                startActivity(intent);
            }
        });


    }
}