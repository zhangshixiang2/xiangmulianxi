package com.example.xiangmulianxi.component;

import android.app.ListActivity;

import com.example.xiangmulianxi.ClassifyFragment;
import com.example.xiangmulianxi.module.HttpModule;


import com.example.xiangmulianxi.ui.homepage.HomePageFragment;
import com.example.xiangmulianxi.ui.login.LoginActivity;


import dagger.Component;

@Component(modules = HttpModule.class)
public interface HttpComponent {
    void inject(LoginActivity loginActivity);

    void inject(HomePageFragment homePageFragment);
    void inject(ClassifyFragment classifyFragment);

    void inject(com.example.xiangmulianxi.ui.classify.ClassifyFragment listActivity);

    void inject(com.example.xiangmulianxi.ui.classify.ListActivity listActivity);
}
