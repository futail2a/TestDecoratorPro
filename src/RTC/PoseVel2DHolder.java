package RTC;

/**
* RTC/PoseVel2DHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

public final class PoseVel2DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.PoseVel2D value = null;

  public PoseVel2DHolder ()
  {
  }

  public PoseVel2DHolder (RTC.PoseVel2D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.PoseVel2DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.PoseVel2DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.PoseVel2DHelper.type ();
  }

}
