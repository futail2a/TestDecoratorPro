package RTC;


/**
* RTC/TimedULongSeq.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/BasicDataType.idlから
* 2016年8月9日 12時30分07秒 JST
*/

public final class TimedULongSeq implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public int data[] = null;

  public TimedULongSeq ()
  {
  } // ctor

  public TimedULongSeq (RTC.Time _tm, int[] _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedULongSeq
