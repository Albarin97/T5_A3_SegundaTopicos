package com.example.albar.t5_a3_delatorregarciaalbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText cajaTxt;
    double a = 0;
    byte ope=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cajaTxt = findViewById(R.id.cajaTxt);
    }

    public void agrega0(View v){
        cajaTxt.setText(cajaTxt.getText().toString()+"0");
    }
    public void agrega1(View v){
        cajaTxt.setText(cajaTxt.getText().toString()+"1");
    }
    public void agrega2(View v){
        cajaTxt.setText(cajaTxt.getText().toString()+"2");
    }
    public void agrega3(View v){
        cajaTxt.setText(cajaTxt.getText().toString()+"3");
    }
    public void agrega4(View v){
        cajaTxt.setText(cajaTxt.getText().toString()+"4");
    }
    public void agrega5(View v){
        cajaTxt.setText(cajaTxt.getText().toString()+"5");
    }
    public void agrega6(View v){
        cajaTxt.setText(cajaTxt.getText().toString()+"6");
    }
    public void agrega7(View v){
        cajaTxt.setText(cajaTxt.getText().toString()+"7");
    }
    public void agrega8(View v){
        cajaTxt.setText(cajaTxt.getText().toString()+"8");
    }
    public void agrega9(View v){
        cajaTxt.setText(cajaTxt.getText().toString()+"9");
    }
    public void agregaPunto(View v){
        cajaTxt.setText(cajaTxt.getText().toString()+".");
    }
    public void sumar(View v){
        a = Double.parseDouble(cajaTxt.getText().toString());
        Toast.makeText(getApplicationContext(), "Guardado "+a, Toast.LENGTH_LONG).show();
        ope = 1;
        cajaTxt.setText("");
    }
    public void restar(View v){
        a = Double.parseDouble(cajaTxt.getText().toString());
        Toast.makeText(getApplicationContext(), "Guardado "+a, Toast.LENGTH_LONG).show();
        ope = 2;
        cajaTxt.setText("");
    }
    public void divi(View v){
        a = Double.parseDouble(cajaTxt.getText().toString());
        Toast.makeText(getApplicationContext(), "Guardado "+a, Toast.LENGTH_LONG).show();
        ope = 3;
        cajaTxt.setText("");
    }
    public void multi(View v){
        a = Double.parseDouble(cajaTxt.getText().toString());
        Toast.makeText(getApplicationContext(), "Guardado "+a, Toast.LENGTH_LONG).show();
        ope = 4;
        cajaTxt.setText("");
    }

    public void borrarTodo(View v){
        cajaTxt.setText("");
    }
    public void borrarUno(View v){
        String x = cajaTxt.getText().toString();
        if(x.length()>0){
            cajaTxt.setText(x.substring(0, x.length()-1));
        }

    }

    public void igual(View v){
        if(ope==1){
            cajaTxt.setText(a+(Double.parseDouble(cajaTxt.getText().toString()))+"");
        }else if(ope==2){
            cajaTxt.setText(a-(Double.parseDouble(cajaTxt.getText().toString()))+"");
        }else if(ope==3){
            cajaTxt.setText(a/(Double.parseDouble(cajaTxt.getText().toString()))+"");
        }else if(ope==4){
            cajaTxt.setText(a*(Double.parseDouble(cajaTxt.getText().toString()))+"");
        }
    }



}
