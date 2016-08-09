package RTC;


/**
* RTC/Path3D.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/

public final class Path3D implements org.omg.CORBA.portable.IDLEntity
{

  /// Time stamp.
  public RTC.Time tm = null;

  /// The sequence of waypoints that make up the path.
  public RTC.Waypoint3D waypoints[] = null;

  public Path3D ()
  {
  } // ctor

  public Path3D (RTC.Time _tm, RTC.Waypoint3D[] _waypoints)
  {
    tm = _tm;
    waypoints = _waypoints;
  } // ctor

} // class Path3D
