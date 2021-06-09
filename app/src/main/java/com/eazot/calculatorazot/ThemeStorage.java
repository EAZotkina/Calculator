package com.eazot.calculatorazot;

import android.content.Context;
import android.content.SharedPreferences;

public class ThemeStorage {

    private Context context;
    private final SharedPreferences sharedPreferences;
    private static final String KEY_APP_THEME = "KEY_APP_THEME";

    public ThemeStorage (Context context){
        this.context = context;
        sharedPreferences = context.getSharedPreferences("app_themes", Context.MODE_PRIVATE );
    }
    public AppTheme getTheme(){
        String key = sharedPreferences.getString(KEY_APP_THEME,AppTheme.LIGHT.getKey());

        for (AppTheme theme: AppTheme.values()){
            if (theme.getKey().equals(key)){
               return theme;
            }
        }
        throw new IllegalStateException("Wrong!");
    }
    public void setTheme (AppTheme theme){
        sharedPreferences.edit()
                .putString(KEY_APP_THEME, theme.getKey())
                .apply();

        }
}
