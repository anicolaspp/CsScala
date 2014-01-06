package System

object TimeSpan
{
  val MaxValue = new TimeSpan(922337203685477L);
  val MinValue = new TimeSpan(-922337203685477L);
  val Zero = new TimeSpan(0);
  
  def FromTicks(ticks:Long):TimeSpan = 
  {
    return new TimeSpan(ticks / 10000);
  }
  def FromMilliseconds(mills:Double):TimeSpan = 
  {
    return new TimeSpan(mills.toLong);
  }
  def FromMillisecondsL(mills:Long):TimeSpan = 
  {
    return new TimeSpan(mills);
  }
  def FromSeconds(secs:Double):TimeSpan = 
  {
    return new TimeSpan((secs * 1000).toLong);
  }
  def FromMinutes(mins:Double):TimeSpan = 
  {
    return new TimeSpan((mins * 60000).toLong);
  }
  def FromHours(hours:Double):TimeSpan = 
  {
    return new TimeSpan((hours * 3600000).toLong);
  }
  def FromDays(days:Double):TimeSpan = 
  {
    return new TimeSpan((days * 86400000).toLong);
  }
  def FromYears(years:Double):TimeSpan = 
  {
    return new TimeSpan((years * 3.15569e10).toLong);
  }
}

class TimeSpan(mills:Long = 0)
{
  val TotalMillisecondsL:Long = mills;
  
  override def toString():String =
  {
    return TotalMillisecondsL + "ms";
  }

  def Ticks:Long =
  {
    return TotalMillisecondsL * 10000;
  }
  def TotalMilliseconds:Double =
  {
    return TotalMillisecondsL;
  }
  def TotalSeconds:Double = 
  {
    return TotalMillisecondsL / 1000.0;
  }
  def TotalMinutes:Double = 
  {
    return TotalMillisecondsL / 60000.0;
  }
  def TotalHours:Double = 
  {
    return TotalMillisecondsL / 3600000.0;
  }
  def TotalDays:Double = 
  {
    return TotalMillisecondsL / 86400000.0;
  }

  
  def Days:Int = 
  {
    return (TotalMillisecondsL / 86400000).toInt;
  }
  def Hours:Int = 
  {
    return (TotalMillisecondsL / 3600000).toInt;
  }
  def Minutes:Int = 
  {
    return (TotalMillisecondsL / 60000).toInt;
  }
  def Seconds:Int = 
  {
    return (TotalMillisecondsL / 1000).toInt;
  }
  
  
  def Add(span:TimeSpan):TimeSpan =
  {
    return new TimeSpan(TotalMillisecondsL + span.TotalMillisecondsL);
  }
  def Subtract(span:TimeSpan):TimeSpan =
  {
    return new TimeSpan(TotalMillisecondsL - span.TotalMillisecondsL);
  }
}