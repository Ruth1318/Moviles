package com.example.lumiproxi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class ProximidadActivity extends AppCompatActivity {

    TextView valor;
    SensorManager administradorDeSensores;
    SensorEventListener disparadorEventoSensor;
    Sensor miSensor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proximidad);
        valor=findViewById(R.id.textView2);


        administradorDeSensores = (SensorManager) getSystemService(SENSOR_SERVICE);
        miSensor = administradorDeSensores.getDefaultSensor(Sensor.TYPE_PROXIMITY);
        if(miSensor==null){
            Toast.makeText(this, "Su dispositivo no tiene el sensor de proximidad", Toast.LENGTH_LONG).show();
            finish();
        }else{
            Toast.makeText(this, "Sensor de Proximidad detectado", Toast.LENGTH_LONG).show();
        }

        disparadorEventoSensor = new SensorEventListener() {
            @Override
            public void onSensorChanged(SensorEvent sensorEvent) {
                //Colocar el codigo de lo que queremos que haga nuestra app
                // cuando se acerque o se aleje el objeto del sensor
                valor.setText("Valor: "+ sensorEvent.values[0]);
                if(sensorEvent.values[0] < miSensor.getMaximumRange()){
                    //Condicion para determinar cuando se acerque
                    // En tu actividad
                    ConstraintLayout layout = findViewById(R.id.layout);
                    layout.setBackgroundColor(Color.RED);
                    valor.setTextColor(Color.GREEN);
                    valor.setBackgroundColor(Color.BLACK);
                    valor.setText("Valor: "+ sensorEvent.values[0]);


                }else{
                    //Que es lo que va hacer cuando se aleje
                    ConstraintLayout layout = findViewById(R.id.layout);
                    layout.setBackgroundColor(Color.WHITE);
                    valor.setTextColor(Color.BLACK);
                    valor.setBackgroundColor(Color.WHITE);

                }
            }
            @Override
            public void onAccuracyChanged(Sensor sensor, int i) {

            }
        };
        iniciarSensor();
    }


    public void iniciarSensor(){
        administradorDeSensores.registerListener(disparadorEventoSensor,miSensor,(2000 *1000));
    }
    public void detenerSensor(){
        administradorDeSensores.unregisterListener(disparadorEventoSensor);
    }
    @Override
    protected void onPause() {
        detenerSensor();

        super.onPause();
    }
    @Override
    protected void onResume()
    {
        iniciarSensor();
        super.onResume();
    }
}