package RTC;


/**
* RTC/TimedBooleanSeq.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/BasicDataType.idlから
* 2016年8月9日 12時30分07秒 JST
*/

public final class TimedBooleanSeq implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public boolean data[] = null;

  public TimedBooleanSeq ()
  {
  } // ctor

  public TimedBooleanSeq (RTC.Time _tm, boolean[] _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedBooleanSeq
