package RTC;


/**
* RTC/TimedULong.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/BasicDataType.idlから
* 2016年8月9日 12時30分07秒 JST
*/

public final class TimedULong implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public int data = (int)0;

  public TimedULong ()
  {
  } // ctor

  public TimedULong (RTC.Time _tm, int _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedULong
