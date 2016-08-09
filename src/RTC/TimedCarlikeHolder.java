package RTC;

/**
* RTC/TimedCarlikeHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

public final class TimedCarlikeHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.TimedCarlike value = null;

  public TimedCarlikeHolder ()
  {
  }

  public TimedCarlikeHolder (RTC.TimedCarlike initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.TimedCarlikeHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.TimedCarlikeHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.TimedCarlikeHelper.type ();
  }

}
