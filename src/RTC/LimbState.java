package RTC;


/**
* RTC/LimbState.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/

public final class LimbState implements org.omg.CORBA.portable.IDLEntity
{

  /// Time stamp.
  public RTC.Time tm = null;

  /// Orientation, approach and position of the end-effector.
  public RTC.OAP oapMatrix = null;

  /// Current status of the limb.
  public RTC.LimbStatus status = null;

  public LimbState ()
  {
  } // ctor

  public LimbState (RTC.Time _tm, RTC.OAP _oapMatrix, RTC.LimbStatus _status)
  {
    tm = _tm;
    oapMatrix = _oapMatrix;
    status = _status;
  } // ctor

} // class LimbState
