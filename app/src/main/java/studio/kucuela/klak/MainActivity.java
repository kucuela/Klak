package studio.kucuela.klak;


import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) this.findViewById(R.id.button3);
        final MediaPlayer mp1 = MediaPlayer.create(this, R.raw.krk);

        btn.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {

                mp1.start();
                Intent i = new Intent(MainActivity.this, FullscreenActivity.class);
                startActivity(i);






            }

        });
    }


}
