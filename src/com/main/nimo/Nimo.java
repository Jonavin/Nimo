package com.main.nimo;

import android.os.Bundle;

import android.app.Activity;
import android.view.Menu;

import org.apache.cordova.*;

/*
			    ��PhoneGap��ͼ���̳ǡ�- PhoneGapʵ������
				���������������Դ��Ŀ�� �����κ���ҵ��;�� �뱣����Ȩ˵��
				����: Salon
				����: salon@fanganwang.com
				��Ȩ��www.fanganwang.com
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
