package RTC;


/**
* RTC/Size2D.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

public final class Size2D implements org.omg.CORBA.portable.IDLEntity
{

  /// Length in metres.
  public double l = (double)0;

  /// Width in metres.
  public double w = (double)0;

  public Size2D ()
  {
  } // ctor

  public Size2D (double _l, double _w)
  {
    l = _l;
    w = _w;
  } // ctor

} // class Size2D
