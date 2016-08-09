package RTC;


/**
* RTC/Velocity2D.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

public final class Velocity2D implements org.omg.CORBA.portable.IDLEntity
{

  /// Velocity along the x axis in metres per second.
  public double vx = (double)0;

  /// Velocity along the y axis in metres per second.
  public double vy = (double)0;

  /// Yaw velocity in radians per second.
  public double va = (double)0;

  public Velocity2D ()
  {
  } // ctor

  public Velocity2D (double _vx, double _vy, double _va)
  {
    vx = _vx;
    vy = _vy;
    va = _va;
  } // ctor

} // class Velocity2D
