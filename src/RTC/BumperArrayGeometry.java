package RTC;


/**
* RTC/BumperArrayGeometry.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/

public final class BumperArrayGeometry implements org.omg.CORBA.portable.IDLEntity
{

  /// Geometry of the entire array.
  public RTC.Geometry3D arrayGeometry = null;

  /// Geometry of each individual bumper.
  public RTC.BumperGeometry bumperGeometry[] = null;

  public BumperArrayGeometry ()
  {
  } // ctor

  public BumperArrayGeometry (RTC.Geometry3D _arrayGeometry, RTC.BumperGeometry[] _bumperGeometry)
  {
    arrayGeometry = _arrayGeometry;
    bumperGeometry = _bumperGeometry;
  } // ctor

} // class BumperArrayGeometry
