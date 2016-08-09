package RTC;


/**
* RTC/TimedStringSeq.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/BasicDataType.idlから
* 2016年8月9日 12時30分07秒 JST
*/

public final class TimedStringSeq implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public String data[] = null;

  public TimedStringSeq ()
  {
  } // ctor

  public TimedStringSeq (RTC.Time _tm, String[] _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedStringSeq
