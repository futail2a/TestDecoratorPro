package RTC;

/**
* RTC/TimedWStringSeqHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/BasicDataType.idlから
* 2016年8月9日 12時30分07秒 JST
*/

public final class TimedWStringSeqHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.TimedWStringSeq value = null;

  public TimedWStringSeqHolder ()
  {
  }

  public TimedWStringSeqHolder (RTC.TimedWStringSeq initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.TimedWStringSeqHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.TimedWStringSeqHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.TimedWStringSeqHelper.type ();
  }

}
