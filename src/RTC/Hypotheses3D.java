package RTC;


/**
* RTC/Hypotheses3D.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/

public final class Hypotheses3D implements org.omg.CORBA.portable.IDLEntity
{

  /// Time stamp.
  public RTC.Time tm = null;

  /// List of hypotheses.
  public RTC.Hypothesis3D hypotheses[] = null;

  public Hypotheses3D ()
  {
  } // ctor

  public Hypotheses3D (RTC.Time _tm, RTC.Hypothesis3D[] _hypotheses)
  {
    tm = _tm;
    hypotheses = _hypotheses;
  } // ctor

} // class Hypotheses3D
