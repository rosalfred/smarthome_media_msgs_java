package media_msgs;

public interface MediaGetItemsRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "media_msgs/MediaGetItemsRequest";
  static final java.lang.String _DEFINITION = "MediaItem item\nint32 limitStart\nint32 limitEnd\n";
  media_msgs.MediaItem getItem();
  void setItem(media_msgs.MediaItem value);
  int getLimitStart();
  void setLimitStart(int value);
  int getLimitEnd();
  void setLimitEnd(int value);
}
