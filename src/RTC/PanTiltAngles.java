package RTC;


/**
* RTC/PanTiltAngles.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/

public final class PanTiltAngles implements org.omg.CORBA.portable.IDLEntity
{

  /// Time stamp.
  public RTC.Time tm = null;

  /// Pan value in radians.
  public double pan = (double)0;

  /// Tilt value in radians.
  public double tilt = (double)0;

  public PanTiltAngles ()
  {
  } // ctor

  public PanTiltAngles (RTC.Time _tm, double _pan, double _tilt)
  {
    tm = _tm;
    pan = _pan;
    tilt = _tilt;
  } // ctor

} // class PanTiltAngles
