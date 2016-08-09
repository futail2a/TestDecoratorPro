package RTC;


/**
* RTC/OGMapCellsHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/


/*!
     * @typedef OGMapCells
     */
public final class OGMapCellsHolder implements org.omg.CORBA.portable.Streamable
{
  public byte value[] = null;

  public OGMapCellsHolder ()
  {
  }

  public OGMapCellsHolder (byte[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.OGMapCellsHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.OGMapCellsHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.OGMapCellsHelper.type ();
  }

}
