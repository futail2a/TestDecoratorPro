package RTC;


/**
* RTC/FiducialFOV.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/

public final class FiducialFOV implements org.omg.CORBA.portable.IDLEntity
{

  /// Minimum range in metres at which fiducials can be detected.
  public double minRange = (double)0;

  /// Maximum range in metres at which fiducials can be detected.
  public double maxRange = (double)0;

  /// Receptive angle in radians of the sensor (centred about the forward direction).
  public double viewAngle = (double)0;

  public FiducialFOV ()
  {
  } // ctor

  public FiducialFOV (double _minRange, double _maxRange, double _viewAngle)
  {
    minRange = _minRange;
    maxRange = _maxRange;
    viewAngle = _viewAngle;
  } // ctor

} // class FiducialFOV
