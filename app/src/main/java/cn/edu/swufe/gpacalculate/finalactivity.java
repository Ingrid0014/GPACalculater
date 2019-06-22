package cn.edu.swufe.gpacalculate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class finalactivity extends AppCompatActivity {
    int final1=0;
    TextView show;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finalactivity);
            final1 = getIntent().getIntExtra("final",0);
            show=(TextView)findViewById(R.id.title2);
            show.setText(final1);
    }


    public void open(View btn){
        Log.i("open","open")  ;
        Intent open=new Intent(this,MainView.class);
        startActivity(open);





}}
