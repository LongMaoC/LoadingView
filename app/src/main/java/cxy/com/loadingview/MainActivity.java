package cxy.com.loadingview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import cxy.com.loadviewlib.LoadingView;

public class MainActivity extends AppCompatActivity {
    private LoadingView loadingview;
    private Button btnStart;
    private Button btnStop;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadingview = (LoadingView) findViewById(R.id.loadingview);

        btnStart = (Button) findViewById(R.id.btn_start);
        btnStop = (Button) findViewById(R.id.btn_stop);

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadingview.start();
            }
        });
        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadingview.stop();
            }
        });



    }
}
