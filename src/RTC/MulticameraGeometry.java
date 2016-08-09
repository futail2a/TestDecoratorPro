package RTC;


/**
* RTC/MulticameraGeometry.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/

public final class MulticameraGeometry implements org.omg.CORBA.portable.IDLEntity
{

  /// Overall geometry of the camera system.
  public RTC.Geometry3D geometry = null;

  /// Geometry of each camera.
  public RTC.Geometry3D cameraGeometries[] = null;

  public MulticameraGeometry ()
  {
  } // ctor

  public MulticameraGeometry (RTC.Geometry3D _geometry, RTC.Geometry3D[] _cameraGeometries)
  {
    geometry = _geometry;
    cameraGeometries = _cameraGeometries;
  } // ctor

} // class MulticameraGeometry
