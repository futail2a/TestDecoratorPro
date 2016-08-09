package RTC;


/**
* RTC/GripperGeometry.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/

public final class GripperGeometry implements org.omg.CORBA.portable.IDLEntity
{

  /// Geometry of the exterior of the gripper when open, in parent coordinate space.
  public RTC.Geometry3D exterior = null;

  /// Geometry of the interior of the gripper when open, in gripper coordinate space.
  public RTC.Geometry3D interior = null;

  public GripperGeometry ()
  {
  } // ctor

  public GripperGeometry (RTC.Geometry3D _exterior, RTC.Geometry3D _interior)
  {
    exterior = _exterior;
    interior = _interior;
  } // ctor

} // class GripperGeometry
