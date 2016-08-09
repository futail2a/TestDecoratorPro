package RTC;

/**
* RTC/Path3DHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/

public final class Path3DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.Path3D value = null;

  public Path3DHolder ()
  {
  }

  public Path3DHolder (RTC.Path3D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.Path3DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.Path3DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.Path3DHelper.type ();
  }

}
