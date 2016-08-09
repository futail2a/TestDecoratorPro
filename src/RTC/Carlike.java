package RTC;


/**
* RTC/Carlike.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

public final class Carlike implements org.omg.CORBA.portable.IDLEntity
{

  /// Speed in metres per second.
  public double speed = (double)0;

  /// Steering angle in radians.
  public double steeringAngle = (double)0;

  public Carlike ()
  {
  } // ctor

  public Carlike (double _speed, double _steeringAngle)
  {
    speed = _speed;
    steeringAngle = _steeringAngle;
  } // ctor

} // class Carlike
