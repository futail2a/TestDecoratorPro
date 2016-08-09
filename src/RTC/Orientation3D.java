package RTC;


/**
* RTC/Orientation3D.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

public final class Orientation3D implements org.omg.CORBA.portable.IDLEntity
{

  /// Roll angle in radians.
  public double r = (double)0;

  /// Pitch angle in radians.
  public double p = (double)0;

  /// Yaw angle in radians.
  public double y = (double)0;

  public Orientation3D ()
  {
  } // ctor

  public Orientation3D (double _r, double _p, double _y)
  {
    r = _r;
    p = _p;
    y = _y;
  } // ctor

} // class Orientation3D
