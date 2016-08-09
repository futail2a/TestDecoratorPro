package RTC;

/**
* RTC/TimedSize3DHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��9�� 12��30��08�b JST
*/

public final class TimedSize3DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.TimedSize3D value = null;

  public TimedSize3DHolder ()
  {
  }

  public TimedSize3DHolder (RTC.TimedSize3D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.TimedSize3DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.TimedSize3DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.TimedSize3DHelper.type ();
  }

}