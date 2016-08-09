package RTC;

/**
* RTC/TimedWCharHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/BasicDataType.idlから
* 2016年8月9日 12時30分07秒 JST
*/

public final class TimedWCharHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.TimedWChar value = null;

  public TimedWCharHolder ()
  {
  }

  public TimedWCharHolder (RTC.TimedWChar initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.TimedWCharHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.TimedWCharHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.TimedWCharHelper.type ();
  }

}
