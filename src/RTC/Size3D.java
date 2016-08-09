package RTC;


/**
* RTC/Size3D.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

public final class Size3D implements org.omg.CORBA.portable.IDLEntity
{

  /// Length in metres.
  public double l = (double)0;

  /// Width in metres.
  public double w = (double)0;

  /// Height in metres.
  public double h = (double)0;

  public Size3D ()
  {
  } // ctor

  public Size3D (double _l, double _w, double _h)
  {
    l = _l;
    w = _w;
    h = _h;
  } // ctor

} // class Size3D
