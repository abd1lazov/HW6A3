package kg.geektech.apptesting;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import kg.geektech.apptesting.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding ui;
    private Model model = new Model();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ui = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(ui.getRoot());

        ui.addBtn.setOnClickListener(v -> {
            int num1 = Integer.valueOf(ui.input1.getText().toString());
            int num2 = Integer.valueOf(ui.input2.getText().toString());
            ui.resultText.setText(String.valueOf(model.add(num1, num2)));

        });

        ui.subtractBtn.setOnClickListener(v -> {
            int num1 = Integer.valueOf(ui.input1.getText().toString());
            int num2 = Integer.valueOf(ui.input2.getText().toString());
            ui.resultText.setText(String.valueOf(model.subtract(num1, num2)));

        });

        ui.multiplyBtn.setOnClickListener(v -> {
            int num1 = Integer.valueOf(ui.input1.getText().toString());
            int num2 = Integer.valueOf(ui.input1.getText().toString());
            ui.resultText.setText(String.valueOf(model.multiply(num1, num2)));
        });

        ui.divBtn.setOnClickListener(v -> {
            int num1 = Integer.valueOf(ui.input1.getText().toString());
            int num2 = Integer.valueOf(ui.input2.getText().toString());
            ui.resultText.setText(String.valueOf(model.div(num1, num2)));

        });

    }
}