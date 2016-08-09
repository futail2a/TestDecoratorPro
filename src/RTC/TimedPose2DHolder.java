package RTC;

/**
* RTC/TimedPose2DHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

public final class TimedPose2DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.TimedPose2D value = null;

  public TimedPose2DHolder ()
  {
  }

  public TimedPose2DHolder (RTC.TimedPose2D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.TimedPose2DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.TimedPose2DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.TimedPose2DHelper.type ();
  }

}
