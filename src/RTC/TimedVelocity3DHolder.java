package RTC;

/**
* RTC/TimedVelocity3DHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��9�� 12��30��08�b JST
*/

public final class TimedVelocity3DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.TimedVelocity3D value = null;

  public TimedVelocity3DHolder ()
  {
  }

  public TimedVelocity3DHolder (RTC.TimedVelocity3D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.TimedVelocity3DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.TimedVelocity3DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.TimedVelocity3DHelper.type ();
  }

}