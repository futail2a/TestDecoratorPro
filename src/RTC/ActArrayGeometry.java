package RTC;


/**
* RTC/ActArrayGeometry.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/

public final class ActArrayGeometry implements org.omg.CORBA.portable.IDLEntity
{

  /// Geometry of the overall array.
  public RTC.Geometry3D arrayGeometry = null;

  /// Geometry of the individual actuators.
  public RTC.ActArrayActuatorGeometry actuatorGeometry[] = null;

  public ActArrayGeometry ()
  {
  } // ctor

  public ActArrayGeometry (RTC.Geometry3D _arrayGeometry, RTC.ActArrayActuatorGeometry[] _actuatorGeometry)
  {
    arrayGeometry = _arrayGeometry;
    actuatorGeometry = _actuatorGeometry;
  } // ctor

} // class ActArrayGeometry
