package RTC;


/**
* RTC/Covariance3D.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

public final class Covariance3D implements org.omg.CORBA.portable.IDLEntity
{

  /// (0, 0) value of the covariance matrix.
  public double xx = (double)0;

  /// (0, 1) value of the covariance matrix.
  public double xy = (double)0;

  /// (0, 2) value of the covariance matrix.
  public double xz = (double)0;

  /// (0, 3) value of the covariance matrix.
  public double xr = (double)0;

  /// (0, 4) value of the covariance matrix.
  public double xp = (double)0;

  /// (0, 5) value of the covariance matrix.
  public double xa = (double)0;

  /// (1, 1) value of the covariance matrix.
  public double yy = (double)0;

  /// (1, 2) value of the covariance matrix.
  public double yz = (double)0;

  /// (1, 3) value of the covariance matrix.
  public double yr = (double)0;

  /// (1, 4) value of the covariance matrix.
  public double yp = (double)0;

  /// (1, 5) value of the covariance matrix.
  public double ya = (double)0;

  /// (2, 2) value of the covariance matrix.
  public double zz = (double)0;

  /// (2, 3) value of the covariance matrix.
  public double zr = (double)0;

  /// (2, 4) value of the covariance matrix.
  public double zp = (double)0;

  /// (2, 5) value of the covariance matrix.
  public double za = (double)0;

  /// (3, 3) value of the covariance matrix.
  public double rr = (double)0;

  /// (3, 4) value of the covariance matrix.
  public double rp = (double)0;

  /// (3, 5) value of the covariance matrix.
  public double ra = (double)0;

  /// (4, 4) value of the covariance matrix.
  public double pp = (double)0;

  /// (4, 5) value of the covariance matrix.
  public double pa = (double)0;

  /// (5, 5) value of the covariance matrix.
  public double aa = (double)0;

  public Covariance3D ()
  {
  } // ctor

  public Covariance3D (double _xx, double _xy, double _xz, double _xr, double _xp, double _xa, double _yy, double _yz, double _yr, double _yp, double _ya, double _zz, double _zr, double _zp, double _za, double _rr, double _rp, double _ra, double _pp, double _pa, double _aa)
  {
    xx = _xx;
    xy = _xy;
    xz = _xz;
    xr = _xr;
    xp = _xp;
    xa = _xa;
    yy = _yy;
    yz = _yz;
    yr = _yr;
    yp = _yp;
    ya = _ya;
    zz = _zz;
    zr = _zr;
    zp = _zp;
    za = _za;
    rr = _rr;
    rp = _rp;
    ra = _ra;
    pp = _pp;
    pa = _pa;
    aa = _aa;
  } // ctor

} // class Covariance3D
