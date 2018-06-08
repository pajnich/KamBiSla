package com.example.matic.kambisla;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.CardView;
import android.view.View;

class AnswerCard extends CardView{
	private boolean selected;

	public AnswerCard(Context context) {
		super(context);
		selected = false;
		setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View view) {
				if(!selected){
					setBackgroundColor(Color.LTGRAY);
					selected = true;
				}else{
					setBackgroundColor(Color.WHITE);
					selected = false;
				}
			}
		});
	}
}
