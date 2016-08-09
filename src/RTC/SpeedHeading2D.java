package RTC;


/**
* RTC/SpeedHeading2D.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

public final class SpeedHeading2D implements org.omg.CORBA.portable.IDLEntity
{

  /// Speed in metres per second.
  public double speed = (double)0;

  /// Direction of travel in radians from the x axis.
  public double heading = (double)0;

  public SpeedHeading2D ()
  {
  } // ctor

  public SpeedHeading2D (double _speed, double _heading)
  {
    speed = _speed;
    heading = _heading;
  } // ctor

} // class SpeedHeading2D
