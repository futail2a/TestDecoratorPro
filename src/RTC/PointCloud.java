package RTC;


/**
* RTC/PointCloud.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/

public final class PointCloud implements org.omg.CORBA.portable.IDLEntity
{

  /// Time stamp.
  public RTC.Time tm = null;

  /// The points in the cloud.
  public RTC.PointCloudPoint points[] = null;

  public PointCloud ()
  {
  } // ctor

  public PointCloud (RTC.Time _tm, RTC.PointCloudPoint[] _points)
  {
    tm = _tm;
    points = _points;
  } // ctor

} // class PointCloud
