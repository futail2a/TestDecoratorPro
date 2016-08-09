package RTC;


/**
* RTC/TimedShort.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/BasicDataType.idlから
* 2016年8月9日 12時30分07秒 JST
*/

public final class TimedShort implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public short data = (short)0;

  public TimedShort ()
  {
  } // ctor

  public TimedShort (RTC.Time _tm, short _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedShort
