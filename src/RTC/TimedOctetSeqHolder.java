package RTC;

/**
* RTC/TimedOctetSeqHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/BasicDataType.idlから
* 2016年8月9日 12時30分07秒 JST
*/

public final class TimedOctetSeqHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.TimedOctetSeq value = null;

  public TimedOctetSeqHolder ()
  {
  }

  public TimedOctetSeqHolder (RTC.TimedOctetSeq initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.TimedOctetSeqHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.TimedOctetSeqHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.TimedOctetSeqHelper.type ();
  }

}
