package RTC;


/**
* RTC/RFIDTagDataHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/


/*!
     * @typedef RFIDTagData
     */
public final class RFIDTagDataHolder implements org.omg.CORBA.portable.Streamable
{
  public byte value[] = null;

  public RFIDTagDataHolder ()
  {
  }

  public RFIDTagDataHolder (byte[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.RFIDTagDataHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.RFIDTagDataHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.RFIDTagDataHelper.type ();
  }

}
