package RTC;

/**
* RTC/TimedULongHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/BasicDataType.idlから
* 2016年8月9日 12時30分07秒 JST
*/

public final class TimedULongHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.TimedULong value = null;

  public TimedULongHolder ()
  {
  }

  public TimedULongHolder (RTC.TimedULong initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.TimedULongHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.TimedULongHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.TimedULongHelper.type ();
  }

}
