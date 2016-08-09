package RTC;

/**
* RTC/TimedDoubleSeqHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/BasicDataType.idlから
* 2016年8月9日 12時30分07秒 JST
*/

public final class TimedDoubleSeqHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.TimedDoubleSeq value = null;

  public TimedDoubleSeqHolder ()
  {
  }

  public TimedDoubleSeqHolder (RTC.TimedDoubleSeq initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.TimedDoubleSeqHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.TimedDoubleSeqHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.TimedDoubleSeqHelper.type ();
  }

}
