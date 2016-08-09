package RTC;

/**
* RTC/Vector3DHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

public final class Vector3DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.Vector3D value = null;

  public Vector3DHolder ()
  {
  }

  public Vector3DHolder (RTC.Vector3D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.Vector3DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.Vector3DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.Vector3DHelper.type ();
  }

}
