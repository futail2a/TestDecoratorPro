package RTC;

/**
* RTC/TimedUShortHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/BasicDataType.idlから
* 2016年8月9日 12時30分07秒 JST
*/

public final class TimedUShortHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.TimedUShort value = null;

  public TimedUShortHolder ()
  {
  }

  public TimedUShortHolder (RTC.TimedUShort initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.TimedUShortHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.TimedUShortHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.TimedUShortHelper.type ();
  }

}
