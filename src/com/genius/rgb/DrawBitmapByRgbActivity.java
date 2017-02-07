package com.genius.rgb;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class DrawBitmapByRgbActivity extends Activity {
    /** Called when the activity is first created. */

	private MyView mMyView1;
	private MyView mMyView2;
	
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);       
               
        initView();     
        initLogic();
           
    }

    public void initView()
    {
    	mMyView1 = (MyView) findViewById(R.id.myview1);
       	mMyView2 = (MyView) findViewById(R.id.myview2);
    }
    
    
    public void initLogic()
    {
    	Bitmap bitmap1 = BitmapFactory.decodeResource(getResources(), R.drawable.test);
    	mMyView1.setBitmap(bitmap1);
    	
    	// 获取该位图的RGB数据
    	byte[]rgbData = MyUtil.getRGBByBitmap(bitmap1);
    	
    	// 根据该RGB数组生成位图
    	Bitmap bitmap2 = MyBitmapFactory.createMyBitmap(rgbData, bitmap1.getWidth(), bitmap1.getHeight());
    	mMyView2.setBitmap(bitmap2); 	
    	
    }
  
    
}