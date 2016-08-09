package RTC;


/**
* RTC/GPSData.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/

public final class GPSData implements org.omg.CORBA.portable.IDLEntity
{

  /// Time stamp.
  public RTC.Time tm = null;

  /// GPS time, according to the device.
  public RTC.GPSTime timeFromGPS = null;

  /// Latitude in degrees.
  public double latitude = (double)0;

  /// Longitude in degrees.
  public double longitude = (double)0;

  /// Altitude above the ellisoid in metres.
  public double altitude = (double)0;

  /// One standard deviation in the horizontal position error, in metres.
  public double horizontalError = (double)0;

  /// One standard deviation in the vertical position error, in metres.
  public double verticalError = (double)0;

  /// Estimated heading from true north in radians.
  public double heading = (double)0;

  /// Estimated horizontal speed in metres per second.
  public double horizontalSpeed = (double)0;

  /// Estimated vertical speed in metres per second.
  public double verticalSpeed = (double)0;

  /// Number of satellites in view.
  public short numSatellites = (short)0;

  /// The type of position fix this is.
  public RTC.GPSFixType fixType = null;

  public GPSData ()
  {
  } // ctor

  public GPSData (RTC.Time _tm, RTC.GPSTime _timeFromGPS, double _latitude, double _longitude, double _altitude, double _horizontalError, double _verticalError, double _heading, double _horizontalSpeed, double _verticalSpeed, short _numSatellites, RTC.GPSFixType _fixType)
  {
    tm = _tm;
    timeFromGPS = _timeFromGPS;
    latitude = _latitude;
    longitude = _longitude;
    altitude = _altitude;
    horizontalError = _horizontalError;
    verticalError = _verticalError;
    heading = _heading;
    horizontalSpeed = _horizontalSpeed;
    verticalSpeed = _verticalSpeed;
    numSatellites = _numSatellites;
    fixType = _fixType;
  } // ctor

} // class GPSData
