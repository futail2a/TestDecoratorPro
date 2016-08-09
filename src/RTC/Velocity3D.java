package RTC;


/**
* RTC/Velocity3D.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

public final class Velocity3D implements org.omg.CORBA.portable.IDLEntity
{

  /// Velocity along the x axis in metres per second.
  public double vx = (double)0;

  /// Velocity along the y axis in metres per second.
  public double vy = (double)0;

  /// Velocity along the z axis in metres per second.
  public double vz = (double)0;

  /// Roll velocity in radians per second.
  public double vr = (double)0;

  /// Pitch velocity in radians per second.
  public double vp = (double)0;

  /// Yaw velocity in radians per second.
  public double va = (double)0;

  public Velocity3D ()
  {
  } // ctor

  public Velocity3D (double _vx, double _vy, double _vz, double _vr, double _vp, double _va)
  {
    vx = _vx;
    vy = _vy;
    vz = _vz;
    vr = _vr;
    vp = _vp;
    va = _va;
  } // ctor

} // class Velocity3D
