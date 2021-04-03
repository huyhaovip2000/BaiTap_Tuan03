package com.example.baitap_tuan03;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    Button btnXong,btnXanhDam,btnDo,btnBac,btnDen;
    ImageView imageView6, imageView;
    TextView txt_Mau, txt_Gia, txt_Ti;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_02);
        btnXong = findViewById(R.id.button8);
        txt_Mau = findViewById(R.id.txt_color);
        txt_Gia = findViewById(R.id.txt_Gia);
        txt_Ti = findViewById(R.id.txt_Tiki);
        btnBac = findViewById(R.id.btn_bac);
        btnDo = findViewById(R.id.btn_do);
        btnXanhDam = findViewById(R.id.btn_blugray);
        btnDen = findViewById(R.id.btn_black);
        imageView6=findViewById(R.id.imageView6);
        imageView = findViewById(R.id.imageView);

        btnXong.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent  = new Intent(MainActivity2.this,MainActivity.class);
//                startActivity(intent);





//            }

            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                imageView6 = (ImageView) findViewById(R.id.imageView6);
                if (imageView6.getDrawable().getConstantState().equals(imageView6.getContext().getDrawable(R.drawable.vs_bac).getConstantState())) {
                    Intent act2 = new Intent(MainActivity2.this, MainActivity.class);
                    act2.putExtra("ImgRe", R.drawable.vs_bac);
                    startActivity(act2);
                }

                if (imageView6.getDrawable().getConstantState().equals(imageView6.getContext().getDrawable(R.drawable.vs_red_a).getConstantState())) {
                    Intent act2 = new Intent(MainActivity2.this, MainActivity.class);
                    act2.putExtra("ImgRe", R.drawable.vs_red_a);
                    startActivity(act2);
                }

                if (imageView6.getDrawable().getConstantState().equals(imageView6.getContext().getDrawable(R.drawable.vsmart_black_star).getConstantState())) {
                    Intent act2 = new Intent(MainActivity2.this, MainActivity.class);
                    act2.putExtra("ImgRe", R.drawable.vsmart_black_star);
                    startActivity(act2);
                }

                if (imageView6.getDrawable().getConstantState().equals(imageView6.getContext().getDrawable(R.drawable.vsmart_live_xanh1).getConstantState())) {
                    Intent act2 = new Intent(MainActivity2.this, MainActivity.class);
                    act2.putExtra("ImgRe", R.drawable.vsmart_live_xanh1);
                    startActivity(act2);
                }
            }
        });

        reTurn_bac(btnBac,new ThayDoi("Mau: Bạc","Tiki","80.000đ",R.drawable.vs_bac));
        reTurn_red(btnDo,new ThayDoi("Mau: Đỏ","Tiki","80.000đ",R.drawable.vs_red_a));
        reTurn_black(btnDen,new ThayDoi("Mau: Đen","Tiki","80.000đ",R.drawable.vsmart_black_star));
        reTurn_blugray(btnXanhDam,new ThayDoi("Mau: Xanh Đậm","Tiki","80.000đ",R.drawable.vsmart_live_xanh1));





    }
    public void reTurn_bac(Button btn, ThayDoi doi){
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_Mau.setText(doi.getMau());
                txt_Gia.setText(doi.getGia());
                txt_Ti.setText(doi.getTiKi());
                imageView6.setImageResource(doi.getImage());


            }
        });
    }

    public void reTurn_red(Button btn, ThayDoi doi){
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_Mau.setText(doi.getMau());
                txt_Gia.setText(doi.getGia());
                txt_Ti.setText(doi.getTiKi());
                imageView6.setImageResource(doi.getImage());


            }
        });
    }

    public void reTurn_blugray(Button btn, ThayDoi doi){
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_Mau.setText(doi.getMau());
                txt_Gia.setText(doi.getGia());
                txt_Ti.setText(doi.getTiKi());
                imageView6.setImageResource(doi.getImage());


            }
        });
    }

    public void reTurn_black(Button btn, ThayDoi doi){
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_Mau.setText(doi.getMau());
                txt_Gia.setText(doi.getGia());
                txt_Ti.setText(doi.getTiKi());
                imageView6.setImageResource(doi.getImage());


            }
        });
    }





}