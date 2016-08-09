package RTC;


/**
* RTC/Vector3D.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

public final class Vector3D implements org.omg.CORBA.portable.IDLEntity
{

  /// X value in metres.
  public double x = (double)0;

  /// Y value in metres.
  public double y = (double)0;

  /// Z value in metres.
  public double z = (double)0;

  public Vector3D ()
  {
  } // ctor

  public Vector3D (double _x, double _y, double _z)
  {
    x = _x;
    y = _y;
    z = _z;
  } // ctor

} // class Vector3D
