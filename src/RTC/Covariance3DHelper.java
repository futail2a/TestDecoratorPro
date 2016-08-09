package RTC;


/**
* RTC/Covariance3DHelper.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

abstract public class Covariance3DHelper
{
  private static String  _id = "IDL:RTC/Covariance3D:1.0";

  public static void insert (org.omg.CORBA.Any a, RTC.Covariance3D that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static RTC.Covariance3D extract (org.omg.CORBA.Any a)
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
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [21];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_double);
          _members0[0] = new org.omg.CORBA.StructMember (
            "xx",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_double);
          _members0[1] = new org.omg.CORBA.StructMember (
            "xy",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_double);
          _members0[2] = new org.omg.CORBA.StructMember (
            "xz",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_double);
          _members0[3] = new org.omg.CORBA.StructMember (
            "xr",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_double);
          _members0[4] = new org.omg.CORBA.StructMember (
            "xp",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_double);
          _members0[5] = new org.omg.CORBA.StructMember (
            "xa",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_double);
          _members0[6] = new org.omg.CORBA.StructMember (
            "yy",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_double);
          _members0[7] = new org.omg.CORBA.StructMember (
            "yz",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_double);
          _members0[8] = new org.omg.CORBA.StructMember (
            "yr",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_double);
          _members0[9] = new org.omg.CORBA.StructMember (
            "yp",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_double);
          _members0[10] = new org.omg.CORBA.StructMember (
            "ya",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_double);
          _members0[11] = new org.omg.CORBA.StructMember (
            "zz",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_double);
          _members0[12] = new org.omg.CORBA.StructMember (
            "zr",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_double);
          _members0[13] = new org.omg.CORBA.StructMember (
            "zp",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_double);
          _members0[14] = new org.omg.CORBA.StructMember (
            "za",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_double);
          _members0[15] = new org.omg.CORBA.StructMember (
            "rr",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_double);
          _members0[16] = new org.omg.CORBA.StructMember (
            "rp",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_double);
          _members0[17] = new org.omg.CORBA.StructMember (
            "ra",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_double);
          _members0[18] = new org.omg.CORBA.StructMember (
            "pp",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_double);
          _members0[19] = new org.omg.CORBA.StructMember (
            "pa",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_double);
          _members0[20] = new org.omg.CORBA.StructMember (
            "aa",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (RTC.Covariance3DHelper.id (), "Covariance3D", _members0);
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

  public static RTC.Covariance3D read (org.omg.CORBA.portable.InputStream istream)
  {
    RTC.Covariance3D value = new RTC.Covariance3D ();
    value.xx = istream.read_double ();
    value.xy = istream.read_double ();
    value.xz = istream.read_double ();
    value.xr = istream.read_double ();
    value.xp = istream.read_double ();
    value.xa = istream.read_double ();
    value.yy = istream.read_double ();
    value.yz = istream.read_double ();
    value.yr = istream.read_double ();
    value.yp = istream.read_double ();
    value.ya = istream.read_double ();
    value.zz = istream.read_double ();
    value.zr = istream.read_double ();
    value.zp = istream.read_double ();
    value.za = istream.read_double ();
    value.rr = istream.read_double ();
    value.rp = istream.read_double ();
    value.ra = istream.read_double ();
    value.pp = istream.read_double ();
    value.pa = istream.read_double ();
    value.aa = istream.read_double ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, RTC.Covariance3D value)
  {
    ostream.write_double (value.xx);
    ostream.write_double (value.xy);
    ostream.write_double (value.xz);
    ostream.write_double (value.xr);
    ostream.write_double (value.xp);
    ostream.write_double (value.xa);
    ostream.write_double (value.yy);
    ostream.write_double (value.yz);
    ostream.write_double (value.yr);
    ostream.write_double (value.yp);
    ostream.write_double (value.ya);
    ostream.write_double (value.zz);
    ostream.write_double (value.zr);
    ostream.write_double (value.zp);
    ostream.write_double (value.za);
    ostream.write_double (value.rr);
    ostream.write_double (value.rp);
    ostream.write_double (value.ra);
    ostream.write_double (value.pp);
    ostream.write_double (value.pa);
    ostream.write_double (value.aa);
  }

}
