package RTC;


/**
* RTC/Fiducials.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/

public final class Fiducials implements org.omg.CORBA.portable.IDLEntity
{

  /// Time stamp.
  public RTC.Time tm = null;

  /// List of detected fiducials.
  public RTC.FiducialInfo fiducialsList[] = null;

  public Fiducials ()
  {
  } // ctor

  public Fiducials (RTC.Time _tm, RTC.FiducialInfo[] _fiducialsList)
  {
    tm = _tm;
    fiducialsList = _fiducialsList;
  } // ctor

} // class Fiducials
