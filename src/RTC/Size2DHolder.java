package RTC;

/**
* RTC/Size2DHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��9�� 12��30��08�b JST
*/

public final class Size2DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.Size2D value = null;

  public Size2DHolder ()
  {
  }

  public Size2DHolder (RTC.Size2D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.Size2DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.Size2DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.Size2DHelper.type ();
  }

}