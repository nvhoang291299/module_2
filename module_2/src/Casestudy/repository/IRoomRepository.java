package Casestudy.repository;

import Casestudy.model.Room;

import java.util.Map;

public interface IRoomRepository {
    Map<String, Integer> displayService();
    void createRoom(Room room);
}
