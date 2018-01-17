package cn.happysoul.douyu.douyuClient;

import cn.happysoul.douyu.beans.DyMessage;
import cn.happysoul.douyu.beans.RoomInfo;

public interface DyMessageListener {
	void onReceiveMessage(DyMessage dyMessage);
	void onReceiveRoomInfo(RoomInfo info);
	void onException(Exception e);
	void onReceiveError(int roomId);
}
