package RTC;

/**
* RTC/ActArrayActuatorSpeedHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/

public final class ActArrayActuatorSpeedHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.ActArrayActuatorSpeed value = null;

  public ActArrayActuatorSpeedHolder ()
  {
  }

  public ActArrayActuatorSpeedHolder (RTC.ActArrayActuatorSpeed initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.ActArrayActuatorSpeedHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.ActArrayActuatorSpeedHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.ActArrayActuatorSpeedHelper.type ();
  }

}
