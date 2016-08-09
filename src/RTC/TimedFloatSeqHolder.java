package RTC;

/**
* RTC/TimedFloatSeqHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/BasicDataType.idlから
* 2016年8月9日 12時30分07秒 JST
*/

public final class TimedFloatSeqHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.TimedFloatSeq value = null;

  public TimedFloatSeqHolder ()
  {
  }

  public TimedFloatSeqHolder (RTC.TimedFloatSeq initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.TimedFloatSeqHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.TimedFloatSeqHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.TimedFloatSeqHelper.type ();
  }

}
