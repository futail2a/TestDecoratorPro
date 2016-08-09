package RTC;


/**
* RTC/RangeData.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/

public final class RangeData implements org.omg.CORBA.portable.IDLEntity
{

  /// Time stamp.
  public RTC.Time tm = null;

  /// Range values in metres.
  public double ranges[] = null;

  /// Geometry of the ranger at the time the scan data was measured.
  public RTC.RangerGeometry geometry = null;

  /// Configuration of the ranger at the time the scan data was measured.
  public RTC.RangerConfig config = null;

  public RangeData ()
  {
  } // ctor

  public RangeData (RTC.Time _tm, double[] _ranges, RTC.RangerGeometry _geometry, RTC.RangerConfig _config)
  {
    tm = _tm;
    ranges = _ranges;
    geometry = _geometry;
    config = _config;
  } // ctor

} // class RangeData
