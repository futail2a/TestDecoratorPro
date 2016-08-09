package RTC;

/**
* RTC/Point3DHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

public final class Point3DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.Point3D value = null;

  public Point3DHolder ()
  {
  }

  public Point3DHolder (RTC.Point3D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.Point3DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.Point3DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.Point3DHelper.type ();
  }

}
