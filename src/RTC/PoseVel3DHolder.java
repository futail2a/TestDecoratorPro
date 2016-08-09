package RTC;

/**
* RTC/PoseVel3DHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

public final class PoseVel3DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.PoseVel3D value = null;

  public PoseVel3DHolder ()
  {
  }

  public PoseVel3DHolder (RTC.PoseVel3D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.PoseVel3DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.PoseVel3DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.PoseVel3DHelper.type ();
  }

}
