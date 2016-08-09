package RTC;

/**
* RTC/TimedBooleanSeqHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/BasicDataType.idlから
* 2016年8月9日 12時30分07秒 JST
*/

public final class TimedBooleanSeqHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.TimedBooleanSeq value = null;

  public TimedBooleanSeqHolder ()
  {
  }

  public TimedBooleanSeqHolder (RTC.TimedBooleanSeq initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.TimedBooleanSeqHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.TimedBooleanSeqHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.TimedBooleanSeqHelper.type ();
  }

}
