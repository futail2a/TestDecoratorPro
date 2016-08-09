package RTC;

/**
* RTC/Size3DHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

public final class Size3DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.Size3D value = null;

  public Size3DHolder ()
  {
  }

  public Size3DHolder (RTC.Size3D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.Size3DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.Size3DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.Size3DHelper.type ();
  }

}
