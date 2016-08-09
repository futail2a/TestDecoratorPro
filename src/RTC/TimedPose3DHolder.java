package RTC;

/**
* RTC/TimedPose3DHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

public final class TimedPose3DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.TimedPose3D value = null;

  public TimedPose3DHolder ()
  {
  }

  public TimedPose3DHolder (RTC.TimedPose3D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.TimedPose3DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.TimedPose3DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.TimedPose3DHelper.type ();
  }

}
