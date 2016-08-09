package RTC;

/**
* RTC/Waypoint3DHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/

public final class Waypoint3DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.Waypoint3D value = null;

  public Waypoint3DHolder ()
  {
  }

  public Waypoint3DHolder (RTC.Waypoint3D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.Waypoint3DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.Waypoint3DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.Waypoint3DHelper.type ();
  }

}
