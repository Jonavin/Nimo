package com.main.nimo;

import android.os.Bundle;

import android.app.Activity;
import android.view.Menu;

import org.apache.cordova.*;

/*
			    《PhoneGap版图书商城》- PhoneGap实例下载
				软件开发方案网开源项目， 可用任何商业用途， 请保留版权说明
				作者: Salon
				电邮: salon@fanganwang.com
				版权：www.fanganwang.com
			*/	
public class Nimo extends DroidGap {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        super.loadUrl("file:///android_asset/www/index.html"); 
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.nimo, menu);
        return true;
    }
}
