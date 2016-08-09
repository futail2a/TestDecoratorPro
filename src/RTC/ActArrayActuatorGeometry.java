package RTC;


/**
* RTC/ActArrayActuatorGeometry.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/

public final class ActArrayActuatorGeometry implements org.omg.CORBA.portable.IDLEntity
{

  /// Type of the actuator.
  public RTC.ActArrayActuatorType type = null;

  /// length when at 0 position.
  public double length = (double)0;

  /// next actuator).
  public RTC.Orientation3D orientation = null;

  /// The axis of rotation for this actuator if it is rotary, or axis along which it moves if it is linear.
  public RTC.Vector3D axis = null;

  /// Minimum range of motion of the actuator, in metres or radians.
  public double minRange = (double)0;

  /// Centre point of the actuator's range of motion, in metres or radians.
  public double centre = (double)0;

  /// Maximum range of motion of the actuator, in metres or radians.
  public double maxRange = (double)0;

  /// Home position of the actuator, in metres or radians.
  public double homePosition = (double)0;

  /// True if the actuator has brakes.
  public boolean hasBrakes = false;

  public ActArrayActuatorGeometry ()
  {
  } // ctor

  public ActArrayActuatorGeometry (RTC.ActArrayActuatorType _type, double _length, RTC.Orientation3D _orientation, RTC.Vector3D _axis, double _minRange, double _centre, double _maxRange, double _homePosition, boolean _hasBrakes)
  {
    type = _type;
    length = _length;
    orientation = _orientation;
    axis = _axis;
    minRange = _minRange;
    centre = _centre;
    maxRange = _maxRange;
    homePosition = _homePosition;
    hasBrakes = _hasBrakes;
  } // ctor

} // class ActArrayActuatorGeometry
