package RTC;

/**
* RTC/TimedShortSeqHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/BasicDataType.idlから
* 2016年8月9日 12時30分07秒 JST
*/

public final class TimedShortSeqHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.TimedShortSeq value = null;

  public TimedShortSeqHolder ()
  {
  }

  public TimedShortSeqHolder (RTC.TimedShortSeq initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.TimedShortSeqHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.TimedShortSeqHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.TimedShortSeqHelper.type ();
  }

}
