package cn.edu.swufe.gpacalculate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class d extends AppCompatActivity {
    EditText d1;
    EditText d2;
    EditText d3;
    EditText d4;
    EditText d5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d);
        d1=findViewById(R.id.d1);
        d2=findViewById(R.id.d2);
        d3=findViewById(R.id.d3);
        d4=findViewById(R.id.d4);
        d5=findViewById(R.id.d5);
    }
    public void open(View btn){
        Log.i("open","open")  ;
        Intent open=new Intent(this,MainActivity.class);
        open.putExtra("d1",d1.getText().toString());
        open.putExtra("d2",d2.getText().toString());
        open.putExtra("d3",d3.getText().toString());
        open.putExtra("d4",d4.getText().toString());
        open.putExtra("d5",d5.getText().toString());
        startActivity(open);}
}
