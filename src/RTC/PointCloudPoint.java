package RTC;


/**
* RTC/PointCloudPoint.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/

public final class PointCloudPoint implements org.omg.CORBA.portable.IDLEntity
{

  /// The position of the point.
  public RTC.Point3D point = null;

  /// The colour of the point, if any.
  public RTC.RGBColour colour = null;

  public PointCloudPoint ()
  {
  } // ctor

  public PointCloudPoint (RTC.Point3D _point, RTC.RGBColour _colour)
  {
    point = _point;
    colour = _colour;
  } // ctor

} // class PointCloudPoint
