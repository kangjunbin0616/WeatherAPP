package com.example.admin.weatherapp;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 2017/8/16.
 */

public class AddCityActivity extends BaseActivity {

    private List<CityWeather> cityWeatherList = new ArrayList<CityWeather>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addcity);

        initCityWeather();

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.rv_addcity_main);
        //横向
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        AddCityActivityAdapter addCityActivityAdapter = new AddCityActivityAdapter(cityWeatherList);
        recyclerView.setAdapter(addCityActivityAdapter);

    }

    private void initCityWeather(){
        CityWeather city01 = new CityWeather("阿尔山","乌兰浩特，内蒙古",R.drawable.qing,"23","优","67","东北风","24","13");
        cityWeatherList.add(city01);
        CityWeather city02 = new CityWeather("阿尔山","乌兰浩特，内蒙古",R.drawable.qing,"23","优","67","东北风","24","13");
        cityWeatherList.add(city02);
        CityWeather city03 = new CityWeather("阿尔山","乌兰浩特，内蒙古",R.drawable.qing,"23","优","67","东北风","24","13");
        cityWeatherList.add(city03);
        CityWeather city04 = new CityWeather("阿尔山","乌兰浩特，内蒙古",R.drawable.qing,"23","优","67","东北风","24","13");
        cityWeatherList.add(city04);
        CityWeather city05 = new CityWeather("阿尔山","乌兰浩特，内蒙古",R.drawable.qing,"23","优","67","东北风","24","13");
        cityWeatherList.add(city05);
        CityWeather city06 = new CityWeather("阿尔山","乌兰浩特，内蒙古",R.drawable.qing,"23","优","67","东北风","24","13");
        cityWeatherList.add(city06);
        CityWeather city07 = new CityWeather("阿尔山","乌兰浩特，内蒙古",R.drawable.qing,"23","优","67","东北风","24","13");
        cityWeatherList.add(city07);
        CityWeather city08 = new CityWeather("阿尔山","乌兰浩特，内蒙古",R.drawable.qing,"23","优","67","东北风","24","13");
        cityWeatherList.add(city08);
        CityWeather city09 = new CityWeather("阿尔山","乌兰浩特，内蒙古",R.drawable.qing,"23","优","67","东北风","24","13");
        cityWeatherList.add(city09);
        CityWeather city10 = new CityWeather("阿尔山","乌兰浩特，内蒙古",R.drawable.qing,"23","优","67","东北风","24","13");
        cityWeatherList.add(city10);
        CityWeather city11 = new CityWeather("阿尔山","乌兰浩特，内蒙古",R.drawable.qing,"23","优","67","东北风","24","13");
        cityWeatherList.add(city11);
    }

}