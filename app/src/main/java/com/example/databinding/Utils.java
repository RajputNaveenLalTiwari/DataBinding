package com.example.databinding;

import android.databinding.BindingAdapter;
import android.databinding.ObservableField;
import android.view.View;
import android.view.ViewGroup;

public class Utils {
    private boolean change = false;
    private ObservableField<String> string = new ObservableField<String>("");

    public void setString(String string) {
        this.string.set(string);
    }

    public ObservableField<String> getString() {
        return this.string;
    }

    public void onClick(View view, String string) {
        change = !change;
        if (change)
            setString(string);
        else
            setString("Welcome");
    }

    @BindingAdapter("layoutHeight")
    public static void setLayoutHeight(View view, float height) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = (int) height;
        view.setLayoutParams(layoutParams);
    }

    /*@BindingAdapter("marginLeft")
    public static void setMarginLeft(View view, float value) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.leftMargin = (int) value;
        }
    }

    @BindingAdapter("marginTop")
    public static void setMarginTop(View view, float value) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = (int) value;
        }
    }

    @BindingAdapter("marginRight")
    public static void setMarginRight(View view, float value) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.rightMargin = (int) value;
        }
    }

    @BindingAdapter("marginBottom")
    public static void setMarginBottom(View view, float value) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = (int) value;
        }
    }*/

    @BindingAdapter("margin")
    public static void setMargin(View view, float value) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins((int) value, (int) value, (int) value, (int) value);
        }
    }

    @BindingAdapter(value = {"marginLeft", "marginTop", "marginRight", "marginBottom"},requireAll = false)
    public static void setMarginDiffer(View view, float marginLeft, float marginTop, float marginRight, float marginBottom) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins((int) marginLeft, (int) marginTop, (int) marginRight, (int) marginBottom);
        }
    }
}
