package RTC;

/**
* RTC/TimedBooleanHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/BasicDataType.idlから
* 2016年8月9日 12時30分07秒 JST
*/

public final class TimedBooleanHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.TimedBoolean value = null;

  public TimedBooleanHolder ()
  {
  }

  public TimedBooleanHolder (RTC.TimedBoolean initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.TimedBooleanHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.TimedBooleanHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.TimedBooleanHelper.type ();
  }

}
