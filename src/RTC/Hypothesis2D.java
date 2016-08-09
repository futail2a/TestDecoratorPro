package RTC;


/**
* RTC/Hypothesis2D.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/

public final class Hypothesis2D implements org.omg.CORBA.portable.IDLEntity
{

  /// Mean of the localisation hypothesis.
  public RTC.Pose2D mean = null;

  /// Covariance matrix of the mean pose.
  public RTC.Covariance2D covariance = null;

  /// Weight of this hypothesis for mixing.
  public double weight = (double)0;

  public Hypothesis2D ()
  {
  } // ctor

  public Hypothesis2D (RTC.Pose2D _mean, RTC.Covariance2D _covariance, double _weight)
  {
    mean = _mean;
    covariance = _covariance;
    weight = _weight;
  } // ctor

} // class Hypothesis2D
