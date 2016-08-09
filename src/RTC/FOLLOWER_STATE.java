package RTC;


/**
* RTC/FOLLOWER_STATE.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/MobileRobot.idlから
* 2016年8月9日 12時30分07秒 JST
*/

public class FOLLOWER_STATE implements org.omg.CORBA.portable.IDLEntity
{
  private        int __value;
  private static int __size = 5;
  private static RTC.FOLLOWER_STATE[] __array = new RTC.FOLLOWER_STATE [__size];

  public static final int _FOLLOWER_STOPPED = 0;
  public static final RTC.FOLLOWER_STATE FOLLOWER_STOPPED = new RTC.FOLLOWER_STATE(_FOLLOWER_STOPPED);
  public static final int _FOLLOWER_FOLLOWING = 1;
  public static final RTC.FOLLOWER_STATE FOLLOWER_FOLLOWING = new RTC.FOLLOWER_STATE(_FOLLOWER_FOLLOWING);
  public static final int _FOLLOWER_SUSPEND = 2;
  public static final RTC.FOLLOWER_STATE FOLLOWER_SUSPEND = new RTC.FOLLOWER_STATE(_FOLLOWER_SUSPEND);
  public static final int _FOLLOWER_ERROR = 3;
  public static final RTC.FOLLOWER_STATE FOLLOWER_ERROR = new RTC.FOLLOWER_STATE(_FOLLOWER_ERROR);
  public static final int _FOLLOWER_UNKNOWN = 4;
  public static final RTC.FOLLOWER_STATE FOLLOWER_UNKNOWN = new RTC.FOLLOWER_STATE(_FOLLOWER_UNKNOWN);

  public int value ()
  {
    return __value;
  }

  public static RTC.FOLLOWER_STATE from_int (int value)
  {
    if (value >= 0 && value < __size)
      return __array[value];
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

  protected FOLLOWER_STATE (int value)
  {
    __value = value;
    __array[__value] = this;
  }
} // class FOLLOWER_STATE
