package RTC;


/**
* RTC/Pose2D.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

public final class Pose2D implements org.omg.CORBA.portable.IDLEntity
{

  /// 2D position.
  public RTC.Point2D position = null;

  /// Heading in radians.
  public double heading = (double)0;

  public Pose2D ()
  {
  } // ctor

  public Pose2D (RTC.Point2D _position, double _heading)
  {
    position = _position;
    heading = _heading;
  } // ctor

} // class Pose2D
