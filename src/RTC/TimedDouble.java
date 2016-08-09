package RTC;


/**
* RTC/TimedDouble.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/BasicDataType.idlから
* 2016年8月9日 12時30分07秒 JST
*/

public final class TimedDouble implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public double data = (double)0;

  public TimedDouble ()
  {
  } // ctor

  public TimedDouble (RTC.Time _tm, double _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedDouble
