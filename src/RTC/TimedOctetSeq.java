package RTC;


/**
* RTC/TimedOctetSeq.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/BasicDataType.idlから
* 2016年8月9日 12時30分07秒 JST
*/

public final class TimedOctetSeq implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public byte data[] = null;

  public TimedOctetSeq ()
  {
  } // ctor

  public TimedOctetSeq (RTC.Time _tm, byte[] _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedOctetSeq
