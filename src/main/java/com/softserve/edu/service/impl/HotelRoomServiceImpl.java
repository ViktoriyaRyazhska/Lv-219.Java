package com.softserve.edu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softserve.edu.dao.impl.HotelRoomDaoImpl;
import com.softserve.edu.domain.HotelRoom;
import com.softserve.edu.service.HotelRoomService;

@Service
public class HotelRoomServiceImpl implements HotelRoomService {
	@Autowired
	HotelRoomDaoImpl hotelRoomDaoImpl;

	@Override
	public void add(HotelRoom hotelRoom) {
		hotelRoomDaoImpl.add(hotelRoom);

	}

	@Override
	public void update(HotelRoom hotelRoom) {
		hotelRoomDaoImpl.update(hotelRoom);

	}

	@Override
	public HotelRoom getById(Integer id) {

		return hotelRoomDaoImpl.getById(id);
	}

	@Override
	public List<HotelRoom> getAllElements() {

		return hotelRoomDaoImpl.getAllElements();
	}

	@Override
	public void delete(HotelRoom hotelRoom) {
		hotelRoomDaoImpl.delete(hotelRoom);

	}

}
