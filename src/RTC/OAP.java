package RTC;


/**
* RTC/OAP.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

public final class OAP implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Vector3D orientation = null;
  public RTC.Vector3D approach = null;
  public RTC.Vector3D position = null;

  public OAP ()
  {
  } // ctor

  public OAP (RTC.Vector3D _orientation, RTC.Vector3D _approach, RTC.Vector3D _position)
  {
    orientation = _orientation;
    approach = _approach;
    position = _position;
  } // ctor

} // class OAP
