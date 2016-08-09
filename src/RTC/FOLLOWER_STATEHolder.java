package RTC;

/**
* RTC/FOLLOWER_STATEHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/MobileRobot.idlから
* 2016年8月9日 12時30分07秒 JST
*/

public final class FOLLOWER_STATEHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.FOLLOWER_STATE value = null;

  public FOLLOWER_STATEHolder ()
  {
  }

  public FOLLOWER_STATEHolder (RTC.FOLLOWER_STATE initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.FOLLOWER_STATEHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.FOLLOWER_STATEHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.FOLLOWER_STATEHelper.type ();
  }

}
