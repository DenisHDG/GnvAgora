package denisluizgonalves.gnvagora;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SplashScreen extends AppCompatActivity  implements Runnable {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        super.onCreate(savedInstanceState);

        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_splash_screen);
        Handler MainActivity = new Handler();
        MainActivity.postDelayed(SplashScreen.this, 1500);
    }

    @Override
    public void run() {
        startActivity(new Intent(SplashScreen.this, MainActivity.class));

        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        finish();
    }
}
