package RTC;

/**
* RTC/Covariance3DHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

public final class Covariance3DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.Covariance3D value = null;

  public Covariance3DHolder ()
  {
  }

  public Covariance3DHolder (RTC.Covariance3D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.Covariance3DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.Covariance3DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.Covariance3DHelper.type ();
  }

}
