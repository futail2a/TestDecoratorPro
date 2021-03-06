package RTC;

/**
* RTC/QuaternionHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

public final class QuaternionHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.Quaternion value = null;

  public QuaternionHolder ()
  {
  }

  public QuaternionHolder (RTC.Quaternion initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.QuaternionHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.QuaternionHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.QuaternionHelper.type ();
  }

}
