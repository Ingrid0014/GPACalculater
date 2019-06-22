package cn.edu.swufe.gpacalculate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String a1="0";
    String a2="0";
    String a3="0";
    String a4="0";
    String a5="0";
    String b1="0";
    String b2="0";
    String b3="0";
    String b4="0";
    String b5="0";
    String c1="0";
    String c2="0";
    String c3="0";
    String c4="0";
    String c5="0";
    String d1="0";
    String d2="0";
    String d3="0";
    String d4="0";
    String d5="0";
    int aa=Integer.parseInt(a1);
    int ab=Integer.parseInt(a2);
    int ac=Integer.parseInt(a3);
    int ad=Integer.parseInt(a4);
    int ae=Integer.parseInt(a5);
    int ba=Integer.parseInt(b1);
    int bb=Integer.parseInt(b2);
    int bc=Integer.parseInt(b3);
    int bd=Integer.parseInt(b4);
    int be=Integer.parseInt(b5);
    int ca=Integer.parseInt(c1);
    int cb=Integer.parseInt(c2);
    int cc=Integer.parseInt(c3);
    int cd=Integer.parseInt(c4);
    int ce=Integer.parseInt(c5);
    int da=Integer.parseInt(d1);
    int db=Integer.parseInt(d2);
    int dc=Integer.parseInt(d3);
    int dd=Integer.parseInt(d4);
    int de=Integer.parseInt(d5);
    int finalResult=(int)((4*(aa+ab+ac+ad+ae)+2*(ba+bb+bc+bd+be)+1*(ca+cb+cc+cd+ce)+0.5*(da+db+dc+dd+de))/37.5);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(getIntent().getStringExtra("a1")!=null)
        a1 = getIntent().getStringExtra("a1");
        Toast.makeText(MainActivity.this, a1, Toast.LENGTH_LONG).show();
        if(getIntent().getStringExtra("a2")!=null)
        a2 = getIntent().getStringExtra("a2");
        Toast.makeText(MainActivity.this, a1, Toast.LENGTH_LONG).show();
        if(getIntent().getStringExtra("a3")!=null)
        a3 = getIntent().getStringExtra("a3");
        Toast.makeText(MainActivity.this, a1, Toast.LENGTH_LONG).show();
        if(getIntent().getStringExtra("a4")!=null)
        a4 = getIntent().getStringExtra("a4");
        Toast.makeText(MainActivity.this, a1, Toast.LENGTH_LONG).show();
        if(getIntent().getStringExtra("a5")!=null)
        a5 = getIntent().getStringExtra("a5");
        Toast.makeText(MainActivity.this, a1, Toast.LENGTH_LONG).show();
        if(getIntent().getStringExtra("b1")!=null)
        b1 = getIntent().getStringExtra("b1");
        Toast.makeText(MainActivity.this, a1, Toast.LENGTH_LONG).show();
        if(getIntent().getStringExtra("b2")!=null)
        b2 = getIntent().getStringExtra("b2");
        Toast.makeText(MainActivity.this, a1, Toast.LENGTH_LONG).show();
        if(getIntent().getStringExtra("b3")!=null)
        b3 = getIntent().getStringExtra("b3");
        Toast.makeText(MainActivity.this, a1, Toast.LENGTH_LONG).show();
        if(getIntent().getStringExtra("b4")!=null)
        b4 = getIntent().getStringExtra("b4");
        Toast.makeText(MainActivity.this, a1, Toast.LENGTH_LONG).show();
        if(getIntent().getStringExtra("b5")!=null)
        b5 = getIntent().getStringExtra("b5");
        Toast.makeText(MainActivity.this, a1, Toast.LENGTH_LONG).show();
        if(getIntent().getStringExtra("c1")!=null)
        c1 = getIntent().getStringExtra("c1");
        Toast.makeText(MainActivity.this, a1, Toast.LENGTH_LONG).show();
        if(getIntent().getStringExtra("c2")!=null)
        c2 = getIntent().getStringExtra("c2");
        Toast.makeText(MainActivity.this, a1, Toast.LENGTH_LONG).show();
        if(getIntent().getStringExtra("c3")!=null)
        c3 = getIntent().getStringExtra("c3");
        Toast.makeText(MainActivity.this, a1, Toast.LENGTH_LONG).show();
        if(getIntent().getStringExtra("c4")!=null)
        c4 = getIntent().getStringExtra("c4");
        Toast.makeText(MainActivity.this, a1, Toast.LENGTH_LONG).show();
        if(getIntent().getStringExtra("c5")!=null)
        c5 = getIntent().getStringExtra("c5");
        Toast.makeText(MainActivity.this, a1, Toast.LENGTH_LONG).show();
        if(getIntent().getStringExtra("d1")!=null)
        d1 = getIntent().getStringExtra("d1");
        Toast.makeText(MainActivity.this, a1, Toast.LENGTH_LONG).show();
        if(getIntent().getStringExtra("d2")!=null)
        d2 = getIntent().getStringExtra("d2");
        Toast.makeText(MainActivity.this, a1, Toast.LENGTH_LONG).show();
        if(getIntent().getStringExtra("d3")!=null)
        d3 = getIntent().getStringExtra("d3");
        Toast.makeText(MainActivity.this, a1, Toast.LENGTH_LONG).show();
        if(getIntent().getStringExtra("d4")!=null)
       d4 = getIntent().getStringExtra("d4");
        Toast.makeText(MainActivity.this, a1, Toast.LENGTH_LONG).show();
        if(getIntent().getStringExtra("d5")!=null)
        d5 = getIntent().getStringExtra("d5");
        Toast.makeText(MainActivity.this, a1, Toast.LENGTH_LONG).show();

    }
    public void opena(View btn){
        Log.i("open","opena")  ;
        Intent open1=new Intent(this,a.class);
        startActivity(open1);

    }
    public void openb(View btn){
        Log.i("open","openb")  ;
        Intent open2=new Intent(this,b.class);
        startActivity(open2);

    }
    public void openc(View btn){
        Log.i("open","openc")  ;
        Intent open3=new Intent(this,c.class);
        startActivity(open3);

    }
    public void opend(View btn){
        Log.i("open","opend")  ;
        Intent open4=new Intent(this,d.class);
        startActivity(open4);

    }
    public void openfinal(View btn){
        Log.i("open","openf")  ;
        Intent open=new Intent(this,finalactivity.class);
        open.putExtra("final",finalResult);
        startActivity(open);

    }

}
