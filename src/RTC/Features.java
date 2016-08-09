package RTC;


/**
* RTC/Features.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/

public final class Features implements org.omg.CORBA.portable.IDLEntity
{

  /// Time stamp.
  public RTC.Time tm = null;

  /// Point features.
  public RTC.PointFeature pointFeatures[] = null;

  /// Pose features.
  public RTC.PoseFeature poseFeatures[] = null;

  /// Line features.
  public RTC.LineFeature lineFeatures[] = null;

  public Features ()
  {
  } // ctor

  public Features (RTC.Time _tm, RTC.PointFeature[] _pointFeatures, RTC.PoseFeature[] _poseFeatures, RTC.LineFeature[] _lineFeatures)
  {
    tm = _tm;
    pointFeatures = _pointFeatures;
    poseFeatures = _poseFeatures;
    lineFeatures = _lineFeatures;
  } // ctor

} // class Features
