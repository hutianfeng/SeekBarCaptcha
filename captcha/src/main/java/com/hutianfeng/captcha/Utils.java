package com.hutianfeng.captcha;

import android.content.Context;

/**
 * @Desc
 * @Author hutianfeng
 * @Date 10/11/21 3:07 PM
*/
public class Utils {

    /**
     * dp转px
     * */
    public static int dp2px(Context ctx, float dip) {
        float density = ctx.getResources().getDisplayMetrics().density;
        return (int) (dip * density);
    }
}
