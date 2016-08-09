package RTC;


/**
* RTC/LimbStatus.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/


/*!
     * @enum LimbStatus
     */
public class LimbStatus implements org.omg.CORBA.portable.IDLEntity
{
  private        int __value;
  private static int __size = 5;
  private static RTC.LimbStatus[] __array = new RTC.LimbStatus [__size];

  public static final int _LIMB_STATUS_IDLE = 0;
  public static final RTC.LimbStatus LIMB_STATUS_IDLE = new RTC.LimbStatus(_LIMB_STATUS_IDLE);
  public static final int _LIMB_STATUS_BRAKED = 1;
  public static final RTC.LimbStatus LIMB_STATUS_BRAKED = new RTC.LimbStatus(_LIMB_STATUS_BRAKED);
  public static final int _LIMB_STATUS_MOVING = 2;
  public static final RTC.LimbStatus LIMB_STATUS_MOVING = new RTC.LimbStatus(_LIMB_STATUS_MOVING);
  public static final int _LIMB_STATUS_OOR = 3;
  public static final RTC.LimbStatus LIMB_STATUS_OOR = new RTC.LimbStatus(_LIMB_STATUS_OOR);
  public static final int _LIMB_STATUS_COLLISION = 4;
  public static final RTC.LimbStatus LIMB_STATUS_COLLISION = new RTC.LimbStatus(_LIMB_STATUS_COLLISION);

  public int value ()
  {
    return __value;
  }

  public static RTC.LimbStatus from_int (int value)
  {
    if (value >= 0 && value < __size)
      return __array[value];
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

  protected LimbStatus (int value)
  {
    __value = value;
    __array[__value] = this;
  }
} // class LimbStatus
