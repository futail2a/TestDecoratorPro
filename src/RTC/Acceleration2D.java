package RTC;


/**
* RTC/Acceleration2D.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

public final class Acceleration2D implements org.omg.CORBA.portable.IDLEntity
{

  /// Acceleration along the x axis, in metres per second per second.
  public double ax = (double)0;

  /// Acceleration along the y axis, in metres per second per second.
  public double ay = (double)0;

  public Acceleration2D ()
  {
  } // ctor

  public Acceleration2D (double _ax, double _ay)
  {
    ax = _ax;
    ay = _ay;
  } // ctor

} // class Acceleration2D
