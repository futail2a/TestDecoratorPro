package RTC;


/**
* RTC/Covariance2D.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

public final class Covariance2D implements org.omg.CORBA.portable.IDLEntity
{

  /// (0, 0) value of the covariance matrix.
  public double xx = (double)0;

  /// (0, 1) value of the covariance matrix.
  public double xy = (double)0;

  /// (0, 2) value of the covariance matrix.
  public double xt = (double)0;

  /// (1, 1) value of the covariance matrix.
  public double yy = (double)0;

  /// (1, 2) value of the covariance matrix.
  public double yt = (double)0;

  /// (2, 2) value of the covariance matrix.
  public double tt = (double)0;

  public Covariance2D ()
  {
  } // ctor

  public Covariance2D (double _xx, double _xy, double _xt, double _yy, double _yt, double _tt)
  {
    xx = _xx;
    xy = _xy;
    xt = _xt;
    yy = _yy;
    yt = _yt;
    tt = _tt;
  } // ctor

} // class Covariance2D
