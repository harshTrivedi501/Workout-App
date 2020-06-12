package learncodeonline.in.myworkoutapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;

public class Main2Activity extends AppCompatActivity {


    TextView timer, starthelper;
    TextView set;
    ImageView imageView;
    MediaPlayer mediaPlayer;
    ArrayList<Integer> list = new ArrayList<>();
    ArrayList<Integer> timerList = new ArrayList<>();
    int k, i = 0, j = 1, a, b, countDownTime, countDownTimeOffset = 0;
    boolean endOfActivity;
    int numbers[] = new int[5];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        timer = findViewById(R.id.timer);
        set = findViewById(R.id.set);
        imageView = findViewById(R.id.imageView);
        starthelper = findViewById(R.id.starthelper);

        k = Integer.parseInt(getIntent().getStringExtra("setvalue"));
        numbers[0] = Integer.parseInt(getIntent().getStringExtra("random1"));
        numbers[1] = Integer.parseInt(getIntent().getStringExtra("random2"));
        numbers[2] = Integer.parseInt(getIntent().getStringExtra("random3"));
        numbers[3] = Integer.parseInt(getIntent().getStringExtra("random4"));
        numbers[4] = Integer.parseInt(getIntent().getStringExtra("random5"));
        set.setText("SET: " + k);

        for (int i = 0; i < 5; i++) {
            list.add(i);
            timerList.add((countDownTimeOffset + 5) * 1000);
            countDownTimeOffset += 5;
        }

        Collections.shuffle(list);
        Collections.shuffle(timerList);

        System.out.println(timerList);
        starter();
    }

    private void starter() {
        mediaPlayer = MediaPlayer.create(this, R.raw.audio1); //Just a dummy media setting otherwise mediaplayer.stop in onstop method will throw nullpointer exception
        new CountDownTimer(4000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                starthelper.setText("" + String.valueOf(millisUntilFinished / 1000));
            }

            @Override
            public void onFinish() {
                if (!endOfActivity) {
                    starthelper.setText("");
                    work();
                }
            }
        }.start();
    }

    public void work() {

        a = numbers[i];

        switch (a) {
            case 0:
                b = R.drawable.fourteen;
                switch (list.get(i)) {
                    case 0:
                        mediaPlayer = MediaPlayer.create(this, R.raw.audio1);
                        countDownTime = timerList.get(i);
                        break;
                    case 1:
                        mediaPlayer = MediaPlayer.create(this, R.raw.audio2);
                        countDownTime = timerList.get(i);
                        break;
                    case 2:
                        mediaPlayer = MediaPlayer.create(this, R.raw.audio3);
                        countDownTime = timerList.get(i);
                        break;
                    case 3:
                        mediaPlayer = MediaPlayer.create(this, R.raw.audio4);
                        countDownTime = timerList.get(i);
                        break;
                    case 4:
                        mediaPlayer = MediaPlayer.create(this, R.raw.rock);
                        countDownTime = timerList.get(i);
                        break;
                }
                break;
            case 1:
                b = R.drawable.one;
                switch (list.get(i)) {
                    case 0:
                        mediaPlayer = MediaPlayer.create(this, R.raw.audio1);
                        countDownTime = timerList.get(i);
                        break;
                    case 1:
                        mediaPlayer = MediaPlayer.create(this, R.raw.audio2);
                        countDownTime = timerList.get(i);
                        break;
                    case 2:
                        mediaPlayer = MediaPlayer.create(this, R.raw.audio3);
                        countDownTime = timerList.get(i);
                        break;
                    case 3:
                        mediaPlayer = MediaPlayer.create(this, R.raw.audio4);
                        countDownTime = timerList.get(i);
                        break;
                    case 4:
                        mediaPlayer = MediaPlayer.create(this, R.raw.rock);
                        countDownTime = timerList.get(i);
                        break;
                }
                break;
            case 2:
                b = R.drawable.two;
                switch (list.get(i)) {
                    case 0:
                        mediaPlayer = MediaPlayer.create(this, R.raw.audio1);
                        countDownTime = timerList.get(i);
                        break;
                    case 1:
                        mediaPlayer = MediaPlayer.create(this, R.raw.audio2);
                        countDownTime = timerList.get(i);
                        break;
                    case 2:
                        mediaPlayer = MediaPlayer.create(this, R.raw.audio3);
                        countDownTime = timerList.get(i);
                        break;
                    case 3:
                        mediaPlayer = MediaPlayer.create(this, R.raw.audio4);
                        countDownTime = timerList.get(i);
                        break;
                    case 4:
                        mediaPlayer = MediaPlayer.create(this, R.raw.rock);
                        countDownTime = timerList.get(i);
                        break;
                }
                break;
            case 3:
                b = R.drawable.three;
                switch (list.get(i)) {
                    case 0:
                        mediaPlayer = MediaPlayer.create(this, R.raw.audio1);
                        countDownTime = timerList.get(i);
                        break;
                    case 1:
                        mediaPlayer = MediaPlayer.create(this, R.raw.audio2);
                        countDownTime = timerList.get(i);
                        break;
                    case 2:
                        mediaPlayer = MediaPlayer.create(this, R.raw.audio3);
                        countDownTime = timerList.get(i);
                        break;
                    case 3:
                        mediaPlayer = MediaPlayer.create(this, R.raw.audio4);
                        countDownTime = timerList.get(i);
                        break;
                    case 4:
                        mediaPlayer = MediaPlayer.create(this, R.raw.rock);
                        countDownTime = timerList.get(i);
                        break;
                }
                break;
            case 4:
                b = R.drawable.four;
                switch (list.get(i)) {
                    case 0:
                        mediaPlayer = MediaPlayer.create(this, R.raw.audio1);
                        countDownTime = timerList.get(i);
                        break;
                    case 1:
                        mediaPlayer = MediaPlayer.create(this, R.raw.audio2);
                        countDownTime = timerList.get(i);
                        break;
                    case 2:
                        mediaPlayer = MediaPlayer.create(this, R.raw.audio3);
                        countDownTime = timerList.get(i);
                        break;
                    case 3:
                        mediaPlayer = MediaPlayer.create(this, R.raw.audio4);
                        countDownTime = timerList.get(i);
                        break;
                    case 4:
                        mediaPlayer = MediaPlayer.create(this, R.raw.rock);
                        countDownTime = timerList.get(i);
                        break;
                }
                break;
            case 5:
                b = R.drawable.five;
                switch (list.get(i)) {
                    case 0:
                        mediaPlayer = MediaPlayer.create(this, R.raw.audio1);
                        countDownTime = timerList.get(i);
                        break;
                    case 1:
                        mediaPlayer = MediaPlayer.create(this, R.raw.audio2);
                        countDownTime = timerList.get(i);
                        break;
                    case 2:
                        mediaPlayer = MediaPlayer.create(this, R.raw.audio3);
                        countDownTime = timerList.get(i);
                        break;
                    case 3:
                        mediaPlayer = MediaPlayer.create(this, R.raw.audio4);
                        countDownTime = timerList.get(i);
                        break;
                    case 4:
                        mediaPlayer = MediaPlayer.create(this, R.raw.rock);
                        countDownTime = timerList.get(i);
                        break;
                }
                break;
            case 6:
                b = R.drawable.six;
                switch (list.get(i)) {
                    case 0:
                        mediaPlayer = MediaPlayer.create(this, R.raw.audio1);
                        countDownTime = timerList.get(i);
                        break;
                    case 1:
                        mediaPlayer = MediaPlayer.create(this, R.raw.audio2);
                        countDownTime = timerList.get(i);
                        break;
                    case 2:
                        mediaPlayer = MediaPlayer.create(this, R.raw.audio3);
                        countDownTime = timerList.get(i);
                        break;
                    case 3:
                        mediaPlayer = MediaPlayer.create(this, R.raw.audio4);
                        countDownTime = timerList.get(i);
                        break;
                    case 4:
                        mediaPlayer = MediaPlayer.create(this, R.raw.rock);
                        countDownTime = timerList.get(i);
                        break;
                }
                break;
            case 7:
                b = R.drawable.seven;
                switch (list.get(i)) {
                    case 0:
                        mediaPlayer = MediaPlayer.create(this, R.raw.audio1);
                        countDownTime = timerList.get(i);
                        break;
                    case 1:
                        mediaPlayer = MediaPlayer.create(this, R.raw.audio2);
                        countDownTime = timerList.get(i);
                        break;
                    case 2:
                        mediaPlayer = MediaPlayer.create(this, R.raw.audio3);
                        countDownTime = timerList.get(i);
                        break;
                    case 3:
                        mediaPlayer = MediaPlayer.create(this, R.raw.audio4);
                        countDownTime = timerList.get(i);
                        break;
                    case 4:
                        mediaPlayer = MediaPlayer.create(this, R.raw.rock);
                        countDownTime = timerList.get(i);
                        break;
                }
                break;
            case 8:
                b = R.drawable.eight;
                switch (list.get(i)) {
                    case 0:
                        mediaPlayer = MediaPlayer.create(this, R.raw.audio1);
                        countDownTime = timerList.get(i);
                        break;
                    case 1:
                        mediaPlayer = MediaPlayer.create(this, R.raw.audio2);
                        countDownTime = timerList.get(i);
                        break;
                    case 2:
                        mediaPlayer = MediaPlayer.create(this, R.raw.audio3);
                        countDownTime = timerList.get(i);
                        break;
                    case 3:
                        mediaPlayer = MediaPlayer.create(this, R.raw.audio4);
                        countDownTime = timerList.get(i);
                        break;
                    case 4:
                        mediaPlayer = MediaPlayer.create(this, R.raw.rock);
                        countDownTime = timerList.get(i);
                        break;
                }
                break;
            case 9:
                b = R.drawable.nine;
                switch (list.get(i)) {
                    case 0:
                        mediaPlayer = MediaPlayer.create(this, R.raw.audio1);
                        countDownTime = timerList.get(i);
                        break;
                    case 1:
                        mediaPlayer = MediaPlayer.create(this, R.raw.audio2);
                        countDownTime = timerList.get(i);
                        break;
                    case 2:
                        mediaPlayer = MediaPlayer.create(this, R.raw.audio3);
                        countDownTime = timerList.get(i);
                        break;
                    case 3:
                        mediaPlayer = MediaPlayer.create(this, R.raw.audio4);
                        countDownTime = timerList.get(i);
                        break;
                    case 4:
                        mediaPlayer = MediaPlayer.create(this, R.raw.rock);
                        countDownTime = timerList.get(i);
                        break;
                }
                break;
            case 10:
                b = R.drawable.ten;
                switch (list.get(i)) {
                    case 0:
                        mediaPlayer = MediaPlayer.create(this, R.raw.audio1);
                        countDownTime = timerList.get(i);
                        break;
                    case 1:
                        mediaPlayer = MediaPlayer.create(this, R.raw.audio2);
                        countDownTime = timerList.get(i);
                        break;
                    case 2:
                        mediaPlayer = MediaPlayer.create(this, R.raw.audio3);
                        countDownTime = timerList.get(i);
                        break;
                    case 3:
                        mediaPlayer = MediaPlayer.create(this, R.raw.audio4);
                        countDownTime = timerList.get(i);
                        break;
                    case 4:
                        mediaPlayer = MediaPlayer.create(this, R.raw.rock);
                        countDownTime = timerList.get(i);
                        break;
                }
                break;
            case 11:
                b = R.drawable.eleven;
                switch (list.get(i)) {
                    case 0:
                        mediaPlayer = MediaPlayer.create(this, R.raw.audio1);
                        countDownTime = timerList.get(i);
                        break;
                    case 1:
                        mediaPlayer = MediaPlayer.create(this, R.raw.audio2);
                        countDownTime = timerList.get(i);
                        break;
                    case 2:
                        mediaPlayer = MediaPlayer.create(this, R.raw.audio3);
                        countDownTime = timerList.get(i);
                        break;
                    case 3:
                        mediaPlayer = MediaPlayer.create(this, R.raw.audio4);
                        countDownTime = timerList.get(i);
                        break;
                    case 4:
                        mediaPlayer = MediaPlayer.create(this, R.raw.rock);
                        countDownTime = timerList.get(i);
                        break;
                }
                break;
            case 12:
                b = R.drawable.twelve;
                switch (list.get(i)) {
                    case 0:
                        mediaPlayer = MediaPlayer.create(this, R.raw.audio1);
                        countDownTime = timerList.get(i);
                        break;
                    case 1:
                        mediaPlayer = MediaPlayer.create(this, R.raw.audio2);
                        countDownTime = timerList.get(i);
                        break;
                    case 2:
                        mediaPlayer = MediaPlayer.create(this, R.raw.audio3);
                        countDownTime = timerList.get(i);
                        break;
                    case 3:
                        mediaPlayer = MediaPlayer.create(this, R.raw.audio4);
                        countDownTime = timerList.get(i);
                        break;
                    case 4:
                        mediaPlayer = MediaPlayer.create(this, R.raw.rock);
                        countDownTime = timerList.get(i);
                        break;
                }
                break;
            case 13:
                b = R.drawable.thirteen;
                switch (list.get(i)) {
                    case 0:
                        mediaPlayer = MediaPlayer.create(this, R.raw.audio1);
                        countDownTime = timerList.get(i);
                        break;
                    case 1:
                        mediaPlayer = MediaPlayer.create(this, R.raw.audio2);
                        countDownTime = timerList.get(i);
                        break;
                    case 2:
                        mediaPlayer = MediaPlayer.create(this, R.raw.audio3);
                        countDownTime = timerList.get(i);
                        break;
                    case 3:
                        mediaPlayer = MediaPlayer.create(this, R.raw.audio4);
                        countDownTime = timerList.get(i);
                        break;
                    case 4:
                        mediaPlayer = MediaPlayer.create(this, R.raw.rock);
                        countDownTime = timerList.get(i);
                        break;
                }
                break;
        }

        imageView.setImageResource(b);
        new CountDownTimer(countDownTime, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                mediaPlayer.start();
                mediaPlayer.setLooping(true);
                timer.setText("Time : " + String.valueOf(millisUntilFinished / 1000));
            }

            @Override
            public void onFinish() {
                i++;
                if (i == 5) {
                    if (k == 1) {
                        mediaPlayer.pause();
                        imageView.setImageResource(R.drawable.done);
                    } else {
                        if (!endOfActivity) {
                            k--;
                            i = 0;
                            set.setText("SET: " + k);
                            mediaPlayer.pause();
                            Toast.makeText(Main2Activity.this, "Let's take a break", Toast.LENGTH_SHORT).show();
                            takeABreak();
                        }
                    }

                } else {
                    if (!endOfActivity) {
                        mediaPlayer.pause();
                        Toast.makeText(Main2Activity.this, "Let's take a break", Toast.LENGTH_SHORT).show();
                        takeABreak();
                    }
                }
            }
        }.start();
    }

    public void takeABreak() {
        new CountDownTimer(2000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                timer.setText("Time : " + String.valueOf(millisUntilFinished / 1000));
            }

            @Override
            public void onFinish() {
                if (!endOfActivity) {
                    work();
                }
            }
        }.start();
    }

    @Override
    protected void onStop() {
        super.onStop();
        endOfActivity = true;
        mediaPlayer.stop();
        finish();
    }

}
