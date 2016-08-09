package RTC;

/**
* RTC/TimedLongHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/BasicDataType.idlから
* 2016年8月9日 12時30分07秒 JST
*/

public final class TimedLongHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.TimedLong value = null;

  public TimedLongHolder ()
  {
  }

  public TimedLongHolder (RTC.TimedLong initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.TimedLongHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.TimedLongHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.TimedLongHelper.type ();
  }

}
