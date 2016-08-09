package RTC;


/**
* RTC/TimedCarlike.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

public final class TimedCarlike implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public RTC.Carlike data = null;

  public TimedCarlike ()
  {
  } // ctor

  public TimedCarlike (RTC.Time _tm, RTC.Carlike _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedCarlike
