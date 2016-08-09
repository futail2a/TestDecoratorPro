package RTC;


/**
* RTC/Waypoint3D.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/

public final class Waypoint3D implements org.omg.CORBA.portable.IDLEntity
{

  /// Location of the waypoint.
  public RTC.Pose3D target = null;

  /// How far away from the waypoint is considered success (radius in metres).
  public double distanceTolerance = (double)0;

  /// How much off the target heading is considered success (in radians).
  public double headingTolerance = (double)0;

  /// Target time to arrive at the waypoint by.
  public RTC.Time timeLimit = null;

  /// Maximum sped to travel at while heading to the waypoint.
  public RTC.Velocity3D maxSpeed = null;

  public Waypoint3D ()
  {
  } // ctor

  public Waypoint3D (RTC.Pose3D _target, double _distanceTolerance, double _headingTolerance, RTC.Time _timeLimit, RTC.Velocity3D _maxSpeed)
  {
    target = _target;
    distanceTolerance = _distanceTolerance;
    headingTolerance = _headingTolerance;
    timeLimit = _timeLimit;
    maxSpeed = _maxSpeed;
  } // ctor

} // class Waypoint3D
