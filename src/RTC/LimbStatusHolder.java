package RTC;

/**
* RTC/LimbStatusHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/


/*!
     * @enum LimbStatus
     */
public final class LimbStatusHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.LimbStatus value = null;

  public LimbStatusHolder ()
  {
  }

  public LimbStatusHolder (RTC.LimbStatus initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.LimbStatusHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.LimbStatusHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.LimbStatusHelper.type ();
  }

}
