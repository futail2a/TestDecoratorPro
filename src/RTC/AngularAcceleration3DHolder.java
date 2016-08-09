package RTC;

/**
* RTC/AngularAcceleration3DHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

public final class AngularAcceleration3DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.AngularAcceleration3D value = null;

  public AngularAcceleration3DHolder ()
  {
  }

  public AngularAcceleration3DHolder (RTC.AngularAcceleration3D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.AngularAcceleration3DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.AngularAcceleration3DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.AngularAcceleration3DHelper.type ();
  }

}
