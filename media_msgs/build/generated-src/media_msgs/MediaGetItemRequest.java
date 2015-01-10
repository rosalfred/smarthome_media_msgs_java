package media_msgs;

public interface MediaGetItemRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "media_msgs/MediaGetItemRequest";
  static final java.lang.String _DEFINITION = "MediaItem item\n";
  media_msgs.MediaItem getItem();
  void setItem(media_msgs.MediaItem value);
}
