package RTC;

/**
* RTC/TimedShortHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/BasicDataType.idlから
* 2016年8月9日 12時30分07秒 JST
*/

public final class TimedShortHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.TimedShort value = null;

  public TimedShortHolder ()
  {
  }

  public TimedShortHolder (RTC.TimedShort initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.TimedShortHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.TimedShortHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.TimedShortHelper.type ();
  }

}
