
package thiandac.mycolor;

import thiandac.mycolor.*;

/**
 * Listener for callbacks when selecting values on the ValueBar by touch
 * gesture.
 * 
 * @author Philipp Jahoda
 */
public interface ValueBarSelectionListener {

    /**
     * Called every time the user moves the finger on the ValueBar.
     * 
     * @param val
     * @param maxval
     * @param minval
     * @param bar
     */
    public void onSelectionUpdate(float val, float maxval, float minval, thiandac.mycolor.ValueBar bar);

    /**
     * Called when the user releases his finger from the ValueBar.
     * 
     * @param val
     * @param maxval
     * @param minval
     * @param bar
     */
    public void onValueSelected(float val, float maxval, float minval, thiandac.mycolor.ValueBar bar);
}
