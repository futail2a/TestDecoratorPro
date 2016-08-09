package RTC;


/**
* RTC/FiducialInfo.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/

public final class FiducialInfo implements org.omg.CORBA.portable.IDLEntity
{

  /// Identification number.
  public int id = (int)0;

  /// Detected pose.
  public RTC.Pose3D pose = null;

  /// Uncertainty in the pose.
  public RTC.Pose3D poseUncertainty = null;

  /// Detected size.
  public RTC.Size3D size = null;

  /// Uncertainty in the size.
  public RTC.Size3D sizeUncertainty = null;

  public FiducialInfo ()
  {
  } // ctor

  public FiducialInfo (int _id, RTC.Pose3D _pose, RTC.Pose3D _poseUncertainty, RTC.Size3D _size, RTC.Size3D _sizeUncertainty)
  {
    id = _id;
    pose = _pose;
    poseUncertainty = _poseUncertainty;
    size = _size;
    sizeUncertainty = _sizeUncertainty;
  } // ctor

} // class FiducialInfo
