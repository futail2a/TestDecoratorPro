package RTC;

/**
* RTC/TimedUShortSeqHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/BasicDataType.idlから
* 2016年8月9日 12時30分07秒 JST
*/

public final class TimedUShortSeqHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.TimedUShortSeq value = null;

  public TimedUShortSeqHolder ()
  {
  }

  public TimedUShortSeqHolder (RTC.TimedUShortSeq initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.TimedUShortSeqHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.TimedUShortSeqHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.TimedUShortSeqHelper.type ();
  }

}
