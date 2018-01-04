package me.rishabhkhanna.gitbookreader.utils

import android.graphics.Color
import android.support.design.internal.BottomNavigationItemView
import android.support.design.internal.BottomNavigationMenuView
import android.support.design.widget.BottomNavigationView
import android.util.Log
import com.aurelhubert.ahbottomnavigation.AHBottomNavigation
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationItem
import me.rishabhkhanna.gitbookreader.R
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

        fun getBottomNavigationMenu(bottomNavigationView: AHBottomNavigation){

// items on navigaiton bottom bar
            val explore:AHBottomNavigationItem = AHBottomNavigationItem("Explore", R.drawable.ic_telescope);
            val topic:AHBottomNavigationItem = AHBottomNavigationItem("Topics", R.drawable.ic_tag);
            val library:AHBottomNavigationItem = AHBottomNavigationItem("Library", R.drawable.ic_book);
            val author:AHBottomNavigationItem = AHBottomNavigationItem("Author", R.drawable.ic_telescope);
            bottomNavigationView.addItem(explore)
            bottomNavigationView.addItem(topic)
            bottomNavigationView.addItem(library)
            bottomNavigationView.addItem(author)

//            set color
            bottomNavigationView.accentColor = Color.rgb(61,135,251);
            bottomNavigationView.inactiveColor = Color.parseColor("#323232")

//            bottomNavigationView.setTitleTextSize(42f,42f)

//            bottomNavigationView.
        }
    }
}