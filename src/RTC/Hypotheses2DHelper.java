package RTC;


/**
* RTC/Hypotheses2DHelper.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��9�� 12��30��09�b JST
*/

abstract public class Hypotheses2DHelper
{
  private static String  _id = "IDL:RTC/Hypotheses2D:1.0";

  public static void insert (org.omg.CORBA.Any a, RTC.Hypotheses2D that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static RTC.Hypotheses2D extract (org.omg.CORBA.Any a)
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
          _tcOf_members0 = RTC.TimeHelper.type ();
          _members0[0] = new org.omg.CORBA.StructMember (
            "tm",
            _tcOf_members0,
            null);
          _tcOf_members0 = RTC.Hypothesis2DHelper.type ();
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (RTC.Hypothesis2DListHelper.id (), "Hypothesis2DList", _tcOf_members0);
          _members0[1] = new org.omg.CORBA.StructMember (
            "hypotheses",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (RTC.Hypotheses2DHelper.id (), "Hypotheses2D", _members0);
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

  public static RTC.Hypotheses2D read (org.omg.CORBA.portable.InputStream istream)
  {
    RTC.Hypotheses2D value = new RTC.Hypotheses2D ();
    value.tm = RTC.TimeHelper.read (istream);
    value.hypotheses = RTC.Hypothesis2DListHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, RTC.Hypotheses2D value)
  {
    RTC.TimeHelper.write (ostream, value.tm);
    RTC.Hypothesis2DListHelper.write (ostream, value.hypotheses);
  }

}