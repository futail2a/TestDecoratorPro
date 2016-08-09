package RTC;


/**
* RTC/ActArrayActuatorCurrent.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/

public final class ActArrayActuatorCurrent implements org.omg.CORBA.portable.IDLEntity
{

  /// Time stamp.
  public RTC.Time tm = null;

  /// Zero-based index of the actuator.
  public short index = (short)0;

  /// Current of the actuator in amps.
  public double current = (double)0;

  public ActArrayActuatorCurrent ()
  {
  } // ctor

  public ActArrayActuatorCurrent (RTC.Time _tm, short _index, double _current)
  {
    tm = _tm;
    index = _index;
    current = _current;
  } // ctor

} // class ActArrayActuatorCurrent
