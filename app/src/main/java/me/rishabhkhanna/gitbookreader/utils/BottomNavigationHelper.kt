package me.rishabhkhanna.gitbookreader.utils

import android.support.design.internal.BottomNavigationItemView
import android.support.design.internal.BottomNavigationMenuView
import android.support.design.widget.BottomNavigationView
import android.util.Log
import java.lang.reflect.Field

/**
 * Created by rishabhkhanna on 03/01/18.
 */
public class BottomNavigationHelper {
    companion object {
        const val TAG = "BottomNavigationHelper";
        fun removeShift(view: BottomNavigationView) {
            val menuView = view.getChildAt(0) as BottomNavigationMenuView
            try {
                val shiftingMode: Field = menuView.javaClass.getDeclaredField("mShiftingMode");
                shiftingMode.isAccessible = true;
                shiftingMode.setBoolean(menuView, false);
                shiftingMode.isAccessible = false;
                for (i in 1..10) {
                    val item: BottomNavigationItemView = menuView.getChildAt(i) as BottomNavigationItemView
                    item.setShiftingMode(false);
                    item.setChecked(item.itemData.isChecked)
                }
            } catch (e: NoSuchFieldException) {
                Log.d(TAG, "unable to gte shift mode field" + e.message)
            } catch (e: IllegalAccessException) {
                Log.d(TAG, "unable to change value of shift mode " + e.message)
            }
        }
    }
}