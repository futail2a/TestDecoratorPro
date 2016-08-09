package RTC;

/**
* RTC/ActArrayActuatorCurrentHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/

public final class ActArrayActuatorCurrentHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.ActArrayActuatorCurrent value = null;

  public ActArrayActuatorCurrentHolder ()
  {
  }

  public ActArrayActuatorCurrentHolder (RTC.ActArrayActuatorCurrent initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.ActArrayActuatorCurrentHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.ActArrayActuatorCurrentHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.ActArrayActuatorCurrentHelper.type ();
  }

}
