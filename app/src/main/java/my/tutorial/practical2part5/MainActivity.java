package my.tutorial.practical2part5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText editTextValue1;
    TextView msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        msg = findViewById(R.id.areaCalculator);
        editTextValue1 = findViewById(R.id.editText1);
    }

    public void button2Click(View view)
    {
        Double radius = 0.0;

        if(editTextValue1.getText().toString() == null || editTextValue1.getText().toString().equals(""))
        {
            Toast.makeText(getApplicationContext(),
                    "Please enter number.", Toast.LENGTH_SHORT).show();
            msg.setText("");
        }
        else
        {
            try
            {
                radius = Double.parseDouble(editTextValue1.getText().toString());

            }
            catch(NumberFormatException e)
            {

            }
            Double areaOfCircle = Math.PI * radius * radius;
            msg.setText(areaOfCircle.toString() + "cm^2");
        }


    }
}