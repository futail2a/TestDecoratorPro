package RTC;

/**
* RTC/AngularVelocity3DHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

public final class AngularVelocity3DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.AngularVelocity3D value = null;

  public AngularVelocity3DHolder ()
  {
  }

  public AngularVelocity3DHolder (RTC.AngularVelocity3D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.AngularVelocity3DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.AngularVelocity3DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.AngularVelocity3DHelper.type ();
  }

}
