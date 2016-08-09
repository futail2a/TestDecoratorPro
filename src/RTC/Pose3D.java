package RTC;


/**
* RTC/Pose3D.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

public final class Pose3D implements org.omg.CORBA.portable.IDLEntity
{

  /// 3D position.
  public RTC.Point3D position = null;

  /// 3D orientation.
  public RTC.Orientation3D orientation = null;

  public Pose3D ()
  {
  } // ctor

  public Pose3D (RTC.Point3D _position, RTC.Orientation3D _orientation)
  {
    position = _position;
    orientation = _orientation;
  } // ctor

} // class Pose3D
