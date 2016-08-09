package RTC;


/**
* RTC/ActArrayActuatorType.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/


/*!
     * @enum ActArrayActuatorType
     * @brief Describes the type of an actuator.
     */
public class ActArrayActuatorType implements org.omg.CORBA.portable.IDLEntity
{
  private        int __value;
  private static int __size = 2;
  private static RTC.ActArrayActuatorType[] __array = new RTC.ActArrayActuatorType [__size];

  public static final int _ACTARRAY_ACTUATORTYPE_LINEAR = 0;
  public static final RTC.ActArrayActuatorType ACTARRAY_ACTUATORTYPE_LINEAR = new RTC.ActArrayActuatorType(_ACTARRAY_ACTUATORTYPE_LINEAR);
  public static final int _ACTARRAY_ACTUATORTYPE_ROTARY = 1;
  public static final RTC.ActArrayActuatorType ACTARRAY_ACTUATORTYPE_ROTARY = new RTC.ActArrayActuatorType(_ACTARRAY_ACTUATORTYPE_ROTARY);

  public int value ()
  {
    return __value;
  }

  public static RTC.ActArrayActuatorType from_int (int value)
  {
    if (value >= 0 && value < __size)
      return __array[value];
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

  protected ActArrayActuatorType (int value)
  {
    __value = value;
    __array[__value] = this;
  }
} // class ActArrayActuatorType
