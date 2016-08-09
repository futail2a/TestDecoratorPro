package RTC;

/**
* RTC/Pose2DHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

public final class Pose2DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.Pose2D value = null;

  public Pose2DHolder ()
  {
  }

  public Pose2DHolder (RTC.Pose2D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.Pose2DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.Pose2DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.Pose2DHelper.type ();
  }

}
