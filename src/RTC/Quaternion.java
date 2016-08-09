package RTC;


/**
* RTC/Quaternion.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

public final class Quaternion implements org.omg.CORBA.portable.IDLEntity
{
  public double x = (double)0;
  public double y = (double)0;
  public double z = (double)0;
  public double w = (double)0;

  public Quaternion ()
  {
  } // ctor

  public Quaternion (double _x, double _y, double _z, double _w)
  {
    x = _x;
    y = _y;
    z = _z;
    w = _w;
  } // ctor

} // class Quaternion
