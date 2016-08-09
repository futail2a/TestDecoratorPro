package RTC;

/**
* RTC/Point2DHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��9�� 12��30��08�b JST
*/

public final class Point2DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.Point2D value = null;

  public Point2DHolder ()
  {
  }

  public Point2DHolder (RTC.Point2D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.Point2DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.Point2DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.Point2DHelper.type ();
  }

}