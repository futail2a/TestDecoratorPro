package RTC;


/**
* RTC/LineFeature.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/

public final class LineFeature implements org.omg.CORBA.portable.IDLEntity
{

  /// Probability of the feature.
  public double probability = (double)0;

  /// Length of the line vector in metres.
  public double rho = (double)0;

  /// Angle of the line vector from the x axis in radians.
  public double alpha = (double)0;

  /// Covariance matrix of rho and alpha.
  public RTC.PointCovariance2D covariance = null;

  /// Start point of the line segment.
  public RTC.Point2D start = null;

  /// End point of the line segment.
  public RTC.Point2D end = null;

  /// True if the start point of the line has been sighted (i.e. it is inside seen space).
  public boolean startSighted = false;

  /// True if the end point of the line has been sighted (i.e. it is inside seen space).
  public boolean endSighted = false;

  public LineFeature ()
  {
  } // ctor

  public LineFeature (double _probability, double _rho, double _alpha, RTC.PointCovariance2D _covariance, RTC.Point2D _start, RTC.Point2D _end, boolean _startSighted, boolean _endSighted)
  {
    probability = _probability;
    rho = _rho;
    alpha = _alpha;
    covariance = _covariance;
    start = _start;
    end = _end;
    startSighted = _startSighted;
    endSighted = _endSighted;
  } // ctor

} // class LineFeature
