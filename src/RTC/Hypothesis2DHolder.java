package RTC;

/**
* RTC/Hypothesis2DHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��9�� 12��30��09�b JST
*/

public final class Hypothesis2DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.Hypothesis2D value = null;

  public Hypothesis2DHolder ()
  {
  }

  public Hypothesis2DHolder (RTC.Hypothesis2D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.Hypothesis2DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.Hypothesis2DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.Hypothesis2DHelper.type ();
  }

}