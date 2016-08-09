package RTC;

/**
* RTC/TimedWStringHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/BasicDataType.idlから
* 2016年8月9日 12時30分07秒 JST
*/

public final class TimedWStringHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.TimedWString value = null;

  public TimedWStringHolder ()
  {
  }

  public TimedWStringHolder (RTC.TimedWString initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.TimedWStringHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.TimedWStringHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.TimedWStringHelper.type ();
  }

}
