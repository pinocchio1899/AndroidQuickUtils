package com.cesarferreira.quickutils.sample;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;

import quickutils.core.QuickUtils;

public class MainActivity extends Activity {

    private Context mContext;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContext = getApplicationContext();

        QuickUtils.init(getApplicationContext());

        QuickUtils.system.toast("this is a toast");

        ///////////////////////////////////////////////////////////////////////
        // PREFERENCES CATEGORY
        ///////////////////////////////////////////////////////////////////////

        // Boolean
        QuickUtils.prefs.with(mContext).save("key", true);
        boolean someBoolean = QuickUtils.prefs.with(mContext).getBoolean("key", false);
        QuickUtils.log.i(String.format("bool from preferences - %b", someBoolean));

        // Int
        QuickUtils.prefs.with(mContext).save("key", 15);
        int someInt = QuickUtils.prefs.with(mContext).getInt("key", -1);
        QuickUtils.log.i(String.format("int from preferences - %d", someInt));

        ///////////////////////////////////////////////////////////////////////
        // MATH CATEGORY
        ///////////////////////////////////////////////////////////////////////

        int minValue = 0;
        int intValue = 15;
        float minFloatValue = (float) 0.3;
        float floatValue = (float) 2.2;
        float anotherFLoatValue = (float) 0.2;

        // isOdd
        QuickUtils.log.i("isOdd - (" + intValue + ") = " + QuickUtils.math.isOdd(intValue));

        // isEven
        QuickUtils.log.i("isEven - (" + intValue + ") = " + QuickUtils.math.isEven(intValue));

        // degreesToRadians
        QuickUtils.log.i("degreesToRadians - (" + intValue + ") = " + QuickUtils.math.degreesToRadians(intValue));

        // radiansToDegrees
        QuickUtils.log.i("radiansToDegrees - (" + intValue + ") = " + QuickUtils.math.radiansToDegrees(intValue));

        // exponencial
        QuickUtils.log.i("exponencial - (" + intValue + ") = " + QuickUtils.math.exponencial(intValue));

        // logarithm
        QuickUtils.log.i("logarithm - (" + intValue + ") = " + QuickUtils.math.logarithm(intValue));

        // random numbers
        QuickUtils.log.i("random - (" + minValue + "," + intValue + ") = " + QuickUtils.math.getRandomNumber(minValue, intValue));

        // max
        QuickUtils.log.i("max - (" + minValue + "," + intValue + ") = " + QuickUtils.math.max(minValue, intValue));

        // min
        QuickUtils.log.i("min - (" + minValue + "," + intValue + ") = " + QuickUtils.math.min(minValue, intValue));

        // abs
        QuickUtils.log.i("abs - (" + floatValue + ") = " + QuickUtils.math.abs(floatValue));

        // acos
        QuickUtils.log.i("acos - (" + anotherFLoatValue + ") = " + QuickUtils.math.acos(anotherFLoatValue));

        // asin
        QuickUtils.log.i("asin - (" + anotherFLoatValue + ") = " + QuickUtils.math.asin(anotherFLoatValue));

        // tan
        QuickUtils.log.i("tan - (" + floatValue + ") = " + QuickUtils.math.tan(floatValue));

        // atan
        QuickUtils.log.i("atan - (" + floatValue + ") = " + QuickUtils.math.atan(floatValue));

        // atan2
        QuickUtils.log.i("atan2 - (" + minFloatValue + "," + floatValue + ") = " + QuickUtils.math.atan2(minFloatValue, floatValue));


    }

    public void blurActivityClick(View view) {
        QuickUtils.system.navigateToActivity(this, TestingBlur.class);
    }
}
