package media_msgs;

public interface MediaGetItemResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "media_msgs/MediaGetItemResponse";
  static final java.lang.String _DEFINITION = "MediaItem item";
  media_msgs.MediaItem getItem();
  void setItem(media_msgs.MediaItem value);
}
