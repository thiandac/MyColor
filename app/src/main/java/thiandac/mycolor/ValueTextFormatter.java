package thiandac.mycolor;

public interface ValueTextFormatter {

    public String getValueText(float value, float maxVal, float minVal);
    public String getMinVal(float minVal);
    public String getMaxVal(float maxVal);
}
