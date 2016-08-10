// -*-Java-*-
/*!
 * @file  PathFollowerSVC_impl.java
 * @brief Service implementation code of MobileRobot.idl
 *
 */
import RTC.PathFollowerPOA;
/*!
 * @class PathFollowerSVC_impl
 * Example class implementing IDL interface RTC::PathFollower
 */
public class PathFollowerSVC_impl extends PathFollowerPOA{
    
    public PathFollowerSVC_impl() {
        // Please add extra constructor code here.
    }

    /*
     * Methods corresponding to IDL attributes and operations
     */
    public RTC.RETURN_VALUE followPath(RTC.Path2D path) {
        System.out.println("followPath calling");
        return RTC.RETURN_VALUE.RETVAL_OK ;
    }

    public RTC.RETURN_VALUE getState(RTC.FOLLOWER_STATEHolder state) {
        System.out.println("getState calling");
        return RTC.RETURN_VALUE.RETVAL_OK;
    }

    public RTC.RETURN_VALUE followPathNonBlock(RTC.Path2D path) {
        System.out.println("followPathNonBlock calling");
        return RTC.RETURN_VALUE.RETVAL_OK;
    }

//  End of example implementational code
}