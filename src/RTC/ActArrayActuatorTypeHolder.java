package RTC;

/**
* RTC/ActArrayActuatorTypeHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/


/*!
     * @enum ActArrayActuatorType
     * @brief Describes the type of an actuator.
     */
public final class ActArrayActuatorTypeHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.ActArrayActuatorType value = null;

  public ActArrayActuatorTypeHolder ()
  {
  }

  public ActArrayActuatorTypeHolder (RTC.ActArrayActuatorType initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.ActArrayActuatorTypeHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.ActArrayActuatorTypeHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.ActArrayActuatorTypeHelper.type ();
  }

}
