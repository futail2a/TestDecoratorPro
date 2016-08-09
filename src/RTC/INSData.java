package RTC;


/**
* RTC/INSData.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/

public final class INSData implements org.omg.CORBA.portable.IDLEntity
{

  /// Time stamp.
  public RTC.Time tm = null;

  /// Latitude in degrees.
  public double latitude = (double)0;

  /// Longitude in degrees.
  public double longitude = (double)0;

  /// Altitude in metres.
  public double altitude = (double)0;

  /// Height above mean sea level in metres.
  public double heightAMSL = (double)0;

  /// Velocity east/north/up.
  public RTC.Velocity3D velocityENU = null;

  /// Orientation, where east is 0.
  public RTC.Orientation3D orientation = null;

  public INSData ()
  {
  } // ctor

  public INSData (RTC.Time _tm, double _latitude, double _longitude, double _altitude, double _heightAMSL, RTC.Velocity3D _velocityENU, RTC.Orientation3D _orientation)
  {
    tm = _tm;
    latitude = _latitude;
    longitude = _longitude;
    altitude = _altitude;
    heightAMSL = _heightAMSL;
    velocityENU = _velocityENU;
    orientation = _orientation;
  } // ctor

} // class INSData
