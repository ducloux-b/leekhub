package io.battlearena.leekhub.service.impl;

import org.springframework.stereotype.Service;

import io.battlearena.leekhub.model.entity.PlayStatus;
import io.battlearena.leekhub.service.PlayService;

@Service(value="playService")
public class PlayServiceImpl implements PlayService {

	@Override
	public PlayStatus getPlayStatus() {
		return null;
	}

}
