package com.example.animation;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SecondActivity extends Activity {

    private ImageView imageView2;
    long animationDuration = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        imageView2 = (ImageView) findViewById(R.id.imageView2);
    }

    public void animation(View view) {
        ObjectAnimator animatorY = ObjectAnimator.ofFloat(imageView2,"y", 700f);
        animatorY.setDuration(animationDuration);
        ObjectAnimator alphaAnimation = ObjectAnimator.ofFloat(imageView2, View.ALPHA, 1.0f, 0.0f, 1.0f);
        alphaAnimation.setDuration(animationDuration);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(animatorY, alphaAnimation);
        animatorSet.start();
    }
}
