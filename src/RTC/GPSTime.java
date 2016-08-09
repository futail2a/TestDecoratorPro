package RTC;


/**
* RTC/GPSTime.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/

public final class GPSTime implements org.omg.CORBA.portable.IDLEntity
{

  /// Seconds value.
  public int sec = (int)0;

  /// Microseconds value.
  public int msec = (int)0;

  public GPSTime ()
  {
  } // ctor

  public GPSTime (int _sec, int _msec)
  {
    sec = _sec;
    msec = _msec;
  } // ctor

} // class GPSTime
