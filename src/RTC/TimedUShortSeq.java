package RTC;


/**
* RTC/TimedUShortSeq.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/BasicDataType.idlから
* 2016年8月9日 12時30分07秒 JST
*/

public final class TimedUShortSeq implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public short data[] = null;

  public TimedUShortSeq ()
  {
  } // ctor

  public TimedUShortSeq (RTC.Time _tm, short[] _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedUShortSeq
