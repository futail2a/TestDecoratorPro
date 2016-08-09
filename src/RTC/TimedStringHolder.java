package RTC;

/**
* RTC/TimedStringHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/BasicDataType.idlから
* 2016年8月9日 12時30分07秒 JST
*/

public final class TimedStringHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.TimedString value = null;

  public TimedStringHolder ()
  {
  }

  public TimedStringHolder (RTC.TimedString initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.TimedStringHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.TimedStringHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.TimedStringHelper.type ();
  }

}
