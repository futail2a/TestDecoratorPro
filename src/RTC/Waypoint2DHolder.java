package RTC;

/**
* RTC/Waypoint2DHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/

public final class Waypoint2DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.Waypoint2D value = null;

  public Waypoint2DHolder ()
  {
  }

  public Waypoint2DHolder (RTC.Waypoint2D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.Waypoint2DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.Waypoint2DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.Waypoint2DHelper.type ();
  }

}
