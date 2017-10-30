package com.example.joseph.customviewgroup;

import android.content.Context;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.widget.EditText;
import android.widget.LinearLayout;

public class CustomViewGroup extends LinearLayout {

    private CustomButton login;

    public CustomViewGroup(Context context) {
        super(context);
    }

    public CustomViewGroup(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        setUp();
    }

    public CustomViewGroup(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setUp();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public CustomViewGroup(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        setUp();
    }

    private void setUp() {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(VERTICAL);
        EditText name = new EditText(getContext());
        EditText password = new EditText(getContext());
        login = new CustomButton(getContext());
//        Button login = new Button(getContext());
        name.setHint("Name");
        password.setHint("Password");
//        login.setText("Login");
        linearLayout.addView(name);
        linearLayout.addView(password);
        linearLayout.addView(login);

        this.addView(linearLayout);
    }

    public void setOnClick(OnClickListener l){
        this.login.setOnClickListener(l);
    }

}
