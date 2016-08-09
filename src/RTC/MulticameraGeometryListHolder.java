package RTC;


/**
* RTC/MulticameraGeometryListHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��9�� 12��30��09�b JST
*/


/*!
     * @typedef MulticameraGeometryList
     */
public final class MulticameraGeometryListHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.Geometry3D value[] = null;

  public MulticameraGeometryListHolder ()
  {
  }

  public MulticameraGeometryListHolder (RTC.Geometry3D[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.MulticameraGeometryListHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.MulticameraGeometryListHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.MulticameraGeometryListHelper.type ();
  }

}