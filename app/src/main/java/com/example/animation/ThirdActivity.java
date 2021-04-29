package com.example.animation;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ThirdActivity extends Activity {
    private ImageView imageView3;
    long animationDuration = 1900;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        imageView3 = (ImageView) findViewById(R.id.imageView3);
    }

    public void animation(View view) {
        ObjectAnimator animatorY = ObjectAnimator.ofFloat(imageView3,"y", 700f);
        animatorY.setDuration(animationDuration);
        ObjectAnimator alphaAnimation = ObjectAnimator.ofFloat(imageView3, View.ALPHA, 1.0f, 0.0f);
        alphaAnimation.setDuration(animationDuration);
        ObjectAnimator rotateAnimation = ObjectAnimator.ofFloat(imageView3, "rotation", 0f, 360f);
        rotateAnimation.setDuration(animationDuration);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(animatorY, rotateAnimation);
        animatorSet.start();
    }

}
