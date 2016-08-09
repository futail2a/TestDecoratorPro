package RTC;


/**
* RTC/ActuatorListHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/


/*!
     * @typedef ActuatorList
     * @brief List of Actuator elements.
     */
public final class ActuatorListHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.Actuator value[] = null;

  public ActuatorListHolder ()
  {
  }

  public ActuatorListHolder (RTC.Actuator[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.ActuatorListHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.ActuatorListHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.ActuatorListHelper.type ();
  }

}
