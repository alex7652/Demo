package com.example.demo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

public class CustomView extends View {

	// 定义画笔
	Paint paint = new Paint();

	// 定义初始位置
	float currentX = 20;
	float currentY = 40;

	public CustomView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}
	
	public CustomView(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		super.onDraw(canvas);
		paint.setColor(Color.BLUE);
		canvas.drawCircle(currentX, currentY, 20, paint);
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		// TODO Auto-generated method stub
		currentX = event.getX();
		currentY = event.getY();
		invalidate();
		return true;
	}
}
