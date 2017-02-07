package com.genius.rgb;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;

public class MyView extends View{

	private Bitmap mBitmap;
	
	public MyView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		
		
	}
	
	
	public MyView(Context context, AttributeSet attrs) {
		super(context, attrs);
	
	}

	public void setBitmap(Bitmap bitmap)
	{
		mBitmap = bitmap;
		invalidate();
	}

	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		if (mBitmap != null)
		{
			canvas.drawBitmap(mBitmap, 0, 0, null);
		}		
	}
	
	
	
	
	
	
	
	
	
	
	
}
