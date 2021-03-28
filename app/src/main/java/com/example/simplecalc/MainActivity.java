package com.example.simplecalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button zero, un, deux, trois, quatre, cinq, six, sept, huit, neuf, point, multiplier,
            diviser, soustraire, additionner, buttonC, egal;
    TextView display;
    boolean additionne, soustrait, multiplie, divise;
    float mValueOne, mValueTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        zero = (Button) findViewById(R.id.zero);
        un = (Button) findViewById(R.id.un);
        deux = (Button) findViewById(R.id.deux);
        trois = (Button) findViewById(R.id.trois);
        quatre = (Button) findViewById(R.id.quatre);
        cinq = (Button) findViewById(R.id.cinq);
        six = (Button) findViewById(R.id.six);
        sept = (Button) findViewById(R.id.sept);
        huit = (Button) findViewById(R.id.huit);
        neuf = (Button) findViewById(R.id.neuf);
        additionner = (Button) findViewById(R.id.additionner);
        soustraire = (Button) findViewById(R.id.soustraire);
        diviser = (Button) findViewById(R.id.diviser);
        multiplier = (Button) findViewById(R.id.multiplier);
        point = (Button) findViewById(R.id.point);
        buttonC = (Button) findViewById(R.id.buttonC);
        egal = (Button) findViewById(R.id.egal);

        display = (TextView) findViewById(R.id.display);

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(null);
                display.setText(display.getText() + "0");
            }
        });

        un.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(null);
                display.setText(display.getText() + "1");
            }
        });

        deux.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(null);
                display.setText(display.getText() + "2");
            }
        });

        trois.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(null);
                display.setText(display.getText() + "3");
            }
        });

        quatre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(null);
                display.setText(display.getText() + "4");
            }
        });

        cinq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(null);
                display.setText(display.getText() + "5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(null);
                display.setText(display.getText() + "6");
            }
        });

        sept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(null);
                display.setText(display.getText() + "7");
            }
        });

        huit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(null);
                display.setText(display.getText() + "8");
            }
        });

        neuf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(null);
                display.setText(display.getText() + "9");

            }
        });

        additionner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display.getText().toString().equals("")) {
                    display.setText("");
                    popUp("Entrez une valeur");
                } else {
                    mValueOne = Float.parseFloat(display.getText() + "");
                    additionne = true;
                    display.setText(null);
                }
            }
        });

        soustraire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display.getText().toString().equals("")) {
                    display.setText("");
                    popUp("Entrez une valeur");
                } else {
                    mValueOne = Float.parseFloat(display.getText() + "");
                    soustrait = true;
                    display.setText(null);
                }
            }
        });

        multiplier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display.getText().toString().equals("")) {
                    display.setText("");
                    popUp("Entrez une valeur");
                } else {
                    mValueOne = Float.parseFloat(display.getText() + "");
                    multiplie = true;
                    display.setText(null);
                }
            }
        });

        diviser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display.getText().toString().equals("")) {
                    display.setText("");
                    popUp("Entrez une valeur");
                } else {
                    mValueOne = Float.parseFloat(display.getText() + "");
                    divise = true;
                    display.setText(null);
                }
            }
        });

        egal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display.getText().toString().equals("")) {
                    display.setText("");
                    popUp("Entrez une valeur");
                } else {
                    mValueTwo = Float.parseFloat(display.getText() + "");

                    if (additionne == true) {
                        display.setText(mValueOne + mValueTwo + "");
                        additionne = false;
                    }

                    if (soustrait == true) {
                        display.setText(mValueOne - mValueTwo + "");
                        soustrait = false;
                    }

                    if (multiplie == true) {
                        display.setText(mValueOne * mValueTwo + "");
                        multiplie = false;
                    }

                    if (divise == true) {
                        display.setText(mValueOne / mValueTwo + "");
                        divise = false;
                    }
                }
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText("");
            }
        });

        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + ".");
            }
        });
    }

    public void popUp(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }
}