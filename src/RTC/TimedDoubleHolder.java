package RTC;

/**
* RTC/TimedDoubleHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/BasicDataType.idlから
* 2016年8月9日 12時30分07秒 JST
*/

public final class TimedDoubleHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.TimedDouble value = null;

  public TimedDoubleHolder ()
  {
  }

  public TimedDoubleHolder (RTC.TimedDouble initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.TimedDoubleHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.TimedDoubleHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.TimedDoubleHelper.type ();
  }

}
