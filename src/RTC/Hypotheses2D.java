package RTC;


/**
* RTC/Hypotheses2D.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/

public final class Hypotheses2D implements org.omg.CORBA.portable.IDLEntity
{

  /// Time stamp.
  public RTC.Time tm = null;

  /// List of hypotheses.
  public RTC.Hypothesis2D hypotheses[] = null;

  public Hypotheses2D ()
  {
  } // ctor

  public Hypotheses2D (RTC.Time _tm, RTC.Hypothesis2D[] _hypotheses)
  {
    tm = _tm;
    hypotheses = _hypotheses;
  } // ctor

} // class Hypotheses2D
