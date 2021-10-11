package com.hutianfeng.captcha;

/**
 * @Desc
 * @Author hutianfeng
 * @Date 10/11/21 3:07 PM
*/

public class PositionInfo {

    int left;     //拼图缺块离整张图片左边距离
    int top;      //拼图缺块离整张图片上方距离

    public PositionInfo(int left, int top) {
        this.left = left;
        this.top = top;
    }
}
