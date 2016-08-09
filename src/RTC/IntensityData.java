package RTC;


/**
* RTC/IntensityData.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/

public final class IntensityData implements org.omg.CORBA.portable.IDLEntity
{

  /// Time stamp.
  public RTC.Time tm = null;

  /// Intensity values normalised to between 0 and 1.
  public double intensities[] = null;

  /// Geometry of the ranger at the time the scan data was measured.
  public RTC.RangerGeometry geometry = null;

  /// Configuration of the ranger at the time the scan data was measured.
  public RTC.RangerConfig config = null;

  public IntensityData ()
  {
  } // ctor

  public IntensityData (RTC.Time _tm, double[] _intensities, RTC.RangerGeometry _geometry, RTC.RangerConfig _config)
  {
    tm = _tm;
    intensities = _intensities;
    geometry = _geometry;
    config = _config;
  } // ctor

} // class IntensityData
