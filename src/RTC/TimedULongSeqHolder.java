package RTC;

/**
* RTC/TimedULongSeqHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/BasicDataType.idlから
* 2016年8月9日 12時30分07秒 JST
*/

public final class TimedULongSeqHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.TimedULongSeq value = null;

  public TimedULongSeqHolder ()
  {
  }

  public TimedULongSeqHolder (RTC.TimedULongSeq initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.TimedULongSeqHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.TimedULongSeqHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.TimedULongSeqHelper.type ();
  }

}
