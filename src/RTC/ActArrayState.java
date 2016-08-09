package RTC;


/**
* RTC/ActArrayState.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/

public final class ActArrayState implements org.omg.CORBA.portable.IDLEntity
{

  /// Time stamp.
  public RTC.Time tm = null;

  /// Sequence of actuator states, one for each actuator.
  public RTC.Actuator actuators[] = null;

  public ActArrayState ()
  {
  } // ctor

  public ActArrayState (RTC.Time _tm, RTC.Actuator[] _actuators)
  {
    tm = _tm;
    actuators = _actuators;
  } // ctor

} // class ActArrayState
