package jp.techacademy.hironori.nonaka.calcapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText text1,text2;
    double answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //足し算ボタン
        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);

        //引き算ボタン
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);

        //掛け算ボタン
        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);

        //割り算ボタン
        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(this);

        //テキスト1にインスタンスを代入
        this.text1 = (EditText) findViewById(R.id.editText1);

        //テキスト2にインスタンスを代入
        this.text2 = (EditText) findViewById(R.id.editText2);



    }





    @Override
    public void onClick(View v) {
        if(text1.length() == 0 || text2.length() == 0){
            //未入力処理



//            Log.d("UI-PARTS","ここが動いていますa");
//            Snackbar.make(v, "Replace with your own action", Snackbar.LENGTH_LONG)
//                    .setAction("Action", null).show();
//            Log.d("UI-PARTS","ここが動いていますb");





            final Snackbar snackbar = Snackbar.make(v, "文字を入力してください", Snackbar.LENGTH_SHORT);
            snackbar.getView().setBackgroundColor(Color.RED);
            snackbar.setActionTextColor(Color.WHITE);
            snackbar.setAction("確認", new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // setActionしたテキストがタップされたらここが実行
                }
            });
            snackbar.show();
        }

        
//        String t1 = text1.getText().toString();
//        double value1 = Double.parseDouble(t1);
//
//
//        String t2 = text2.getText().toString();
//        double value2 = Double.parseDouble(t2);
//
//        if (v.getId() == R.id.button1) {
//            this.answer = value1 + value2;
//        }
//        else  if (v.getId() == R.id.button2) {
//            this.answer = value1 - value2;
//        }
//
//        else  if (v.getId() == R.id.button3) {
//            this.answer = value1 * value2;
//        }
//
//        else  if (v.getId() == R.id.button4) {
//            this.answer = value1 / value2;
//
//        }


        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("VALUE", answer);
        startActivity(intent);
    }


}
