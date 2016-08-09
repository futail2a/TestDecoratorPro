package RTC;


/**
* RTC/AngularAcceleration3D.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

public final class AngularAcceleration3D implements org.omg.CORBA.portable.IDLEntity
{

  /// Acceleration around the x axis, in radians per second per second.
  public double aax = (double)0;

  /// Acceleration around the y axis, in radians per second per second.
  public double aay = (double)0;

  /// Acceleration around the z axis, in radians per second per second.
  public double aaz = (double)0;

  public AngularAcceleration3D ()
  {
  } // ctor

  public AngularAcceleration3D (double _aax, double _aay, double _aaz)
  {
    aax = _aax;
    aay = _aay;
    aaz = _aaz;
  } // ctor

} // class AngularAcceleration3D
