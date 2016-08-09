package RTC;

/**
* RTC/TimedWCharSeqHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/BasicDataType.idlから
* 2016年8月9日 12時30分07秒 JST
*/

public final class TimedWCharSeqHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.TimedWCharSeq value = null;

  public TimedWCharSeqHolder ()
  {
  }

  public TimedWCharSeqHolder (RTC.TimedWCharSeq initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.TimedWCharSeqHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.TimedWCharSeqHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.TimedWCharSeqHelper.type ();
  }

}
