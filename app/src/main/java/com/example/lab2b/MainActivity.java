package com.example.lab2b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.example.lab2b.databinding.ActivityMainBinding;

import java.math.BigDecimal;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
    }

    public void onClick(View view) {
        EditText editFahr = binding.editFahrenheit;
        EditText editCels = binding.editCelsius;

        String fahr = editFahr.getText().toString();
        String cels = editCels.getText().toString();

        boolean hasFahr = !fahr.isEmpty();
        boolean hasCels = !cels.isEmpty();

        // default convert
        if (hasFahr) {
            try {
                editCels.setText(TemperatureConverter.fahrenheitToCelcius(Double.valueOf(fahr)));
            }
            catch (NumberFormatException nfe) { }
        }
        else if (hasCels) {
            try {
                editFahr.setText(TemperatureConverter.celciusToFahrenheit(Double.valueOf(cels)));
            }
            catch (NumberFormatException nfe) { }
        }

    }
}