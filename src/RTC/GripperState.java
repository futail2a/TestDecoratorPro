package RTC;


/**
* RTC/GripperState.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/

public final class GripperState implements org.omg.CORBA.portable.IDLEntity
{

  /// Time stamp.
  public RTC.Time tm = null;

  /// Status of the gripper.
  public RTC.GripperStatus status = null;

  public GripperState ()
  {
  } // ctor

  public GripperState (RTC.Time _tm, RTC.GripperStatus _status)
  {
    tm = _tm;
    status = _status;
  } // ctor

} // class GripperState
