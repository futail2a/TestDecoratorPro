package RTC;

/**
* RTC/TimedOctetHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/BasicDataType.idlから
* 2016年8月9日 12時30分07秒 JST
*/

public final class TimedOctetHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.TimedOctet value = null;

  public TimedOctetHolder ()
  {
  }

  public TimedOctetHolder (RTC.TimedOctet initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.TimedOctetHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.TimedOctetHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.TimedOctetHelper.type ();
  }

}
