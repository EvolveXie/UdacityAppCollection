package com.evolvexie.udacityappcollection;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnIntent(View view) {
        int id = view.getId();
        switch (id) {
            case R.id.hotMoviesBtn:
                Toast.makeText(this, "启动应用：热门电影", Toast.LENGTH_SHORT).show();
                break;
            case R.id.stockEagleBtn:
                //Toast.makeText(this,"启动应用：股票雄鹰",Toast.LENGTH_SHORT).show();
                Toasty.success(this, "启动应用：股票雄鹰", Toast.LENGTH_SHORT, true).show();
                break;
            case R.id.xyzReaderBtn:
                //Toast.makeText(this,"启动应用：XYZ阅读器",Toast.LENGTH_SHORT).show();
                Toasty.info(this, "启动应用：XYZ阅读器", R.drawable.ic_check_white_48dp).show();
                break;
            case R.id.newestNewsBtn:
                //Toast.makeText(this, "启动应用：最新闻", Toast.LENGTH_SHORT).show();
                Toasty.normal(this,"启动应用：最新闻",Toast.LENGTH_SHORT).show();
                break;
            case R.id.graduationProjectBtn:
                Toast.makeText(this, "启动应用：毕业设计", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }

}
