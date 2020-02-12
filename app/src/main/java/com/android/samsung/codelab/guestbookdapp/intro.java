package com.android.samsung.codelab.guestbookdapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import info.hoang8f.widget.FButton;

public class intro extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intro);

        //버튼 객체 생성
        FButton button1 = (FButton) findViewById(R.id.FButton2);
        FButton button2 = (FButton) findViewById(R.id.FButton3);
        FButton button3 = (FButton) findViewById(R.id.FButton4);
        FButton button4 = (FButton) findViewById(R.id.FButton5);


        //버튼 효과
        button1.setButtonColor(getResources().getColor(R.color.fbutton_color_concrete));
        button1.setShadowColor(getResources().getColor(R.color.fbutton_color_asbestos));
        button1.setShadowEnabled(true);
       /* button1.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(intro.this, );
                startActivity(intent);
            }
        });*/
        button1.setShadowHeight(5);
        button1.setCornerRadius(5);
        button2.setButtonColor(getResources().getColor(R.color.fbutton_color_concrete));
        button2.setShadowColor(getResources().getColor(R.color.fbutton_color_asbestos));
        button2.setShadowEnabled(true);
        button2.setShadowHeight(5);
        button2.setCornerRadius(5);
        button3.setButtonColor(getResources().getColor(R.color.fbutton_color_concrete));
        button3.setShadowColor(getResources().getColor(R.color.fbutton_color_asbestos));
        button3.setShadowEnabled(true);
        button3.setShadowHeight(5);
        button3.setCornerRadius(5);
        button4.setButtonColor(getResources().getColor(R.color.fbutton_color_concrete));
        button4.setShadowColor(getResources().getColor(R.color.fbutton_color_asbestos));
        button4.setShadowEnabled(true);
        button4.setShadowHeight(5);
        button4.setCornerRadius(5);

    }


}
