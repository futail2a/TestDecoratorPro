package RTC;


/**
* RTC/RangerGeometry.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/

public final class RangerGeometry implements org.omg.CORBA.portable.IDLEntity
{

  /// Overall geometry of the ranger device, such as the centroid of an array of sonar sensors.
  public RTC.Geometry3D geometry = null;

  /// measured from each of these.
  public RTC.Geometry3D elementGeometries[] = null;

  public RangerGeometry ()
  {
  } // ctor

  public RangerGeometry (RTC.Geometry3D _geometry, RTC.Geometry3D[] _elementGeometries)
  {
    geometry = _geometry;
    elementGeometries = _elementGeometries;
  } // ctor

} // class RangerGeometry
