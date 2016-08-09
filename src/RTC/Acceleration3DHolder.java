package RTC;

/**
* RTC/Acceleration3DHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

public final class Acceleration3DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.Acceleration3D value = null;

  public Acceleration3DHolder ()
  {
  }

  public Acceleration3DHolder (RTC.Acceleration3D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.Acceleration3DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.Acceleration3DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.Acceleration3DHelper.type ();
  }

}
