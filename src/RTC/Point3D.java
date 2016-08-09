package RTC;


/**
* RTC/Point3D.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

public final class Point3D implements org.omg.CORBA.portable.IDLEntity
{

  /// X coordinate in metres.
  public double x = (double)0;

  /// Y coordinate in metres.
  public double y = (double)0;

  /// Z coordinate in metres.
  public double z = (double)0;

  public Point3D ()
  {
  } // ctor

  public Point3D (double _x, double _y, double _z)
  {
    x = _x;
    y = _y;
    z = _z;
  } // ctor

} // class Point3D
