package com.tiaozhanbei.chouxiaoya.view;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.youth.banner.loader.ImageLoader;

/**
 * Created by SailFlorve on 2017/11/19 0019.
 * 用于Banner的图片加载器。
 */

public class BannerGlideImageLoader extends ImageLoader {
    @Override
    public void displayImage(Context context, Object path, ImageView imageView) {
        Glide.with(context).load(path).into(imageView);
    }
}
