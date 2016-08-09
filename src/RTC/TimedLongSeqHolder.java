package RTC;

/**
* RTC/TimedLongSeqHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/BasicDataType.idlから
* 2016年8月9日 12時30分07秒 JST
*/

public final class TimedLongSeqHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.TimedLongSeq value = null;

  public TimedLongSeqHolder ()
  {
  }

  public TimedLongSeqHolder (RTC.TimedLongSeq initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.TimedLongSeqHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.TimedLongSeqHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.TimedLongSeqHelper.type ();
  }

}
