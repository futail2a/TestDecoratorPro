package RTC;


/**
* RTC/Time.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/BasicDataType.idlから
* 2016年8月9日 12時30分07秒 JST
*/

public final class Time implements org.omg.CORBA.portable.IDLEntity
{
  public int sec = (int)0;

  // sec
  public int nsec = (int)0;

  public Time ()
  {
  } // ctor

  public Time (int _sec, int _nsec)
  {
    sec = _sec;
    nsec = _nsec;
  } // ctor

} // class Time
