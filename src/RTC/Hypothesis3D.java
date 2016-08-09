package RTC;


/**
* RTC/Hypothesis3D.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/

public final class Hypothesis3D implements org.omg.CORBA.portable.IDLEntity
{

  /// Mean of the localisation hypothesis.
  public RTC.Pose3D mean = null;

  /// Covariance matrix of the mean pose.
  public RTC.Covariance3D covariance = null;

  /// Weight of this hypothesis for mixing.
  public double weight = (double)0;

  public Hypothesis3D ()
  {
  } // ctor

  public Hypothesis3D (RTC.Pose3D _mean, RTC.Covariance3D _covariance, double _weight)
  {
    mean = _mean;
    covariance = _covariance;
    weight = _weight;
  } // ctor

} // class Hypothesis3D
