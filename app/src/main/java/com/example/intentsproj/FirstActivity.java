package com.example.intentsproj;
import android.view.Gravity;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_activity);

        Button ok = findViewById(R.id.ok_btn);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                Bundle extr = new Bundle();

                EditText value1 = (EditText) findViewById(R.id.no1);
                String Num1 = value1.getText().toString();
                EditText value2 = (EditText) findViewById(R.id.no2);
                String Num2 = value2.getText().toString();

                extr.putInt("Num1", Integer.parseInt(Num1));
                extr.putInt("Num2", Integer.parseInt(Num2));

                intent.putExtras(extr);

                Context context = getApplicationContext();

                CharSequence message = "You just clicked the OK button";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, message, duration);
                toast.setGravity(Gravity.BOTTOM|Gravity.CENTER, 0, 0);

                toast.show();

                startActivity(intent);
            }
        });
    }
}
