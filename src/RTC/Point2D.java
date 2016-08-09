package RTC;


/**
* RTC/Point2D.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

public final class Point2D implements org.omg.CORBA.portable.IDLEntity
{

  /// X coordinate in metres.
  public double x = (double)0;

  /// Y coordinate in metres.
  public double y = (double)0;

  public Point2D ()
  {
  } // ctor

  public Point2D (double _x, double _y)
  {
    x = _x;
    y = _y;
  } // ctor

} // class Point2D
