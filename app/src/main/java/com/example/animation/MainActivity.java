package com.example.animation;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import android.os.Bundle;

public class MainActivity extends Activity {

    private ImageView imageView;
    long animationDuration = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.imageView);
    }
    public void animation(View view) {
        ObjectAnimator animatorX = ObjectAnimator.ofFloat(imageView,"x", 420f);
        ObjectAnimator animatorY = ObjectAnimator.ofFloat(imageView,"y", 200f);
        animatorX.setDuration(animationDuration);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(animatorX, animatorY);
        animatorSet.start();

    }
}