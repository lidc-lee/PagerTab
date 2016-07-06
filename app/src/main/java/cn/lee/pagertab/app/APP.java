package cn.lee.pagertab.app;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.imagepipeline.backends.okhttp.OkHttpImagePipelineConfigFactory;
import com.facebook.imagepipeline.core.ImagePipelineConfig;
import com.squareup.okhttp.OkHttpClient;

/**
 * Created by Ye on 2016/7/6.
 */
public class APP extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ImagePipelineConfig pipelineConfig = OkHttpImagePipelineConfigFactory
                .newBuilder(this,new OkHttpClient())
                .build();
        Fresco.initialize(this,pipelineConfig);

    }
}
