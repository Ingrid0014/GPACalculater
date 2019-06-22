package cn.edu.swufe.gpacalculate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class b extends AppCompatActivity {
    EditText b1;
    EditText b2;
    EditText b3;
    EditText b4;
    EditText b5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
    }
    public void open(View btn){
        Log.i("open","open")  ;
        Intent open=new Intent(this,MainActivity.class);
        open.putExtra("b1",b1.getText().toString());
        open.putExtra("b2",b2.getText().toString());
        open.putExtra("b3",b3.getText().toString());
        open.putExtra("b4",b4.getText().toString());
        open.putExtra("b5",b5.getText().toString());
        startActivity(open);}
}
