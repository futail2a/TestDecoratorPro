package RTC;


/**
* RTC/MultiCameraImages.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/

public final class MultiCameraImages implements org.omg.CORBA.portable.IDLEntity
{

  /// Time stamp.
  public RTC.Time tm = null;

  /// Image list.
  public RTC.CameraImage images[] = null;

  public MultiCameraImages ()
  {
  } // ctor

  public MultiCameraImages (RTC.Time _tm, RTC.CameraImage[] _images)
  {
    tm = _tm;
    images = _images;
  } // ctor

} // class MultiCameraImages
