package com.example.lumiproxi;

import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LuminucidadActivity extends AppCompatActivity {

    Button boton;
    TextView val;
    private SensorManager sensorManager;
    SensorEventListener disparadorEventoSensor;

    private Sensor sensorLuminosidad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luminucidad);

        boton = findViewById(R.id.button);
        val = findViewById(R.id.valorr);

        // Inicializar el SensorManager
        sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);

        // Obtener el sensor de luminosidad
        sensorLuminosidad = sensorManager.getDefaultSensor(Sensor.TYPE_LIGHT);

        disparadorEventoSensor = new SensorEventListener() {

            @Override
            public void onSensorChanged(SensorEvent sensorEvent) {
                // Colocar el código de lo que queremos que haga nuestra app
                // cuando cambie el valor del sensor de luminosidad
                String msj = String.valueOf(sensorEvent.values[0]);
                if (sensorEvent.values[0] < sensorLuminosidad.getMaximumRange()) {
                    // Condición para determinar cuando el valor es menor al rango máximo del sensor
                    val.setText("Valor: " + sensorEvent.values[0]);
                } else {
                    // Cuando el valor está fuera del rango
                    val.setText("fuera de rango");
                }

                boton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        enviarMensajeWhatsApp(msj);
                    }
                });
            }

            @Override
            public void onAccuracyChanged(Sensor sensor, int i) {
                // No necesitas hacer nada en este método para el sensor de luz
            }

        };

        iniciarSensor();


    }

    public void iniciarSensor() {
        // Verificar si el sensor de luminosidad está disponible antes de registrarlo
        if (sensorLuminosidad != null) {
            sensorManager.registerListener(disparadorEventoSensor, sensorLuminosidad, SensorManager.SENSOR_DELAY_NORMAL);
        }
    }

    public void detenerSensor() {
        // Desregistrar el listener del sensor
        sensorManager.unregisterListener(disparadorEventoSensor);
    }

    @Override
    protected void onPause() {
        // Detener el sensor cuando la actividad está en pausa
        detenerSensor();
        super.onPause();
    }

    @Override
    protected void onResume() {
        // Iniciar el sensor cuando la actividad se reanuda
        iniciarSensor();
        super.onResume();
    }

    public void enviarMensajeWhatsApp(String mensaje) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, mensaje);
        intent.setPackage("com.whatsapp");

        try {
            startActivity(intent);
        } catch (android.content.ActivityNotFoundException ex) {
            // Manejar la excepción si WhatsApp no está instalado
            Toast.makeText(this, "WhatsApp no está instalado.", Toast.LENGTH_SHORT).show();
        }
    }

}
