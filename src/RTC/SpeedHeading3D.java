package RTC;


/**
* RTC/SpeedHeading3D.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

public final class SpeedHeading3D implements org.omg.CORBA.portable.IDLEntity
{

  /// Speed in metres per second.
  public double speed = (double)0;

  /// Direction of travel.
  public RTC.Orientation3D direction = null;

  public SpeedHeading3D ()
  {
  } // ctor

  public SpeedHeading3D (double _speed, RTC.Orientation3D _direction)
  {
    speed = _speed;
    direction = _direction;
  } // ctor

} // class SpeedHeading3D
