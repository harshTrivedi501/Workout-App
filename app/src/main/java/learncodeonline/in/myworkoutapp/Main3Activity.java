package learncodeonline.in.myworkoutapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Random;
import java.util.Set;

public class Main3Activity extends AppCompatActivity {

    ImageView imageView17, imageView18, imageView19, imageView20, imageView21;
    int a, b = 0, k;
    int numbers[] = new int[5];
    String dayOfWeek = "Monday";
    private Random myRandomNumber = new Random();
    Set<Integer> set = new LinkedHashSet<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        imageView17 = findViewById(R.id.imageView17);
        imageView18 = findViewById(R.id.imageView18);
        imageView19 = findViewById(R.id.imageView19);
        imageView20 = findViewById(R.id.imageView20);
        imageView21 = findViewById(R.id.imageView21);

        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        dayOfWeek = new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date.getTime());

        if (getIntent().getStringExtra("modevalue").equals("day")) {
            switch (dayOfWeek) {
                case "Monday":
                    Toast.makeText(this, "Selected Exercises based on MONDAY", Toast.LENGTH_SHORT).show();
                    for (int index = 0; index < 5; index++) {
                        numbers[index] = index;
                    }
                    break;
                case "Tuesday":
                    Toast.makeText(this, "Selected Exercises based on TUESDAY", Toast.LENGTH_SHORT).show();
                    for (int index = 0; index < 5; index++) {
                        numbers[index] = index + 5;
                    }
                    break;
                case "Wednesday":
                    Toast.makeText(this, "Selected Exercises based on WEDNESDAY", Toast.LENGTH_SHORT).show();
                    int index;
                    for (index = 0; index < 4; index++) {
                        numbers[index] = index + 10;
                    }
                    numbers[index] = 0;
                    break;
                case "Thursday":
                    Toast.makeText(this, "Selected Exercises based on THURSDAY", Toast.LENGTH_SHORT).show();
                    int odd = -1;
                    for (index = 0; index < 5; index++) {
                        numbers[index] = odd + 2;
                        odd = numbers[index];
                    }
                    break;
                case "Friday":
                    Toast.makeText(this, "Selected Exercises based on FRIDAY", Toast.LENGTH_SHORT).show();
                    int even = -2;
                    for (index = 0; index < 5; index++) {
                        numbers[index] = even + 2;
                        even = numbers[index];
                    }
                    break;
                case "Saturday":
                    Toast.makeText(this, "Selected Exercises based on SATURDAY", Toast.LENGTH_SHORT).show();
                    numbers[0] = 0;
                    numbers[1] = 4;
                    numbers[2] = 8;
                    numbers[3] = 9;
                    numbers[4] = 12;
                    break;
                case "Sunday":
                    Toast.makeText(this, "Selected Exercises based on SUNDAY", Toast.LENGTH_SHORT).show();
                    numbers[0] = 1;
                    numbers[1] = 5;
                    numbers[2] = 6;
                    numbers[3] = 9;
                    numbers[4] = 13;
                    break;
            }
        } else {
            Toast.makeText(this, "Randomly selected 5 exercises", Toast.LENGTH_SHORT).show();
            while (set.size() < 5) {
                set.add(myRandomNumber.nextInt(14));
            }
            Iterator<Integer> iterator = set.iterator();
            int i = 0;
            while (i < 5) {
                if (iterator.hasNext()) {
                    numbers[i] = iterator.next();
                }
                i++;
            }

        }
        k = Integer.parseInt(getIntent().getStringExtra("setvalue"));

        for (int i = 0; i < 5; i++) {
            a = numbers[i];

            switch (a) {
                case 0:
                    b = R.drawable.fourteen;
                    switch (i) {
                        case 0:
                            imageView17.setImageResource(b);
                            break;
                        case 1:
                            imageView18.setImageResource(b);
                            break;
                        case 2:
                            imageView19.setImageResource(b);
                            break;
                        case 3:
                            imageView20.setImageResource(b);
                            break;
                        case 4:
                            imageView21.setImageResource(b);
                            break;
                    }
                    break;
                case 1:
                    b = R.drawable.one;
                    switch (i) {
                        case 0:
                            imageView17.setImageResource(b);
                            break;
                        case 1:
                            imageView18.setImageResource(b);
                            break;
                        case 2:
                            imageView19.setImageResource(b);
                            break;
                        case 3:
                            imageView20.setImageResource(b);
                            break;
                        case 4:
                            imageView21.setImageResource(b);
                            break;
                    }
                    break;
                case 2:
                    b = R.drawable.two;
                    switch (i) {
                        case 0:
                            imageView17.setImageResource(b);
                            break;
                        case 1:
                            imageView18.setImageResource(b);
                            break;
                        case 2:
                            imageView19.setImageResource(b);
                            break;
                        case 3:
                            imageView20.setImageResource(b);
                            break;
                        case 4:
                            imageView21.setImageResource(b);
                            break;
                    }
                    break;
                case 3:
                    b = R.drawable.three;
                    switch (i) {
                        case 0:
                            imageView17.setImageResource(b);
                            break;
                        case 1:
                            imageView18.setImageResource(b);
                            break;
                        case 2:
                            imageView19.setImageResource(b);
                            break;
                        case 3:
                            imageView20.setImageResource(b);
                            break;
                        case 4:
                            imageView21.setImageResource(b);
                            break;
                    }
                    break;
                case 4:
                    b = R.drawable.four;
                    switch (i) {
                        case 0:
                            imageView17.setImageResource(b);
                            break;
                        case 1:
                            imageView18.setImageResource(b);
                            break;
                        case 2:
                            imageView19.setImageResource(b);
                            break;
                        case 3:
                            imageView20.setImageResource(b);
                            break;
                        case 4:
                            imageView21.setImageResource(b);
                            break;
                    }
                    break;
                case 5:
                    b = R.drawable.five;
                    switch (i) {
                        case 0:
                            imageView17.setImageResource(b);
                            break;
                        case 1:
                            imageView18.setImageResource(b);
                            break;
                        case 2:
                            imageView19.setImageResource(b);
                            break;
                        case 3:
                            imageView20.setImageResource(b);
                            break;
                        case 4:
                            imageView21.setImageResource(b);
                            break;
                    }
                    break;
                case 6:
                    b = R.drawable.six;
                    switch (i) {
                        case 0:
                            imageView17.setImageResource(b);
                            break;
                        case 1:
                            imageView18.setImageResource(b);
                            break;
                        case 2:
                            imageView19.setImageResource(b);
                            break;
                        case 3:
                            imageView20.setImageResource(b);
                            break;
                        case 4:
                            imageView21.setImageResource(b);
                            break;
                    }
                    break;
                case 7:
                    b = R.drawable.seven;
                    switch (i) {
                        case 0:
                            imageView17.setImageResource(b);
                            break;
                        case 1:
                            imageView18.setImageResource(b);
                            break;
                        case 2:
                            imageView19.setImageResource(b);
                            break;
                        case 3:
                            imageView20.setImageResource(b);
                            break;
                        case 4:
                            imageView21.setImageResource(b);
                            break;
                    }
                    break;
                case 8:
                    b = R.drawable.eight;
                    switch (i) {
                        case 0:
                            imageView17.setImageResource(b);
                            break;
                        case 1:
                            imageView18.setImageResource(b);
                            break;
                        case 2:
                            imageView19.setImageResource(b);
                            break;
                        case 3:
                            imageView20.setImageResource(b);
                            break;
                        case 4:
                            imageView21.setImageResource(b);
                            break;
                    }
                    break;
                case 9:
                    b = R.drawable.nine;
                    switch (i) {
                        case 0:
                            imageView17.setImageResource(b);
                            break;
                        case 1:
                            imageView18.setImageResource(b);
                            break;
                        case 2:
                            imageView19.setImageResource(b);
                            break;
                        case 3:
                            imageView20.setImageResource(b);
                            break;
                        case 4:
                            imageView21.setImageResource(b);
                            break;
                    }
                    break;
                case 10:
                    b = R.drawable.ten;
                    switch (i) {
                        case 0:
                            imageView17.setImageResource(b);
                            break;
                        case 1:
                            imageView18.setImageResource(b);
                            break;
                        case 2:
                            imageView19.setImageResource(b);
                            break;
                        case 3:
                            imageView20.setImageResource(b);
                            break;
                        case 4:
                            imageView21.setImageResource(b);
                            break;
                    }
                    break;
                case 11:
                    b = R.drawable.eleven;
                    switch (i) {
                        case 0:
                            imageView17.setImageResource(b);
                            break;
                        case 1:
                            imageView18.setImageResource(b);
                            break;
                        case 2:
                            imageView19.setImageResource(b);
                            break;
                        case 3:
                            imageView20.setImageResource(b);
                            break;
                        case 4:
                            imageView21.setImageResource(b);
                            break;
                    }
                    break;
                case 12:
                    b = R.drawable.twelve;
                    switch (i) {
                        case 0:
                            imageView17.setImageResource(b);
                            break;
                        case 1:
                            imageView18.setImageResource(b);
                            break;
                        case 2:
                            imageView19.setImageResource(b);
                            break;
                        case 3:
                            imageView20.setImageResource(b);
                            break;
                        case 4:
                            imageView21.setImageResource(b);
                            break;
                    }
                    break;
                case 13:
                    b = R.drawable.thirteen;
                    switch (i) {
                        case 0:
                            imageView17.setImageResource(b);
                            break;
                        case 1:
                            imageView18.setImageResource(b);
                            break;
                        case 2:
                            imageView19.setImageResource(b);
                            break;
                        case 3:
                            imageView20.setImageResource(b);
                            break;
                        case 4:
                            imageView21.setImageResource(b);
                            break;
                    }
                    break;
            }
        }
    }

    public void whenclickedforstart(View view) {
        Intent intent = new Intent(Main3Activity.this, Main2Activity.class);

        Bundle bundle = new Bundle();
        bundle.putString("setvalue", "" + k);
        bundle.putString("random1", "" + numbers[0]);
        bundle.putString("random2", "" + numbers[1]);
        bundle.putString("random3", "" + numbers[2]);
        bundle.putString("random4", "" + numbers[3]);
        bundle.putString("random5", "" + numbers[4]);

        intent.putExtras(bundle);

        startActivity(intent);
    }
}
