package RTC;


/**
* RTC/PointCovariance2D.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

public final class PointCovariance2D implements org.omg.CORBA.portable.IDLEntity
{

  /// (0, 0) value of the covariance matrix.
  public double xx = (double)0;

  /// (0, 1) value of the covariance matrix.
  public double xy = (double)0;

  /// (1, 1) value of the covariance matrix.
  public double yy = (double)0;

  public PointCovariance2D ()
  {
  } // ctor

  public PointCovariance2D (double _xx, double _xy, double _yy)
  {
    xx = _xx;
    xy = _xy;
    yy = _yy;
  } // ctor

} // class PointCovariance2D
