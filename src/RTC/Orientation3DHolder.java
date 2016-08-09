package RTC;

/**
* RTC/Orientation3DHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

public final class Orientation3DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.Orientation3D value = null;

  public Orientation3DHolder ()
  {
  }

  public Orientation3DHolder (RTC.Orientation3D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.Orientation3DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.Orientation3DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.Orientation3DHelper.type ();
  }

}
