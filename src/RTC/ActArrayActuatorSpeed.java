package RTC;


/**
* RTC/ActArrayActuatorSpeed.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/

public final class ActArrayActuatorSpeed implements org.omg.CORBA.portable.IDLEntity
{

  /// Time stamp.
  public RTC.Time tm = null;

  /// Zero-based index of the actuator.
  public short index = (short)0;

  /// Speed of the actuator in metres per second or radians per second.
  public double speed = (double)0;

  public ActArrayActuatorSpeed ()
  {
  } // ctor

  public ActArrayActuatorSpeed (RTC.Time _tm, short _index, double _speed)
  {
    tm = _tm;
    index = _index;
    speed = _speed;
  } // ctor

} // class ActArrayActuatorSpeed
