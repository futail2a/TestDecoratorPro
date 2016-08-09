package RTC;


/**
* RTC/BumperGeometry.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/

public final class BumperGeometry implements org.omg.CORBA.portable.IDLEntity
{

  /// Pose of the bumper's base point in the array's coordinate space.
  public RTC.Pose3D pose = null;

  /// Size of the bumper.
  public RTC.Size3D size = null;

  /// Radius of curvature of the bump sensor in metres. Zero if the bumper is a straight line.
  public double roc = (double)0;

  public BumperGeometry ()
  {
  } // ctor

  public BumperGeometry (RTC.Pose3D _pose, RTC.Size3D _size, double _roc)
  {
    pose = _pose;
    size = _size;
    roc = _roc;
  } // ctor

} // class BumperGeometry
