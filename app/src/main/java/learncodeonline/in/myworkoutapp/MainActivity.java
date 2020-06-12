package learncodeonline.in.myworkoutapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText set;
    Button startExercise;
    RadioGroup radioGroup;
    String mode="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        set = findViewById(R.id.set);
        set.setText("1");
        startExercise = findViewById(R.id.start);
        radioGroup = findViewById(R.id.radioGroup);

        startExercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main3Activity.class);
                String setValue = set.getText().toString();
                if (setValue.isEmpty()) {
                    set.setError("Please provide set");
                    return;
                }
                if (mode.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please select a mode", Toast.LENGTH_SHORT).show();
                    return;
                }
                intent.putExtra("setvalue", setValue);
                intent.putExtra("modevalue", mode);
                startActivity(intent);
            }
        });

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                switch (checkedId) {
                    case R.id.radioButton4:
                        mode = "day";
                        break;
                    case R.id.radioButton5:
                        mode = "random";
                        break;
                }
            }
        });

    }
}
