package RTC;


/**
* RTC/PoseFeature.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/

public final class PoseFeature implements org.omg.CORBA.portable.IDLEntity
{

  /// Probability of the feature.
  public double probability = (double)0;

  /// Pose of the feature.
  public RTC.Pose2D position = null;

  /// Covariance matrix of the pose.
  public RTC.Covariance2D covariance = null;

  public PoseFeature ()
  {
  } // ctor

  public PoseFeature (double _probability, RTC.Pose2D _position, RTC.Covariance2D _covariance)
  {
    probability = _probability;
    position = _position;
    covariance = _covariance;
  } // ctor

} // class PoseFeature
