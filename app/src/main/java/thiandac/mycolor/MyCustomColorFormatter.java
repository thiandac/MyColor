package thiandac.mycolor;

import android.graphics.Color;

public class MyCustomColorFormatter implements BarColorFormatter {

    @Override
    public int getColor(float value, float maxVal, float minVal) {

        float mid = (maxVal + minVal) / 2f;

        if (value > mid)
            return Color.GREEN;
        else
            return Color.RED;
    }

}