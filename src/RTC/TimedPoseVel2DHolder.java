package RTC;

/**
* RTC/TimedPoseVel2DHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

public final class TimedPoseVel2DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.TimedPoseVel2D value = null;

  public TimedPoseVel2DHolder ()
  {
  }

  public TimedPoseVel2DHolder (RTC.TimedPoseVel2D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.TimedPoseVel2DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.TimedPoseVel2DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.TimedPoseVel2DHelper.type ();
  }

}
