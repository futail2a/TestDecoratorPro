package RTC;

/**
* RTC/TimedOAPHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

public final class TimedOAPHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.TimedOAP value = null;

  public TimedOAPHolder ()
  {
  }

  public TimedOAPHolder (RTC.TimedOAP initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.TimedOAPHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.TimedOAPHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.TimedOAPHelper.type ();
  }

}
