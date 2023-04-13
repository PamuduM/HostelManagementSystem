package lk.ijse.d24.bo.custom.impl;

import lk.ijse.d24.bo.custom.RoomBO;
import lk.ijse.d24.dao.DaoFactory;
import lk.ijse.d24.dao.DaoType;
import lk.ijse.d24.dao.custom.RoomDAO;
import lk.ijse.d24.dao.custom.StudentDAO;
import lk.ijse.d24.dto.RoomDTO;
import lk.ijse.d24.dto.StudentDTO;
import lk.ijse.d24.entity.Room;
import lk.ijse.d24.entity.Student;


public class RoomBOimpl implements RoomBO {

    RoomDAO roomDAO = (RoomDAO) DaoFactory.getInstance().getDAO(DaoType.ROOM);

    @Override
    public RoomDTO getRoom(String id) {

        Room room = roomDAO.search(id);
        return new RoomDTO(
                room.getId(),
                room.getRoomType(),
                room.getKeyMoney(),
                room.getQty()
        );
    }

    @Override
    public boolean addRoom(RoomDTO roomDTO) {
       return roomDAO.add(new Room(
               roomDTO.getId(),
               roomDTO.getRoomType(),
               roomDTO.getKeyMoney(),
               roomDTO.getQty()
        ));

    }

    @Override
    public boolean updateRoom(RoomDTO roomDTO) {
       return roomDAO.update(new Room(
               roomDTO.getId(),
               roomDTO.getRoomType(),
               roomDTO.getKeyMoney(),
               roomDTO.getQty()
       ));

    }

    @Override
    public boolean deleteRoom(String id) {
       return roomDAO.delete(id);
    }
}
