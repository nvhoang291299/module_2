package Casestudy.repository.impl;

import Casestudy.common.WriteFileFacility;
import Casestudy.model.Room;
import Casestudy.model.Villa;
import Casestudy.repository.IRoomRepository;

public class RoomRepository implements IRoomRepository {
    @Override
    public void createRoom(Room room) {
        WriteFileFacility.write("src/Casestudy/data/facility.csv", room.toCSV());
    }
}
