package cn.edu.swufe.gpacalculate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class c extends AppCompatActivity {

    EditText c1;
    EditText c2;
    EditText c3;
    EditText c4;
    EditText c5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);
        c1=findViewById(R.id.c1);
        c2=findViewById(R.id.c2);
        c3=findViewById(R.id.c3);
        c4=findViewById(R.id.c4);
        c5=findViewById(R.id.c5);
    }
    public void open(View btn){
        Log.i("open","open")  ;
        Intent open=new Intent(this,MainActivity.class);
        open.putExtra("c1",c1.getText().toString());
        open.putExtra("c2",c2.getText().toString());
        open.putExtra("c3",c3.getText().toString());
        open.putExtra("c4",c4.getText().toString());
        open.putExtra("c5",c5.getText().toString());
        startActivity(open);}
}
