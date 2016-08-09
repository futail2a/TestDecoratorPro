package RTC;

/**
* RTC/TimedPoseVel3DHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

public final class TimedPoseVel3DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.TimedPoseVel3D value = null;

  public TimedPoseVel3DHolder ()
  {
  }

  public TimedPoseVel3DHolder (RTC.TimedPoseVel3D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.TimedPoseVel3DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.TimedPoseVel3DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.TimedPoseVel3DHelper.type ();
  }

}
