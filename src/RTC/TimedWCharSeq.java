package RTC;


/**
* RTC/TimedWCharSeq.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/BasicDataType.idlから
* 2016年8月9日 12時30分07秒 JST
*/

public final class TimedWCharSeq implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public char data[] = null;

  public TimedWCharSeq ()
  {
  } // ctor

  public TimedWCharSeq (RTC.Time _tm, char[] _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedWCharSeq
