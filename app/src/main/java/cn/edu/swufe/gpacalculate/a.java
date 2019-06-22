package cn.edu.swufe.gpacalculate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class a extends AppCompatActivity {


    EditText a1;
    EditText a2;
    EditText a3;
    EditText a4;
    EditText a5;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        a1=findViewById(R.id.a1);
        a2=findViewById(R.id.a2);
        a3=findViewById(R.id.a3);
        a4=findViewById(R.id.a4);
        a5=findViewById(R.id.a5);

    }
    public void open(View btn){
        Log.i("open","open")  ;
        Intent open=new Intent(this,MainActivity.class);
        open.putExtra("a1",a1.getText().toString());
        open.putExtra("a2",a2.getText().toString());
        open.putExtra("a3",a3.getText().toString());
        open.putExtra("a4",a4.getText().toString());
        open.putExtra("a5",a5.getText().toString());
        startActivity(open);
    }

}

