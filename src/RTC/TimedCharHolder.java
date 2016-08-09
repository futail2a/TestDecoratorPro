package RTC;

/**
* RTC/TimedCharHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/BasicDataType.idlから
* 2016年8月9日 12時30分07秒 JST
*/

public final class TimedCharHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.TimedChar value = null;

  public TimedCharHolder ()
  {
  }

  public TimedCharHolder (RTC.TimedChar initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.TimedCharHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.TimedCharHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.TimedCharHelper.type ();
  }

}
