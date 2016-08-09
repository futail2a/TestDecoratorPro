package RTC;


/**
* RTC/GripperGeometryHelper.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��9�� 12��30��09�b JST
*/

abstract public class GripperGeometryHelper
{
  private static String  _id = "IDL:RTC/GripperGeometry:1.0";

  public static void insert (org.omg.CORBA.Any a, RTC.GripperGeometry that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static RTC.GripperGeometry extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  private static boolean __active = false;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      synchronized (org.omg.CORBA.TypeCode.class)
      {
        if (__typeCode == null)
        {
          if (__active)
          {
            return org.omg.CORBA.ORB.init().create_recursive_tc ( _id );
          }
          __active = true;
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [2];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = RTC.Geometry3DHelper.type ();
          _members0[0] = new org.omg.CORBA.StructMember (
            "exterior",
            _tcOf_members0,
            null);
          _tcOf_members0 = RTC.Geometry3DHelper.type ();
          _members0[1] = new org.omg.CORBA.StructMember (
            "interior",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (RTC.GripperGeometryHelper.id (), "GripperGeometry", _members0);
          __active = false;
        }
      }
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static RTC.GripperGeometry read (org.omg.CORBA.portable.InputStream istream)
  {
    RTC.GripperGeometry value = new RTC.GripperGeometry ();
    value.exterior = RTC.Geometry3DHelper.read (istream);
    value.interior = RTC.Geometry3DHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, RTC.GripperGeometry value)
  {
    RTC.Geometry3DHelper.write (ostream, value.exterior);
    RTC.Geometry3DHelper.write (ostream, value.interior);
  }

}